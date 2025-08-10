import java.util.Arrays;

public class longestCommonPrefix_14 {
    public static void main(String[] args) {
        String strs[] = { "ab", "a" };
        int ind = 0;
        Arrays.sort(strs);

        if (strs.length == 1) {
            System.out.println(strs[0]);
        }

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                ind++;
            } else {
                break;
            }
        }
        System.out.println(ind);
        String common = strs[0].substring(0, ind);
        if (ind == 0) {
            System.out.println("");
        } else {
            System.out.println(common);
        }
    }
}