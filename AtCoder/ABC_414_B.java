import java.util.Scanner;
import java.math.BigInteger;

public class ABC_414_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] ch = new char[N];
        BigInteger[] nums = new BigInteger[N];

        for (int i = 0; i < N; i++) {
            ch[i] = sc.next().charAt(0);
            nums[i] = sc.nextBigInteger();
        }

        BigInteger limit = BigInteger.valueOf(100);
        BigInteger length = BigInteger.ZERO;
        for (BigInteger n : nums) {
            length = length.add(n);
            if (length.compareTo(limit) > 0)
                break;
        }

        if (length.compareTo(limit) > 0) {
            System.out.println("Too Long");
            sc.close();
            return;
        }

        StringBuilder sb = new StringBuilder(length.intValueExact());

        for (int i = 0; i < N; i++) {
            int repeat = nums[i].intValueExact();
            for (int j = 0; j < repeat; j++) {
                sb.append(ch[i]);
            }
        }

        System.out.println("String is " + sb);
        sc.close();

    }
}
