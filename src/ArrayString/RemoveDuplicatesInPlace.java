package ArrayString;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4};


        // Step 1: Sort array (needed to handle duplicates in-place)
        Arrays.sort(nums);

        int p = 0; // write pointer

        for (int i = 0; i < nums.length; i++) {
            // Skip negative numbers if needed
            if (nums[i] <= 0) continue;

            // Keep only unique elements
            if (p == 0 || nums[i] != nums[p - 1]) {
                nums[p++] = nums[i];
            }
        }

        // Step 2: First p elements are now unique and positive
        System.out.println(Arrays.toString(Arrays.copyOf(nums, p))); // [1, 2, 3, 4]
    }
}
