package BitManipulation;

import java.util.Scanner;

public class KernighanAlgorithmCountSetBitsinanInteger {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int count=0;

        while(num>0){
            int RightmostsetBitMask= num&-num;
            num-=RightmostsetBitMask;
            count++;
        }

        System.out.println("Kernighan's Algorithm | Count Set Bits in an Integer "+count);
    }
}
