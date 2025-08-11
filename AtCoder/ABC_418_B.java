import java.util.ArrayList;
import java.util.Scanner;

public class ABC_418_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Integer> a = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 't') {
                a.add(i);
            }
            i++;
        }
        double maxRate = 0.0;
        for (int p = 0; p < a.size(); p++) {
            for (int j = p + 1; j < a.size(); j++) {
                String subs = s.substring(a.get(p), a.get(j) + 1);
                if (subs.length() >= 3) {
                    int count = 0;
                    for (int k = 0; k < subs.length(); k++) {
                        if (subs.charAt(k) == 't')
                            count++;
                    }
                    double rate = (double) (count - 2) / (subs.length() - 2);
                    maxRate = Math.max(rate, maxRate);
                }
            }
        }
        System.out.println(maxRate);
        sc.close();
    }
}
