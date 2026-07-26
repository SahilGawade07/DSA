import java.util.Scanner;

public class ABC_468_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int M = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();

        boolean flag = false;
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {

                flag = false; // Reset for each '.' cell

                // Check left
                for (int j = i - 1; j >= Math.max(0, i - D); j--) {
                    if (S.charAt(j) == 'G') {
                        flag = true;
                        break;
                    }
                }

                // Check right only if not already watched
                if (!flag) {
                    for (int j = i + 1; j <= Math.min(i + D, M - 1); j++) {
                        if (S.charAt(j) == 'G') {
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}