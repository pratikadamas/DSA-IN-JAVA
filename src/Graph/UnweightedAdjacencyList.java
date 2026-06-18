package src.Graph;

import java.util.ArrayList;
import java.util.List;

public class UnweightedAdjacencyList {
    private int numVertices;
    // An outer list where each element is an inner list of neighbors
    private List<List<Integer>> adjList;

    public UnweightedAdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);

        // Initialize an empty ArrayList for each vertex
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge (Undirected graph)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // Remove this line if the graph is Directed
    }

    // Print the adjacency list
    public void printGraph() {
        System.out.println("Unweighted Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Node " + i + " is connected to: ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UnweightedAdjacencyList graph = new UnweightedAdjacencyList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
