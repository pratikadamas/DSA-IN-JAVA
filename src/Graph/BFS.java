package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> adjlist=new LinkedList<>();
        adjlist.add(new LinkedList<>(Arrays.asList(5,2,1))); // 0 node
        adjlist.add(new LinkedList<>(Arrays.asList(3,0))); //1 node
        adjlist.add(new LinkedList<>(Arrays.asList(0,4,5))); // 2 node
        adjlist.add(new LinkedList<>(Arrays.asList(4,1))); // 3 node
        adjlist.add(new LinkedList<>(Arrays.asList(2,3))); //4 node
        adjlist.add(new LinkedList<>(Arrays.asList(0,2))); // 5 node
        System.out.println(BFSTraversal(adjlist,0));


    }

    public  static LinkedList<Integer> BFSTraversal(LinkedList<LinkedList<Integer>> adj,int start)
    {
        LinkedList<Integer> bfs=new LinkedList<>();
        int V = adj.size(); // no of vertex size of adjacency list
        int[] visited=new int[V];
        Queue<Integer> queue=new LinkedList<>();

        visited[start]=1;
        queue.add(start);

        while(!queue.isEmpty()){
            int node=queue.poll();
            bfs.add(node);

            for (int nbr:adj.get(node)){
                if (visited[nbr]==0){
                    visited[nbr]=1;
                    queue.add(nbr);
                }

            }
        }

        return bfs;
    }
}


