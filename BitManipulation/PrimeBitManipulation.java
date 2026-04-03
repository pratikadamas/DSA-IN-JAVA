package BitManipulation;

public class PrimeBitManipulation {

    // Check if n is prime using bitwise parity for evenness
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        // (n & 1) == 0  means n is even (except 2, already handled)
        if ((n & 1) == 0) return false;

        int limit = (int) Math.sqrt(n);
        // Only check odd divisors
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + " is prime? " + isPrime(num));
    }
}
