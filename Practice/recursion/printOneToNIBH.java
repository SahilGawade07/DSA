public class printOneToNIBH {
    public static void main(String[] args) {
        function(7);
    }

    static int function(int n) {
        if (n == 1) {
            System.out.println(1);
            return n;
        }
        function(n - 1);


        System.out.println(n);
        return 0;
    }

}
