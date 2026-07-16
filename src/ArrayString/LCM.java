package ArrayString;
import java.util.*;

public class LCM {
    public static long findLCM(long a,long b){
        return a*b/gcd(a,b);
    }

    public static long gcd(long a,long b){
        if(b==0){
            return Math.abs(a);
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println("LCM tow number in java");

        long a = 120000;
        long b = 155698;
        int d=1;
        System.out.println(d);

        System.out.println(findLCM(a, b));
    }
}
