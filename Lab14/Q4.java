import java.util.*;

public class Q4 {

    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Q4(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    // Add edge with weight but weight is ignored
    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(v); // ignore weight
        adj.get(v).add(u); // comment this line if graph is directed
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS ignoring weights: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int nbr : adj.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    queue.add(nbr);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q4 g = new Q4(6);

        // Weighted edges
        g.addEdge(0, 1, 5);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 4, 7);
        g.addEdge(4, 5, 3);

        g.bfs(0);
    }
}
