
public class strictlyPalindromicNumber_2396 {

    public static void main(String[] args) {
        int n = 1;

        System.out.println(function(n));
        //System.out.println(isPalindrome("abab"));
    }

    static boolean function(int n) {
        boolean ans = false;
        for (int i = 2; i < n - 2; i++) {
            String num = Integer.toString(n, i);
            if (!isPalindrome(num)) {
                break;
            }
            if (n - 2 == i) {
                return true;
            }

        }
        return false;
    }

    static boolean isPalindrome(String num) {
        //one pointer O(n)
        // StringBuilder s = new StringBuilder();
        // for (int i = num.length() - 1; i >= 0; i--) {
        //     s.append(num.charAt(i));
        // }
        // if (num.equals(s.toString())) {
        //     return true;
        // }

        
        // two pointer O(log n)
        int i = 0, j = num.length() - 1;
        while( i < j){
            System.out.println("a");
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
