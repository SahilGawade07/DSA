
import java.util.*;

public class minimumNumberOfPushesToTypeWord2_3016 {

    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(function(word));
    }

    static int function(String word) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!m.containsKey(word.charAt(i))) {
                m.put(word.charAt(i), 1);
                continue;
            }
            m.put(word.charAt(i), m.get(word.charAt(i)) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());
        System.out.println(list);
        int count = 1;
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            
            ans += count * list.get(i).getValue();
            // System.out.println("ans: "+ ans + " freq: "+list.get(i).getValue()+ " count: "+ count);
            if ((i+1)  % 8 == 0) {
                count++;
            }
        }

        return ans;
    }
}
