public class climbingStairs_70Recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fn(n));
    }

    static int fn(int n) {
        if (n == 0 || n == 1)
            return 1;

        int left = fn(n - 1);

        int right = fn(n - 2);

        return left + right;
    }
}
