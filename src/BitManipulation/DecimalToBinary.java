package BitManipulation;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        while (n != 0) {
                list.add(n % 2);
                n /= 2;
            }
            Collections.reverse(list);
            System.out.print("The binary form ");
            for (int i : list) {
                System.out.print(i);

        }

    }
}