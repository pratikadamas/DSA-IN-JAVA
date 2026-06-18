package ArrayString;
import java.util.*;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i))
                return true; // duplicates
        }
        return false;// for unoque

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,4};
        System.out.println("the Array contains duplicates -- "+containsDuplicate(nums));

    }
}
