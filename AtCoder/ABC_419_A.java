
import java.util.*;

class ABC_419_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        if (S.equals("red")) {
            System.out.println("SSS");
        } else if (S.equals("blue")) {
            System.out.println("FFF");
        } else if (S.equals("green")) {
            System.out.println("MMM");
        } else {
            System.out.println("unknown");
        }
        sc.close();
    }
}
