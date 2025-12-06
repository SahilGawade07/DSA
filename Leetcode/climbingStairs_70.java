public class climbingStairs_70 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(fn(n));
    }

    static int fn(int n) {
        int arr[] = new int[n];
        if (arr.length <= 1) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[arr.length - 1] + arr[arr.length - 2];
    }
}
