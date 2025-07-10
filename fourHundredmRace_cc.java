import java.util.Scanner;

public class fourHundredmRace_cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int avgX = 400 / X;
            int avgY = 400 / Y;
            int avgZ = 400 / Z;

            if (avgX > avgY && avgX > avgZ) {
                System.out.println("ALICE");
            } else if (avgY > avgX && avgY > avgZ) {
                System.out.println("BOB");
            } else {
                System.out.println("CHARLIE");
            }
        }
        sc.close();
    }
}
