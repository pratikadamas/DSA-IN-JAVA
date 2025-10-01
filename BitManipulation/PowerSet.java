package BitManipulation;
import java.util.*;

public class PowerSet {

    public static List<List<Integer>> getPowerSet(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n;  // 2^n
        List<List<Integer>> powerSet = new ArrayList<>();

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) { // if j-th bit is set
                    subset.add(arr[j]);
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = getPowerSet(arr);

        System.out.println("Power set:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
