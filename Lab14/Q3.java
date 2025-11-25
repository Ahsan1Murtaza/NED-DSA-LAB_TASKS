import java.util.*;

public class Q3 {

    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Q3(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    // Add a directed edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    // BFS from start node
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS: ");
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

    // DFS from start node
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                dfsUtil(nbr, visited);
            }
        }
    }

    public static void main(String[] args) {
        Q3 g = new Q3(6);

        // Directed edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 5);

        System.out.println("Directed Graph Traversals from node 0:");
        g.bfs(0);
        g.dfs(0);
    }
}
