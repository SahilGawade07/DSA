public class addStrings_415 {

    public static void main(String[] args) {
        System.out.println(func("456", "77"));
    }

    static String func(String num1, String num2) {

        String ans = "";

        if (num1.length() > num2.length()) {

            int sizediff = num1.length() - num2.length();

            int carry = 0;

            for (int i = num1.length() - 1; i >= 0; i--) {

                int a;

                if (i - sizediff >= 0) {

                    a = Character.getNumericValue(num1.charAt(i))
                            + Character.getNumericValue(num2.charAt(i - sizediff))
                            + carry;

                } else {

                    a = Character.getNumericValue(num1.charAt(i)) + carry;
                }

                carry = a / 10;

                a = a % 10;

                char ch = (char) (a + '0');

                ans = ans + ch;
            }

            if (carry > 0) {
                ans = ans + (char) (carry + '0');
            }

        } else {

            int sizediff = num2.length() - num1.length();

            int carry = 0;

            for (int i = num2.length() - 1; i >= 0; i--) {

                int a;

                if (i - sizediff >= 0) {

                    a = Character.getNumericValue(num2.charAt(i))
                            + Character.getNumericValue(num1.charAt(i - sizediff))
                            + carry;

                } else {

                    a = Character.getNumericValue(num2.charAt(i)) + carry;
                }

                carry = a / 10;

                a = a % 10;

                char ch = (char) (a + '0');

                ans = ans + ch;
            }

            if (carry > 0) {
                ans = ans + (char) (carry + '0');
            }
        }

        StringBuilder revans = new StringBuilder(ans);

        return revans.reverse().toString();
    }
}