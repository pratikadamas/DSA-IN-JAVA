package ArrayString;

public class ConcatenateNon_ZeroDigitsandMultiplybySum {
    public static void main(String[] args) {
        String s=12325566+"";
        System.out.println(s.charAt(1));

        System.out.println(sumAndMultiply(1000230000));
    }

    public static long sumAndMultiply(int n) {
        long x = 0, s = 0;
        for (char c : String.valueOf(n).toCharArray())
            if (c != '0') {
                x = x * 10 + c - '0';
                s += c - '0';
            }
        return x * s;
    }
}
