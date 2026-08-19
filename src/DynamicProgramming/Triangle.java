package DynamicProgramming;

import java.util.List;

public class Triangle {

    public  static  int triangle(List<List<Integer>> triangle) {

        int height = triangle.size();
        if(height == 0){
            return 0;
        }
        if(height == 1){
            return triangle.get(0).get(0);
        }

        int[][] dp =new int[height+1][height+1];

        for(int level =height-1;level>=0;level--){
            for(int i =0;i<=level;i++){
                dp[level][i] = triangle.get(level).get(i)
                + Math.min(dp[level+1][i],dp[level+1][i+1]);
            }
        }

        return dp[0][0];


    }

    public static void main(String[] args) {
        System.out.println("=== Triangle Minimum Path Sum Test Cases ===\n");

        // Test Case 1: Basic example
        System.out.println("Test Case 1: Basic Triangle");
        List<List<Integer>> triangle1 = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        int result1 = triangle(triangle1);
        System.out.println("Input: [[2], [3,4], [6,5,7], [4,1,8,3]]");
        System.out.println("Expected: 11, Got: " + result1);
        System.out.println("Status: " + (result1 == 11 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 2: Single element triangle
        System.out.println("Test Case 2: Single Element");
        List<List<Integer>> triangle2 = List.of(
                List.of(5)
        );
        int result2 = triangle(triangle2);
        System.out.println("Input: [[5]]");
        System.out.println("Expected: 5, Got: " + result2);
        System.out.println("Status: " + (result2 == 5 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 3: Small triangle with 2 levels
        System.out.println("Test Case 3: Two Level Triangle");
        List<List<Integer>> triangle3 = List.of(
                List.of(1),
                List.of(2, 3)
        );
        int result3 = triangle(triangle3);
        System.out.println("Input: [[1], [2,3]]");
        System.out.println("Expected: 3, Got: " + result3);
        System.out.println("Status: " + (result3 == 3 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 4: Triangle with all same numbers
        System.out.println("Test Case 4: All Same Numbers");
        List<List<Integer>> triangle4 = List.of(
                List.of(5),
                List.of(5, 5),
                List.of(5, 5, 5)
        );
        int result4 = triangle(triangle4);
        System.out.println("Input: [[5], [5,5], [5,5,5]]");
        System.out.println("Expected: 15, Got: " + result4);
        System.out.println("Status: " + (result4 == 15 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 5: Triangle with zeros
        System.out.println("Test Case 5: Triangle with Zeros");
        List<List<Integer>> triangle5 = List.of(
                List.of(0),
                List.of(0, 0),
                List.of(0, 0, 0)
        );
        int result5 = triangle(triangle5);
        System.out.println("Input: [[0], [0,0], [0,0,0]]");
        System.out.println("Expected: 0, Got: " + result5);
        System.out.println("Status: " + (result5 == 0 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 6: Larger triangle
        System.out.println("Test Case 6: Larger Triangle (5 levels)");
        List<List<Integer>> triangle6 = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9, 10),
                List.of(11, 12, 13, 14, 15)
        );
        int result6 = triangle(triangle6);
        System.out.println("Input: [[1], [2,3], [4,5,6], [7,8,9,10], [11,12,13,14,15]]");
        System.out.println("Expected: 25, Got: " + result6);
        System.out.println("Status: " + (result6 == 25 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 7: Triangle with negative numbers
        System.out.println("Test Case 7: Triangle with Negative Numbers");
        List<List<Integer>> triangle7 = List.of(
                List.of(-1),
                List.of(-2, -3),
                List.of(-4, -5, -6)
        );
        int result7 = triangle(triangle7);
        System.out.println("Input: [[-1], [-2,-3], [-4,-5,-6]]");
        System.out.println("Expected: -10, Got: " + result7);
        System.out.println("Status: " + (result7 == -10 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 8: Triangle with mixed positive and negative
        System.out.println("Test Case 8: Mixed Positive and Negative");
        List<List<Integer>> triangle8 = List.of(
                List.of(10),
                List.of(-5, 8),
                List.of(3, -7, 2)
        );
        int result8 = triangle(triangle8);
        System.out.println("Input: [[10], [-5,8], [3,-7,2]]");
        System.out.println("Expected: -2, Got: " + result8);
        System.out.println("Status: " + (result8 == -2 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 9: Large numbers
        System.out.println("Test Case 9: Large Numbers");
        List<List<Integer>> triangle9 = List.of(
                List.of(1000),
                List.of(2000, 3000),
                List.of(4000, 5000, 6000)
        );
        int result9 = triangle(triangle9);
        System.out.println("Input: [[1000], [2000,3000], [4000,5000,6000]]");
        System.out.println("Expected: 12000, Got: " + result9);
        System.out.println("Status: " + (result9 == 12000 ? "✓ PASS" : "✗ FAIL") + "\n");

        // Test Case 10: Three level triangle
        System.out.println("Test Case 10: Three Level Triangle");
        List<List<Integer>> triangle10 = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7)
        );
        int result10 = triangle(triangle10);
        System.out.println("Input: [[2], [3,4], [6,5,7]]");
        System.out.println("Expected: 10, Got: " + result10);
        System.out.println("Status: " + (result10 == 10 ? "✓ PASS" : "✗ FAIL") + "\n");

        System.out.println("=== Test Execution Complete ===");
    }
}
