//class Solution {
//    public int maxDistinctElements(int[] nums, int k) {
//        Arrays.sort(nums);
//        long next = Long.MIN_VALUE;  // next smallest distinct number we can use
//        int count = 0;
//
//        for (int num : nums) {
//            long start = (long) num - k;
//            long end = (long) num + k;
//
//            if (end < next) continue;  // can't use this one at all
//
//            long pick = Math.max(start, next); // smallest available in this interval
//            next = pick + 1;
//            count++;
//        }
//        return count;
//    }
//}

// above the correct code--
package ArrayString;
import java.util.*;

public class MaxNoOfDistrinctElement {
    public  static int maxDistinctElements(int[] nums, int k) {
        //    int [] arr= new int[nums.length];
        Arrays.sort(nums);

        ArrayList<Integer> li= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int insert=0;
            for(int j=-k;j<=k;j++)
            {
                int res=nums[i]+j;
                if(!li.contains(res) && insert==0) {
                    li.add(res);
                    insert++;
                    break;
                }

            }
        }
//        System.out.println(li);

        return li.size();

    }

    public static void main(String[] args) {
        System.out.println("Accirary 92 % and time limit exccedted");
      int[]  nums= new int[]{8,7,8,7,10};
        int[]  nums1= new int[]{1,2,2,3,3,4};
        int[]  nums2= new int[]{4,4,4,4};

      System.out.println(maxDistinctElements(nums,1));
      System.out.println(maxDistinctElements(nums2,2));
      System.out.println(maxDistinctElements(nums,1));
    }
}

