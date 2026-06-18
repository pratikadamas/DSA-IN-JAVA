package ArrayString;

import java.util.*;

public class VectorFullExample {
    public static void main(String[] args) {
        // ===============================
        // 1D Vector Example
        // ===============================
        System.out.println("=== 1D Vector Example ===");

        // Create a Vector of Integers
        Vector<Integer> vec1D = new Vector<>();

        // Add elements to the Vector
        vec1D.add(10);  // add at end
        vec1D.add(20);
        vec1D.add(30);
        vec1D.add(1, 15); // insert 15 at index 1

        System.out.println("Vector after additions: " + vec1D);

        // Access elements
        System.out.println("Element at index 2: " + vec1D.get(2));

        // Modify element at index
        vec1D.set(2, 25); // set index 2 to 25
        System.out.println("Vector after set: " + vec1D);

        // Remove element
        vec1D.remove(1);  // remove element at index 1
        System.out.println("Vector after remove: " + vec1D);

        // Check size
        System.out.println("Size of vector: " + vec1D.size());

        // Check if empty
        System.out.println("Is vector empty? " + vec1D.isEmpty());

        // Search element
        System.out.println("Index of 25: " + vec1D.indexOf(25));
        System.out.println("Contains 30? " + vec1D.contains(30));

        // Iterate using for-each
        System.out.print("Iterate elements: ");
        for (Integer val : vec1D) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Sort Vector ascending
        Collections.sort(vec1D);
        System.out.println("Sorted ascending: " + vec1D);

        // Sort Vector descending
        Collections.sort(vec1D, Collections.reverseOrder());
        System.out.println("Sorted descending: " + vec1D);

        // Reverse Vector
        Collections.reverse(vec1D);
        System.out.println("Reversed vector: " + vec1D);

        // Clear vector
        // vec1D.clear(); // Uncomment to clear all elements

        System.out.println();

        // ===============================
        // 2D Vector Example (Vector of Vector)
        // ===============================
        System.out.println("=== 2D Vector Example ===");

        Vector<Vector<Integer>> vec2D = new Vector<>();

        // Add rows using Arrays.asList
        vec2D.add(new Vector<>(Arrays.asList(1, 2, 3, 4)));
        vec2D.add(new Vector<>(Arrays.asList(5, 6, 7, 8)));
        vec2D.add(new Vector<>(Arrays.asList(9, 10, 11, 12)));
        vec2D.add(new Vector<>(Arrays.asList(13, 14, 15, 16)));

        // Access row and element
        System.out.println("Element at (2,2): " + vec2D.get(2).get(2));

        // Update element
        vec2D.get(2).set(2, 99);
        System.out.println("After updating (2,2) to 99: " + vec2D.get(2));

        // Insert element in a row
        vec2D.get(1).add(1, 55); // insert 55 at index 1 of row 1
        System.out.println("After inserting 55 in row 1: " + vec2D.get(1));

        // Iterate 2D vector
        System.out.println("2D Vector elements:");
        for (Vector<Integer> row : vec2D) {
            System.out.println(row);
        }


        // Number of rows and columns
        int rows = vec2D.size();
        int cols = vec2D.get(0).size(); // assuming all rows same length
        System.out.println("Rows: " + rows + ", Columns: " + cols);

        // Swap elements (example: swap (0,1) with (1,0))
        Integer temp = vec2D.get(0).get(1);
        vec2D.get(0).set(1, vec2D.get(1).get(0));
        vec2D.get(1).set(0, temp);


        System.out.println("After swapping (0,1) with (1,0):");
        for (Vector<Integer> row : vec2D) {
            System.out.println(row);
        }

        // Reverse a row
        Collections.reverse(vec2D.get(0));
        System.out.println("Row 0 reversed: " + vec2D.get(0));

        // Sort a row
        Collections.sort(vec2D.get(1));
        System.out.println("Row 1 sorted ascending: " + vec2D.get(1));

        // Clear 2D vector
        // vec2D.clear(); // Uncomment to remove all rows
    }
}

