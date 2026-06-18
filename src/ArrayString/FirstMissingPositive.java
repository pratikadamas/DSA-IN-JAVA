package ArrayString;

public class FirstMissingPositive {

    public  static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace all <=0 and >n numbers with a dummy (n+1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = n + 1;
        }

        // Step 2: Mark indices based on existing numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num >= 1 && num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: The first positive index means missing number = index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i + 1;
        }

        // Step 4: If all 1..n exist, missing = n + 1
        return n + 1;
    }


    public static void main(String[] args) {

        int[] arr1 = { 3, 4, -1, 1 };
        int[] arr2 = { 1, 2, 3, 4 ,2,4};
        int[] arr3 = { 7,8,12,41,45,85};
        System.out.println(firstMissingPositive(arr1));
        System.out.println(firstMissingPositive(arr2));
        System.out.println(firstMissingPositive(arr3));

    }
}
