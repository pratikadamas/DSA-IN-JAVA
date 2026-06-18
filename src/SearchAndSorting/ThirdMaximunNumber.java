package SearchAndSorting;

import java.util.TreeSet;

public class ThirdMaximunNumber {

    static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int e:nums){
            set.add(e);
        }
        if(set.size()<3)
            return set.last();
        set.pollLast();
        set.pollLast();
        return set.last();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println("3rd max number is "+thirdMax(nums));

    }
}
