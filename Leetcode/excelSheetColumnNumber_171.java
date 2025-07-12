public class excelSheetColumnNumber_171 {
    public static void main(String[] args) {
        System.out.println(fn("AA"));

    }

    public static int fn(String columnTitle) {
        int num = 0;
        int i = columnTitle.length() - 1;
        int pow = 0;

        while (i >= 0) {
            num += ((int) Math.pow(26, pow)) * ((int) columnTitle.charAt(i) - 64);
            pow++;
            i--;
        }

        return num;
    }
}
