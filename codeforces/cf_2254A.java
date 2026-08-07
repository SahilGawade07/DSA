import java.util.*;

public class cf_2254A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int round = 0;
            while (true) {
                if (a == b || a == c || b == c) {
                    System.out.println(round);
                    break;
                }

                if (a > b && a > c) {
                    if (b > c) {
                        c++;
                        a--;
                    } else {
                        b++;
                        a--;
                    }
                } else if (b > a && b > c) {
                    if (a > c) {
                        c++;
                        b--;
                    } else {
                        a++;
                        b--;
                    }
                } else {
                    if (a > b) {
                        b++;
                        c--;
                    } else {
                        a++;
                        c--;
                    }
                }
                round++;
            }

        }

    }

}
