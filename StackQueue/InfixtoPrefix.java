package StackQueue;

import java.util.Stack;

public class InfixtoPrefix {

    static String infixToPrefix(String s) {
        String reversed = reverse(s);
        String postfix = infixToPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
    }

    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }

            else {
                while (!st.isEmpty() &&
                        (priority(st.peek()) > priority(ch) ||
                                (priority(st.peek()) == priority(ch) && ch != '^'))) {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    static int priority(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C";
        System.out.println(infixToPrefix(exp)); // *+ABC
    }
}