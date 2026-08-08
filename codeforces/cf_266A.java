import java.io.*;
import java.util.*;

public class cf_266A {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}