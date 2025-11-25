import java.util.*;

class BFSShortestPathGlobal {

    int V;
    ArrayList<ArrayList<Integer>> adj;

    boolean[] visited; 
    int[] parent;        

    public BFSShortestPathGlobal(int v) {
        this.V = v;
        this.adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        visited = new boolean[V];
        parent  = new int[V];
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void bfs(int start) {

        
        Arrays.fill(visited, false);
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    queue.add(neighbor);
                }
            }
        }

        printAllPaths(start);
    }


    private void printAllPaths(int start) {
        System.out.println("\nShortest paths from " + start + ":");

        for (int i = 0; i < V; i++) {
            if (i == start) continue;

            System.out.print("Path to " + i + ": ");
            printPath(i);
            System.out.println();
        }
    }


    private void printPath(int v) {
        if (v == -1) return;
        printPath(parent[v]);  // recursive backtrack
        System.out.print(v + " ");
    }


    public static void main(String[] args) {

        BFSShortestPathGlobal g = new BFSShortestPathGlobal(6);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,4);
        g.addEdge(3,5);
        g.addEdge(4,5);

        g.bfs(0);
    }
}
