public class addBinary_67 {
    public static void main(String[] args) {
        String a = "100";
        String b = "110010";

        StringBuffer aPadded = new StringBuffer();
        StringBuffer bPadded = new StringBuffer();
        StringBuffer ans = new StringBuffer();
        int carry = 0;

        int maxLength = Math.max(a.length(), b.length());
        int aPad = maxLength - a.length();
        int bPad = maxLength - b.length();

        for (int i = 0; i < aPad; i++)
            aPadded.append('0');
        aPadded.append(a);

        for (int i = 0; i < bPad; i++)
            bPadded.append('0');
        bPadded.append(b);

        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = aPadded.charAt(i) - '0';
            int bitB = bPadded.charAt(i) - '0';
            int sum = bitA + bitB + carry;

            ans.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1)
            ans.append('1');

        ans.reverse();
        System.out.println(ans.toString());
    }
}
