package SlidingWindow;

public class Sumofsunarraysize_k {

    static void sum(int a[], int k) {

        if (k > a.length) return;
        if (k == 0) return;
        int n = a.length;

        // Step 1: first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }

        System.out.println(windowSum);

        // Step 2: slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum + a[i] - a[i - k];
            System.out.println(windowSum);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        sum(nums, 3);
    }
}