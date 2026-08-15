package DynamicProgramming;

public class FibonacciDP {
    
    // Bottom-up DP approach (Tabulation)
    public static int fibonacciTabulation(int n) {
        if (n <= 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
    
    // Top-down DP approach (Memoization)
    public static int fibonacciMemoization(int n) {
        int[] memo = new int[n + 1];
        return fibonacciHelper(n, memo);
    }
    
    private static int fibonacciHelper(int n, int[] memo) {
        if (n <= 1) return n;
        
        if (memo[n] != 0) return memo[n];
        
        memo[n] = fibonacciHelper(n - 1, memo) + fibonacciHelper(n - 2, memo);
        return memo[n];
    }
    
    // Space optimized DP
    public static int fibonacciSpaceOptimized(int n) {
        if (n <= 1) return n;
        
        int prev2 = 0;
        int prev1 = 1;
        int current = 0;
        
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
    
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Fibonacci numbers using DP:");
        System.out.println("Tabulation: F(" + n + ") = " + fibonacciTabulation(n));
        System.out.println("Memoization: F(" + n + ") = " + fibonacciMemoization(n));
        System.out.println("Space Optimized: F(" + n + ") = " + fibonacciSpaceOptimized(n));
        
        // Print first 10 Fibonacci numbers
        System.out.println("\nFirst 10 Fibonacci numbers:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacciSpaceOptimized(i) + " ");
        }
    }
}
