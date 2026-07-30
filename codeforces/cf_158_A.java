
import java.util.*;

public class cf_158_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[0] == 0){
            System.out.println(0);
            return;
        }
        int ind = 0;
        int ans = 0;
        if(arr[k-1] == 0){
            while(arr[ind] != 0){
                ans++;
                ind++;
            }
            System.out.println(ans);
            return;

        }
        int sameCount = 0;
        for(int i = k;i<n;i++){
            if(arr[i] == arr[k-1]){
                sameCount++;
            }
        }

        System.out.println(k+sameCount);
    }
}
