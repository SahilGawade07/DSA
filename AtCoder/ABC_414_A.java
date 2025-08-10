import java.util.Scanner;

public class ABC_414_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        int t1[] = new int[N];
        int t2[] = new int[N];

        for (int i = 0; i < N; i++) {
            t1[i] = sc.nextInt();
            t2[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (t1[i] <= L && t2[i] >= R) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
