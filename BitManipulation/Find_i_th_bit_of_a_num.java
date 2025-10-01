public class Find_i_th_bit_of_a_num {
    public static void main(String[] args) {
        int a = 31;          // binary: 11111
        int bit_position = 3; // 0-based index (0 = LSB)

        int result = (a >> bit_position) & 1;
//        int result = a  & (1<<bit_position);
        System.out.println("The bit at position " + bit_position + " is: " + result);
    }
}
