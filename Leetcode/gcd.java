class gcd {
    public static void main(String[] args) {
        int a = 36, b = 60;
        System.out.println(fn(a, b));
    }

    public static int fn(int a, int b) {
        int limit = a < b ? a : b;
        int gcd = 0;
        for (int i = 2; i <= limit; i++) {

            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }

        }
        if (gcd == 0) {
            gcd = 1;
        }
        System.out.println(gcd);

        return 0;
    }
}