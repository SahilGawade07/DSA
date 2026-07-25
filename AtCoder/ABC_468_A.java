
import java.util.Scanner;

public class ABC_468_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i = 0;i < N-2;i++){
            if(A[i] < A[i+1] && A[i+2] < A[i+1]){
                count++;
            }
        }

        System.out.println(count);


        sc.close();
    }
}
