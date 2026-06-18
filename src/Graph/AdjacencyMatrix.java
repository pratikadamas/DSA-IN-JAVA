package src.Graph;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 4; // Number of vertices

        Graph g = new Graph(V);

        // Add edges: (0, 1), (0, 2), (1, 2), (2, 3)
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        // Print the resulting matrix
        g.printMatrix();
    }
}

class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    // Initialize the matrix with the given number of vertices
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        // In Java, a new int array is automatically filled with 0s
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add an edge for an undirected graph
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1; // Remove this line if the graph is directed
    }

    // Remove an edge
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0; // Remove this line if the graph is directed
    }

    // Helper method to print the matrix
    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
