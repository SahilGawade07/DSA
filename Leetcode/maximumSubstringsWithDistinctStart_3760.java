import java.util.HashSet;
import java.util.Set;

public class maximumSubstringsWithDistinctStart_3760 {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(function(s));

    }

    static int function(String s){
        Set<Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
