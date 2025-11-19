package BitManipulation;
import  java.util.*;
public class MinimunBitFlifsToConvertaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Start integer: ");
        int start = sc.nextInt(); // read integer

        System.out.println("Enter an Goal integer: ");
        int goal = sc.nextInt(); // read integer

        int ans=start^goal;
        int count=0;

        while (ans!=0){
            if((ans&1)==1)
                count++;

            ans=ans>>1;
        }

        System.out.println(" The no of flips bits required "+count);
    }
}
