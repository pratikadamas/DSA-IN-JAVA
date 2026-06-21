package Graph;
import java.util.*;

public class Hascycle {


    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bfs(int start,
                        ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        visited[start] = true;
        q.offer(new Pair(start, -1));

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int node = curr.node;
            int parent = curr.parent;

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    q.offer(new Pair(neighbor, node));

                } else if (neighbor != parent) {

                    return true; // Cycle found
                }
            }
        }

        return false;
    }
}