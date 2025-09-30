
// flip the bits the use x-or

public class SetTheBit {
    public static void main(String[] args) {
        int a=12;
        System.out.println("Before flip the bit");
        int bit_location=3;

        int result=a^(1<<bit_location-1);
        System.out.println("After flip the bit position "+bit_location+" = "+result);
        System.out.println(a& (~a+1));
        System.out.println(a| ~a);
        System.out.println(a^ ~a);
    }
}
