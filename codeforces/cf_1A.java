
import java.util.Scanner;

public class cf_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();

        long ntile = Math.ceilDiv(n, a);
        long mtile = Math.ceilDiv(m, a);

        System.out.println(ntile*mtile);
    }

    
}
