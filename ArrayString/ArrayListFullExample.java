package ArrayString;

import java.util.*;

public class ArrayListFullExample {
    public static void main(String[] args) {
        // ===============================
        // 1D ArrayList Example
        // ===============================
        System.out.println("=== 1D ArrayList Example ===");

        // Create an ArrayList of Integers
        ArrayList<Integer> list1D = new ArrayList<>();

        // Add elements to the ArrayList
        list1D.add(10);            // Add at end
        list1D.add(20);
        list1D.add(30);

        list1D.add(1, 15);         // Insert 15 at index 1

        System.out.println("ArrayList after additions: " + list1D);

        // Access elements
        System.out.println("Element at index 2: " + list1D.get(2));

        // Modify element
        list1D.set(2, 25);         // Set index 2 to 25
        System.out.println("After set: " + list1D);

        // Remove element
        list1D.remove(1);           // Remove element at index 1
        System.out.println("After remove: " + list1D);

        // Remove element by value
        list1D.remove(Integer.valueOf(30)); // Remove element 30
        System.out.println("After removing value 30: " + list1D);

        // Check size
        System.out.println("Size of list: " + list1D.size());

        // Check if empty
        System.out.println("Is list empty? " + list1D.isEmpty());

        // Search
        System.out.println("Index of 25: " + list1D.indexOf(25));
        System.out.println("Contains 10? " + list1D.contains(10));

        // Iterate
        System.out.print("Iterate elements: ");
        for (Integer val : list1D) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Sort ascending
        Collections.sort(list1D);
        System.out.println("Sorted ascending: " + list1D);

        // Sort descending
        Collections.sort(list1D, Collections.reverseOrder());
        System.out.println("Sorted descending: " + list1D);

        // Reverse
        Collections.reverse(list1D);
        System.out.println("Reversed list: " + list1D);

        // Clear all elements
        // list1D.clear();

        System.out.println();

        // ===============================
        // 2D ArrayList Example
        // ===============================
        System.out.println("=== 2D ArrayList Example ===");

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // Add rows
        list2D.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        list2D.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        list2D.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        list2D.add(new ArrayList<>(Arrays.asList(13, 14, 15, 16)));

        // Access element
        System.out.println("Element at (2,2): " + list2D.get(2).get(2));

        // Update element
        list2D.get(2).set(2, 99);
        System.out.println("After updating (2,2) to 99: " + list2D.get(2));

        // Insert element in a row
        list2D.get(1).add(1, 55);  // insert 55 at index 1 of row 1
        System.out.println("After inserting 55 in row 1: " + list2D.get(1));

        // Iterate 2D ArrayList
        System.out.println("2D ArrayList elements:");
        for (ArrayList<Integer> row : list2D) {
            System.out.println(row);
        }

        // Number of rows and columns
        int rows = list2D.size();
        int cols = list2D.get(0).size(); // assuming all rows same length
        System.out.println("Rows: " + rows + ", Columns: " + cols);

        // Swap elements example
        Integer temp = list2D.get(0).get(1);
        list2D.get(0).set(1, list2D.get(1).get(0));
        list2D.get(1).set(0, temp);
        System.out.println("After swapping (0,1) with (1,0):");
        for (ArrayList<Integer> row : list2D) {
            System.out.println(row);
        }

        // Reverse a row
        Collections.reverse(list2D.get(0));
        System.out.println("Row 0 reversed: " + list2D.get(0));

        // Sort a row
        Collections.sort(list2D.get(1));
        System.out.println("Row 1 sorted ascending: " + list2D.get(1));

        // Clear 2D ArrayList
        // list2D.clear();
    }
}
