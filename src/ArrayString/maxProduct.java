package ArrayString;

public class maxProduct {
    public int findMaxProduct(int n)
    {
        long value = Math.abs((long) n);
        if (value < 10) {
            return 0;
        }

        int max1 = -1;
        int max2 = -1;

        while (value > 0) {
            int digit = (int) (value % 10);

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            value /= 10;
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        maxProduct obj = new maxProduct();
        int n1 = 1234567891;
        int result1 = obj.findMaxProduct(n1);
        System.out.println("The maximum product of two digits in " + n1 + " is: " + result1);

        int n2 = 90876;
        int result2 = obj.findMaxProduct(n2);
        System.out.println("The maximum product of two digits in " + n2 + " is: " + result2);

        int n3 = 7;
        int result3 = obj.findMaxProduct(n3);
        System.out.println("The maximum product of two digits in " + n3 + " is: " + result3);

        int n4 = 0;
        int result4 = obj.findMaxProduct(n4);
        System.out.println("The maximum product of two digits in " + n4 + " is: " + result4);

        int n5 = -98765;
        int result5 = obj.findMaxProduct(n5);
        System.out.println("The maximum product of two digits in " + n5 + " is: " + result5);
    }
}
