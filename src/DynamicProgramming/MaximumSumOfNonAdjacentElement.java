package DynamicProgramming;

public class MaximumSumOfNonAdjacentElement {

    public static int maxSum(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev1, arr[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxSum(arr));
        System.out.println("========================");

        int[] arr1 = {5, 1, 2, 10, 6, 2};
        System.out.println(maxSum(arr1));

    }
}
