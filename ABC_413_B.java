import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC_413_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s[] = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextLine();
        }
        Set<String> st = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    st.add(s[i] + s[j]);
                }
            }
        }

        System.out.println(st.size());
        sc.close();
    }
}
