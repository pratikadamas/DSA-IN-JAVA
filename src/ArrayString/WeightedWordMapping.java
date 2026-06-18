package ArrayString;

public class WeightedWordMapping {


    public static String mapWordWeights(String[] words, int[] weights) {
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                int currentWeight = 0;

                // Calculate the total weight of the current word
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    currentWeight += weights[c - 'a'];
                }

                // Apply modulo 26
                int remainder = currentWeight % 26;

                // Map to reverse alphabetical order (0 -> 'z', 1 -> 'y', etc.)
                char mappedChar = (char) ('z' - remainder);

                // Append to the result
                result.append(mappedChar);
            }

            return result.toString();

    }

    public static void main(String[] args) {
        String[] w1={"abcd" ,"cfre", "gfdd"};
                int [] w0={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(w1,w0));

    }
}
