import java.util.Scanner;

public class ABC_413_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int M = sc.nextInt();

        int nums[] = new int[N];
        for(int i =0;i<N;i++){
            nums[i] = sc.nextInt();

        }
        int sum =0;
        for(int i:nums){
            sum += i;
        }

        if(sum < M){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        sc.close();
    }
}
