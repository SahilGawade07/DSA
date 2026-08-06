import java.util.*;

public class cf_791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(1);
            return;
        }
        int ans = 0;

        while (true) {
            a *= 3;
            b *= 2;

            if (a > b) {
                System.out.println(ans+1);
                return;
            }
            ans++;
        }

    }

}
