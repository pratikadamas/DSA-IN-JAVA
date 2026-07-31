package ArrayString;

public class RemoveDuplicateII {
    public static int removeDuplicates(int[] nums)
    {
        // Edge case: if the array is null or empty, there are 0 unique elements
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // The first element is always unique, so we start our unique pointer at index 1
        int k = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element (different from the previous one)
            if (nums[i] != nums[i - 1]) {
                // Place it at the k-th position
                nums[k] = nums[i];
                // Move the unique pointer forward
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2,2,3, 3};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
    }
}
