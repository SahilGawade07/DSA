package codeforces;

import java.util.*;

public class round_1042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int z = 0; z < testCases; z++) {
            int n = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int iteration = 0;
            while (true) {
                boolean decreased = false;

                // Step 1: decrease one element if possible
                for (int i = 0; i < n; i++) {
                    if (a[i] > b[i]) {
                        a[i]--;
                        decreased = true;
                        break; // only one element per step
                    }
                }

                if (!decreased)
                    break; // stop if step 1 was ignored

                // Step 2: increase one element if possible
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        a[i]++;
                        break; // only one element per step
                    }
                }

                iteration++;

            }

            System.out.println(iteration + 1);

        }
        sc.close();

    }
}
