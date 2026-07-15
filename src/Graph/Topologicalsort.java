package Graph;
import java.util.*;

class Topologicalsort {
    public int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[V];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++)
            if (!visited[i]) {
                dfs(i, st, adj, visited);
            }

        int[] result = new int[V];
        for (int i = 0; i < V; i++)
            result[i] = st.pop();

        return result;

    }

    public void dfs(int node, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
//    st.push(node);

        for (int ngr : adj.get(node)) {
            if (!visited[ngr]) {
                dfs(ngr, st, adj, visited);
            }
        }
        st.push(node);
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(3)));
        adj.add(new ArrayList<>(Arrays.asList(3)));
        adj.add(new ArrayList<>());
        Topologicalsort ts = new Topologicalsort();
        int[] result = ts.topologicalSort(4, adj);
        System.out.println(Arrays.toString(result));

    }
}