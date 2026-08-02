public class countFrequency {
    public static void main(String[] args) {
        String s = "saaas";
        char target = 's';
        function(s, target, s.length());
        System.out.println(ans);

    }

    static int ans = 0;

    static void function(String s, char target, int size) {
        if (size == 0) {
            return;
        }

        if (s.charAt(size - 1) == target) {
            ans++;
        }

        function(s, target, size - 1);

    }
}
