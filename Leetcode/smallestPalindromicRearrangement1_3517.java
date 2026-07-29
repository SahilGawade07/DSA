
import java.util.Arrays;

public class smallestPalindromicRearrangement1_3517 {

    public static void main(String[] args) {
        String s = "daccad";
        System.out.println(function(s));
    }

    static String function(String s) {
        String sub;
        sub = s.substring(0, (s.length() / 2));

        char[] ch = sub.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        StringBuilder ans = new StringBuilder(sorted);
        if (s.length() % 2 == 0) {
            System.out.println();
        } else {
            ans.append(s.charAt((s.length() / 2)));
        }
        for (int i = sorted.length() - 1; i >= 0; i--) {
            ans.append(sorted.charAt(i));
        }
        String a = ans.toString();

        return a;

    }

}
