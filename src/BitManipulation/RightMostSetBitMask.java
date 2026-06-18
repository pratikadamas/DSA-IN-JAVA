package BitManipulation;

import java.util.Scanner;

public class RightMostSetBitMask {

//    Right Most Set Bit (RSB) Mask= X & X 2`s complement
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number ");
     int num = sc.nextInt();

            System.out.println(" Right Most Set Bit (RSB) Mask= "+( num &(~num+1)));
}

}
