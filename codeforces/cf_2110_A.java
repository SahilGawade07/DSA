import java.util.*;

public class cf_2110_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if ((arr[0] + arr[n - 1]) % 2 == 0) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            while ((arr[left] % 2) != (arr[n - 1] % 2)) {
                left++;
            }

            int right = n - 1;
            while ((arr[right] % 2) != (arr[0] % 2)) {
                right--;
            }

            System.out.println(Math.min(left, n - 1 - right));
        }
    }
}