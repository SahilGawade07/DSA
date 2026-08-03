public class countValidPrefixes_4006  {
    public static void main(String[] args) {
        String s = "101";

        System.out.println(function(s));

    }

    static int function(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int ans = 1;
        for (int i = 1; i < s.length(); i++) {
            String sub = s.substring(0, i+1);
            System.out.println(sub);
            int zero = 0;
            int one = 0;
            for (char c : sub.toCharArray()) {
                if (c == '0') {
                    zero++;

                } else {
                    one++;
                }
            }
            System.out.println(i + " " + zero + " " + one);

            if (one == zero || (one + 1) == zero || one == (zero + 1)) {
                ans++;
            }
        }

        return ans;
    }
}
