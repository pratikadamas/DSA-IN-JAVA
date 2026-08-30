package ArrayString;
import java.util.*;
public class RemoveMaxMinElement {
        public static int minimumDeletions(int[] nums)
        {
            if(nums.length==1)
                return 1;

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0 ; i<nums.length ; i++)
            {
                map.put(nums[i],i);
            }

            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;

            for(int e:nums)
            {
                if(max<e)
                    max=e;

                if(min>e)
                    min=e;

            }
            System.out.println("Max: "+max+" Min: "+min);

            int max_index=map.get(max);
            int min_index=map.get(min);
            int ans=0;
            ans = (max_index-0)<(nums.length-max_index) ?max_index+1:nums.length-max_index;
//            System.out.println("1."+ans);
            ans+= (min_index-0)<(nums.length-min_index) ?min_index+1:nums.length-min_index;
//            System.out.println("2."+ans);

            return ans;
        }

    public static void main(String[] args) {
        int[] nums1 = {2,10,7,5,4,1,8,6};
        System.out.println("Minimum deletions to remove max and min: " + minimumDeletions(nums1));

        int[] nums2 = {0,-4,19,1,8,-2,-3,5};
        System.out.println("Minimum deletions to remove max and min: " + minimumDeletions(nums2));

        int[] nums3 = {101};
        System.out.println("Minimum deletions to remove max and min: " + minimumDeletions(nums3));
    }
    }

