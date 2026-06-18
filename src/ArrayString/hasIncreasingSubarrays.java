package ArrayString;
import java.util.*;
public class hasIncreasingSubarrays{

    public static boolean hasIncreasingsubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n < 2 * k) return false; // need at least two subarrays of length k

        // Function to check if subarray nums[i..i+k-1] is strictly increasing
        for (int i = 0; i + 2 * k <= n; i++) {
            boolean first = true, second = true;

            // check first subarray [i .. i+k-1]
            for (int j = i + 1; j < i + k; j++) {
                if (nums.get(j) <= nums.get(j - 1)) {
                    first = false;
                    break;
                }
            }

            // check second subarray [i+k .. i+2k-1]
            if (first) {
                for (int j = i + k + 1; j < i + 2 * k; j++) {
                    if (nums.get(j) <= nums.get(j - 1)) {
                        second = false;
                        break;
                    }
                }
            }

            // both are strictly increasing
            if (first && second)
                return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Integer arr[] = { -48, 87 };
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));

    int k=1;
        System.out.println(hasIncreasingsubarrays(nums,k));

    }
}



