
import java.util.*;

public class cf_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() == 1){
            System.out.println(s);
            return;
        }
        int ans[] = new int[(s.length() / 2) + 1];
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                int num = s.charAt(i) - '0';
                ans[ind] = num;
                ind++;
            }
        }

        Arrays.sort(ans);
        for (int i=0;i<ans.length;i++) {

            if(i == ans.length-1) {
                System.out.print(ans[i]);
                continue;
            }
            System.out.print(ans[i] + "+");
        }

    }

}
