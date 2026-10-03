package StackQueue;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int left = 0, right = 0;

        // Left to right scan
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }

        left = right = 0;
        // Right to left scan
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "(())){}";
        System.out.println("Longest Valid Parentheses in \"" + s1 + "\": " + longestValidParentheses(s1));

        String s2 = ")()())";
        System.out.println("Longest Valid Parentheses in \"" + s2 + "\": " + longestValidParentheses(s2));

        String s3 = "{}}}}";
        System.out.println("Longest Valid Parentheses in \"" + s3 + "\": " + longestValidParentheses(s3));
    }

}
