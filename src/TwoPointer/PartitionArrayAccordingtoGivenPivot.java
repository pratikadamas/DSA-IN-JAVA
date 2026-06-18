package TwoPointer;

import java.util.*;

public class PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,3,7,10,14,3};
        int pivot = 10;
        partitionArrayBruteforce(nums,pivot);
        System.out.println("After partitioning the array is : BRUTE FORCE APPROACH -->");
        for (int e:nums)
        System.out.print(" "+e);

    }

    //
    static void partitionArrayBruteforce(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {

            if (num < pivot)
                less.add(num);

            else if (num == pivot)
                equal.add(num);

            else
                greater.add(num);
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        for (int x : less)
            nums[idx++] = x;

        for (int x : equal)
            nums[idx++] = x;

        for (int x : greater)
            nums[idx++] = x;


    }

}
