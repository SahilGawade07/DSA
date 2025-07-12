import java.util.HashMap;

public class validAnagram_242 {
    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(fn(s, t));
    }

    public static boolean fn(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> mh = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (mh.containsKey(t.charAt(i))) {
                mh.put(t.charAt(i), mh.get(t.charAt(i)) + 1);
            } else {
                mh.put(t.charAt(i), 1);
            }
        }

        System.out.println(hm + " " + mh);

        if (hm.equals(mh)) {
            return true;
        }

        return false;
    }
}
