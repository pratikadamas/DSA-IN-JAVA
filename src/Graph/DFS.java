package Graph;

import java.util.*;

public class DFS {
    public static void main(String[] args)
    {
        LinkedList<LinkedList<Integer>> adjList = new LinkedList<>();
        adjList.add(new LinkedList<>(Arrays.asList(1, 2, 5)));
        adjList.add(new LinkedList<>(Arrays.asList(0, 3)));
        adjList.add(new LinkedList<>(Arrays.asList(0, 4)));
        adjList.add(new LinkedList<>(Arrays.asList(1)));
        adjList.add(new LinkedList<>(Arrays.asList(2)));
        adjList.add(new LinkedList<>(Arrays.asList(0)));

        int [] visited=new int[adjList.size()];
        LinkedList<Integer> dfs=new LinkedList<>();
        System.out.println(DFSTraversal(0,visited,adjList,dfs));

    }

public  static LinkedList<Integer> DFSTraversal(int start, int[] visited,  LinkedList<LinkedList<Integer>> adjList, LinkedList<Integer> dfs){
        visited[start]=1;
        dfs.add(start);

        for (int ngr:adjList.get(start)){
            if(visited[ngr]==0) {
                DFSTraversal(ngr, visited, adjList, dfs);
            }
        }


        return dfs;
}
}
