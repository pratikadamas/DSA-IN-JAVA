// Application of binary search
package SearchAndSorting;
//"Lower bounds --- smallest index such that  arr[index]>=target"
public class LowerBound {

    public static int lowerbound(int arr[],int target ,int n){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid]>=target){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println("Lower bounds --- smallest index such that arr[index]>=target");
        int arr[]={1,2,4,4,4,5,9,10,15,22};
       int  n=arr.length,target=4 ;

        System.out.println("Lower bound is "+lowerbound(arr,target,n));


    }
}
