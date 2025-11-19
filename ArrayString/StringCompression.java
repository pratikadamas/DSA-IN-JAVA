package ArrayString;

public class StringCompression {

    public static void main(String[] args) {
        String str = "a";
        System.out.println("Original String: " + str);
        char ch[] = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ch.length;) {
            int count = 1;
            char currentChar = ch[i];

            // Count consecutive characters
            int j = i + 1;
            while (j < ch.length && ch[j] == currentChar) {
                count++;
                j++;
            }

            // Append character and count
            sb.append(currentChar);
            if(count != 1){
             sb.append(count);}

            // Move to next different character
            i = j;
        }

        System.out.println("Compressed String: " + sb.toString().length());
        System.out.println("Compressed String: " + sb.toString());
        // Output: a3b2c4d1
    }
}