package ArrayString;

public class thirdLargestDigit {
    public int thirdLargestDigit(int n) {
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max3 = max2;
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max3 = max2;
                max2 = digit;
            } else if (digit > max3) {
                max3 = digit;
            }

            n /= 10;
        }

        return max3;
    }

    public static void main(String[] args) {
        thirdLargestDigit obj = new thirdLargestDigit();
        int n = 1234567891;
        int result = obj.thirdLargestDigit(n);
        System.out.println("The third largest digit in " + n + " is: " + result);
    }
}
