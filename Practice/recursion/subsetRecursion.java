package Practice.recursion;

import java.util.ArrayList;

class subsetRecursion {

    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abc";
        subset(s, "");
        System.out.println(ans);

    }

    static void subset(String s, String op) {

        if (s.length() == 0) {
            ans.add(op);
            return;
        }
        subset(s.substring(1), op + s.charAt(0));
        subset(s.substring(1), op);

    }
}
