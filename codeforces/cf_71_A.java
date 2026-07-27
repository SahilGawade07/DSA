import java.util.Scanner;

public class cf_71_A {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int  i=0;i<n;i++){
            s[i] = sc.next();
        }

        for(String m: s){
            if(m.length() <11){
                System.out.println(m);
                continue;
            }
            String length = Integer.toString(m.length()-2);
            System.out.println(m.charAt(0)+ length+m.charAt(m.length()-1));
        }
    }
}
