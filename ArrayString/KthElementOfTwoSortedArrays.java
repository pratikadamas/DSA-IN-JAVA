package ArrayString;
import java.util.*;

public class KthElementOfTwoSortedArrays {
    public  static  int kthElementOfTwoSortedArrays(int[] nums1,int[] nums2 ,int k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                k--;
                if (k == 0) return nums1[i];
                i++;
            } else {
                k--;
                if (k == 0) return nums2[j];
                j++;
            }
        }


        while (i < n) {
            k--;
            if (k == 0) return nums1[i];
            i++;
        }

        while (j < m) {
            k--;
            if (k == 0) return nums2[j];
            j++;
        }

        throw new IllegalArgumentException("k is larger than total elements");

    }

    public static void main(String[] args) {

        int a[]={1,4,5,3};
        int b[]={10,9,-4,-1,13};
        System.out.println(kthElementOfTwoSortedArrays(a,b,4));

    }
}
