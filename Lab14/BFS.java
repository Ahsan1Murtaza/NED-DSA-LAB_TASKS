
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class BFS {
    
    int V; // Number of vertices
    ArrayList<ArrayList<Integer>> adj;

    public BFS(int v) {
        this.V = v;
        this.adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            this.adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void bfs(int start) {
        ArrayList<Boolean> visited = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            visited.add(false);
        }
        Queue<Integer> queue = new LinkedList<>();

        visited.set(start, true);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adj.get(node)) {
                if (!visited.get(neighbor)) {
                    visited.set(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Breadth First Traversal starting from vertex 0:");
        graph.bfs(0);
    }

}