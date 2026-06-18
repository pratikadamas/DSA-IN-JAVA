package ArrayString;

public class PeakElement {
    public  static int findPeakElement(int[] nums)
    { int n = nums.length;
        if(n==0)
            return -1;
        if (n == 1) return nums[0];
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int low = 1, high = n - 2;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // theoretically unreachable
    }


    public static void main(String[] args) {
        int [] a1={1,2,1,3,5,6,4};
        int [] a2={1,2,3,5,10,85,9,6,4};
        int [] a3={2,1};
        int [] a4={};
        System.out.println("Array 1 : "+findPeakElement(a1));
        System.out.println("Array 2 : "+findPeakElement(a2));
        System.out.println("Array 3 : "+findPeakElement(a3));
        System.out.println("Array 4 : "+findPeakElement(a4));

    }
}
