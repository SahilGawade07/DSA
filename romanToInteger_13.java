import java.util.HashMap;

// public class romanToInteger_13 {
// public static void main(String[]args){System.out.println(RomanToInt("III"));}

//     public static int RomanToInt(String s) {
//         HashMap<Character, Integer> hm = new HashMap<>();
//         int res = 0;
//         hm.put('I', 1);
//         hm.put('V', 5);
//         hm.put('X', 10);
//         hm.put('L', 50);
//         hm.put('C', 100);
//         hm.put('D', 500);
//         hm.put('M', 1000);

//         for (int i = s.length() - 1; i >= 0; i++) {

//             char ch, ch2;

//             if (i != 0) {
//                 ch = s.charAt(i);
//                 ch2 = s.charAt(i - 1);
//                 if (hm.get(ch) > hm.get(ch2)) {
//                     res += hm.get(ch);
//                 } else {
//                     res += -hm.get(ch);
//                 }
//             } else {
//                 ch = s.charAt(i);
//                 res += hm.get(ch);
//             }
//         }

//         return res;
//     }
// }

public class romanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(RomanToInt("III"));
    }

    public static int RomanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = hm.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = hm.get(s.charAt(i + 1));
                if (curr < next) {
                    res -= curr;
                } else {
                    res += curr;
                }
            } else {
                res += curr;
            }
        }
        return res;
    }
}