package ArrayString;

public class FirstAndLastOccurence {
    public static int searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                last=mid;
                break;
            }
            else if(nums[mid]>target)
                low=mid+1;
            else
                high=mid-1 ;
        }
        // int count

        if(first!=-1){
            for(int i=first;i<high;i++)
            {
                if(nums[i]==target)
                    last++;
            }
        }
        int res[]={first,last};

        return res[1];


    }

    public static void main(String[] args) {
        int a[]={1,2,3,3,4,4,4,4,5,5,6,6,7};
        int target=4;
        System.out.println(searchRange(a,target));
    }
}
