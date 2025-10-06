package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClearBit {
    public static  int getlength(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%2);
            n/=2;
        }

        Collections.reverse(list);
        int len=list.size();
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.println("Enter an integer: ");
        int n = sc.nextInt(); // read integer
        System.out.println("Enter the bit position : ");
        int i = sc.nextInt(); // read integer

        int length =getlength(n);

        int AfterBitClean=n & ~(1<<(length-i)); //here the logic

        System.out.println("After bit clean the number is "+ AfterBitClean);

    }
}
