public class plusOne_66 {
    public static void main(String[] args) {
        int digits[] = { 9, 8, 9 };

        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i > 0; i--) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
            for (int i : digits) {
                System.out.println(i);
            }
            if (digits[0] == 10) {
                int arr[] = new int[digits.length + 1];
                for (int i = digits.length - 1; i > 0; i--) {
                    arr[i + 1] = 0;
                }
                arr[0] = 1;

                for (int i : arr) {
                    System.out.println(i);
                }
            }

        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            for (int i : digits) {
                System.out.println(i);
            }
        }

    }
}
