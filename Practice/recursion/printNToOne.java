public class printNToOne {
    public static void main(String[] args) {
        int n = 8;
        function(n);

    }

    static void function(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        function(n - 1);
    }
    
}
