package DynamicProgramming;
import java.util.ArrayList;

public class Subsequences {
    static void printSubsequences(int[] arr, int index,
                                  ArrayList<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: Take arr[index]
        current.add(arr[index]);

        printSubsequences(arr, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Choice 2: Don't take arr[index]
        printSubsequences(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> current = new ArrayList<>();
        printSubsequences(arr, 0, current);
    }
}
