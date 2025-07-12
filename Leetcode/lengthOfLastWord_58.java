public class lengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "day";
        int i;
        int len = 0;
        int ascii;
        int flag = 0;
        int startIndex = s.length() - 1;

        for (i = s.length() - 1; i > 0; i--) {
            ascii = s.charAt(i);
            if (ascii != 32 && flag == 0) {
                flag = 1;
                startIndex = i;
            }
            if (ascii == 32 && flag == 1) {
                len = startIndex - i;
                break;

            }

        }
        if (startIndex == 0)
            len = 1;
        if (len == 0)
            len = startIndex + 1;
        System.out.println(len);
    }
}
