package DynamicProgramming;
//Algorithm: Partition Array into Two Equal-Sum Subsets
public class PartitionArrayintoTwoEqualSumSubsets {
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum is odd, we cannot partition it into two equal subsets
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // We can always form the sum 0

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 5, 11, 5};
        System.out.println("Can partition [1, 5, 11, 5]: " + canPartition(nums1)); // true

        int[] nums2 = {1, 2, 3, 5};
        System.out.println("Can partition [1, 2, 3, 5]: " + canPartition(nums2)); // false
    }
}
