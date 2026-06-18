package ArrayString;

import java.util.*;


// count such elements n, n+1 exist in array
public class CountNumber {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3, 5, 5, 6};
        int[] nums3 = {1, 1, 2, 2, 2, 3, 3, 4};
        System.out.println("nums1 :" + countNumber(nums1));
        System.out.println("nums3 :" + countNumber(nums3));
        System.out.println("nums2 :" + countNumber(nums2));


    }

    public static int countNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int count = 0;

        for (int num : set) {
            if (set.contains(num + 1)) {
                count++;
            }
        }

        return count;
    }

}
