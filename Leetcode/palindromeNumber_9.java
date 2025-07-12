public class palindromeNumber_9 {
    public static void main(String[] args) {
        int x = 1231;
        String num = Integer.toString(x);
        int i = 0, j = num.length() - 1;

        while (i < j) {
            if (num.charAt(i) != num.charAt(j)) {
                System.out.println("not a palinndrome");
                return;
            }

            i++;
            j--;
        }
        System.out.println("is a palindrome");

    }
}
