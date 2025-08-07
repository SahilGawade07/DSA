public class sqrt_x_69 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(fn(x));
    }

    public static int fn(int x) {
        if (x == 0 || x == 1)
            return x;

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid <= x / mid) { 
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
