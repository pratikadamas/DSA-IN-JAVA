package ArrayString;

public class GCD {
    // 1. Recursive Euclidean Algorithm (Recommended)
    public static int findGCDRecursive(int a, int b) {
        if (b == 0) {
            return Math.abs(a); // Handles negative inputs
        }
        return findGCDRecursive(b, a % b);
    }

    // 2. Iterative Euclidean Algorithm
    public static int findGCDIterative(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        int a=12;
        int b=15;

        System.out.println(findGCDRecursive(a,b));
        System.out.println(findGCDIterative(a,b));
    }
}
