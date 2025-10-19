package ArrayString;


public class DuplicateElementFindingUsingFloydCycleAlgo {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Find the meeting point (inside the cycle)
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find the entry point of the cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;  // or fast — both point to the duplicate
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,4};
        System.out.println("Above array duplicate element is : "+findDuplicate(arr));
    }
}
