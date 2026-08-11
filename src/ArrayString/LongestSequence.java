package ArrayString;

public class LongestSequence {
    public static int longestSequence(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Find out Longest Sequence");
        int[] nums = {100, 4, 200, 1, 2, 3};
        int result = longestSequence(nums);
        System.out.println("Length of the longest consecutive sequence: " + result);

    }
}
