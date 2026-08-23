package BitManipulation;

import java.util.*;


public class ToggleTheBit
{
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

        int afterToggle=n^(1<<(length-i));

        System.out.println("After the toggle the bit "+afterToggle);
    }
}
