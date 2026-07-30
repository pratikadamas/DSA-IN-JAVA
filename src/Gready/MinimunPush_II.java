package Gready;
import java.util.*;

public class MinimunPush_II {
    public int minimumPushes(String word)
    {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(freq);
        int ans = 0;
        int pos = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) continue;

            ans += freq[i] * (pos / 8 + 1);
            pos++;
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimunPush_II obj = new MinimunPush_II();
        String[] testCases = {
                "mnhtyfrefgbmmnm",
                "abc",
                "aabbcc",
                "xyzxyzxyz",
                "aaaaaaaa"
        };

        for (String word : testCases) {
            int result = obj.minimumPushes(word);
            System.out.println("Minimum pushes required for the word \"" + word + "\": " + result);
        }

    }
}
