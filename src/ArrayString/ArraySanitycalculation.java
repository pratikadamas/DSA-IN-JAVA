package ArrayString;
import java.util.*;
//Sanity = Original Index (before sorting) + Index of Last Occurrence of that value in the Sorted Array

public class ArraySanitycalculation {
    public static int userLogic(int n, int[] arr) {
        // Step 1: Count frequency of each value (TreeMap keeps keys sorted)
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int val : arr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        // Step 2: Find last occurrence of each value in the sorted array
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        int cumulative = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            cumulative += entry.getValue();
            lastOccurrence.put(entry.getKey(), cumulative - 1);
        }

        // Step 3: Calculate total sanity (sum of all individual sanities)
        int totalSanity = 0;
        for (int i = 0; i < n; i++) {
            int sanity = i + lastOccurrence.get(arr[i]);
            totalSanity += sanity;
        }

        return totalSanity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int measurement = userLogic(n, arr);
        System.out.println(measurement);
    }
}
