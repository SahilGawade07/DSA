public class smallestDivisibleDigitProduct1_3345 {
    public static void main(String[] args) {
        System.out.println(function(10, 2));
    }

    static int function(int n, int t) {
        while (true) {
            int product = 1;
            int temp = n;
            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }
            if (product % t == 0) {
                return n;
            } else {
                n++;
            }
        }
    }
}
