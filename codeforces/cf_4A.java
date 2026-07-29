import java.util.Scanner;

public class cf_4A {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("NO");
            return;
        }
        if(n%2 == 0){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
