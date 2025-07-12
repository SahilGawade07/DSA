import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class isomorphicStrings_205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(fn(s, t));
    }

    public static boolean fn(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        Set<Character> se = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i)) && !se.contains(t.charAt(i))) {
                hm.put(s.charAt(i), t.charAt(i));
                se.add(t.charAt(i));
            }
        }
        StringBuffer h = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            h.append(hm.get(s.charAt(i)));
        }
        if (t.equals(h.toString()))
            return true;
        return false;
    }
}
