package ArrayString;

import java.util.*;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);
        System.out.println("After sorting ");
//        System.out.println(Arrays.toString(strs));

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        StringBuilder result = new StringBuilder();

        int minLength = Math.min(first.length, last.length);

        for (int i = 0; i < minLength; i++) {
            if (first[i] != last[i]) break;
            result.append(first[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"cluster", "clue", "club", "clusmy"};
        System.out.println("Longest Common Prefix is : "+longestCommonPrefix(arr));

    }
}
