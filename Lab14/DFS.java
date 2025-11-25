
import java.util.ArrayList;

class DFS{

    int V; // Number of vertices
    ArrayList<ArrayList<Integer>> adj;

    ArrayList<Boolean> visited;

    public DFS(int v) {
        this.V = v;
        this.adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            this.adj.add(new ArrayList<>());
        }
        
    }

    public void dfs(int start) {
        System.out.print("DFS traversal");
        visited = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            visited.add(false);
        }
        dfsUtil(start);
    }

    public void dfsUtil(int node) {
        visited.set(node, true);
        System.out.print(" " + node);

        for (int neighbor : adj.get(node)) {
            if (!visited.get(neighbor)) {
                dfsUtil(neighbor);
            }
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static void main(String[] args) {
        DFS graph = new DFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.dfs(0);
    }
}