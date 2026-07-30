package Gready;
// asume the input string contains all distinct letter
public class minimumPushes {

    public int minimumPushes(String word) {
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += i / 8 + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        minimumPushes obj = new minimumPushes();
        String word = "mnhtyfrefgbmmnm";
        int result = obj.minimumPushes(word);
        System.out.println("Minimum pushes required for the word \"" + word + "\": " + result);
    }
}
