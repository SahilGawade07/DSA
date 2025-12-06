import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println(fn(s));
    }

    public static int fn(String s) {
        LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (lh.containsKey(s.charAt(i))) {
                char c = s.charAt(i);
                lh.put(c, lh.get(c) + 1);
                continue;

            }
            lh.put(s.charAt(i), 1);
        }
        System.out.println(lh);
        int ind = 0;
        char firstUnique;
        for (Map.Entry<Character, Integer> entry : lh.entrySet()) {
            if (entry.getValue() == 1) {
                firstUnique = entry.getKey();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == firstUnique) {
                        return i;
                    }
                }
            }
            if (ind == lh.size() - 1) {
                return -1;
            }
            ind++;
        }
        return -1;
    }
}
