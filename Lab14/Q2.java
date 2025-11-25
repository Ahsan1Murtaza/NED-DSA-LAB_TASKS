import java.util.*;

class DFSCycleEasy {

    int V;
    ArrayList<ArrayList<Integer>> adj;
    boolean[] visited;

    public DFSCycleEasy(int v) {
        V = v;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);   // undirected graph
    }

    public boolean hasCycle() {
        visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1))  
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(int node, int parent) {
        visited[node] = true;

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node)) return true;
            } 
            else if (nei != parent) {
                return true;   // visited but not parent → cycle
            }
        }

        return false;
    }

    public static void main(String[] args) {
        DFSCycleEasy g = new DFSCycleEasy(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);  // cycle here
        g.addEdge(3, 4);

        System.out.println("Cycle Present? " + g.hasCycle());
    }
}
