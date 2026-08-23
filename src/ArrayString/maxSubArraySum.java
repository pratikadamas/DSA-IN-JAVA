package ArrayString;
//kadane algorithm - maximum subarray sum
public class maxSubArraySum {

    public static  int maxSubarraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentsum=nums[0];

        for(int i=0;i<nums.length;i++){
            currentsum=Math.max(currentsum+nums[i],nums[i]);
            max=Math.max(currentsum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray: "+maxSubarraySum(nums));

        int[] nums1=new int[]{-2,-8,-1,1,-4,6,5,-1};
        System.out.println("Maximum Subarray: "+maxSubarraySum(nums1));

    }
}
