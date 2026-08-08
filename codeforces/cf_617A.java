import java.util.*;

public class cf_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int remainder = x % 5;
        if (remainder == 0) {
            System.out.println(x / 5);
            return;
        }

        System.out.println((x / 5) + 1);
    }

}
