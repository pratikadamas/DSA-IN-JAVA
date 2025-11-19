package BitManipulation;

import java.util.Scanner;

public class ThenoPowerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.println("Enter an integer: ");
        int n = sc.nextInt(); // read integer

        // The no of set bit is 1 then even number
        if((n&(n-1))==0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
