import java.io.*;
import java.util.*;

public class cf_118A {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
                    || c == 'u'
                    || c == 'Y' || c == 'y') {
                continue;
            }
            ans.append(".");

            if (c >= 'A' && c <= 'Z') {
            int a = c + 32;
            char b = (char) a;
            ans.append(Character.toString(b));
            continue;
            }
            ans.append(Character.toString(c));
        }

        System.out.println(ans);

    }
}