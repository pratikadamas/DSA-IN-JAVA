package ARRAY_STRING;

class Maximum_sum_array {
    public static void main(String[] args) {
        int MAX=-9999;
        int arr[] = {1, 2, -3, 4, -5, 6};

        // Outer loop for starting index
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for ending index
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                // Print subarray from i to j
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    System.out.print(arr[k] + " ");
                }
                MAX=Math.max(sum,MAX);
                System.out.println(); // New line after each subarray
            }
        }
        System.out.println("maximum sum is "+MAX);
    }
}
