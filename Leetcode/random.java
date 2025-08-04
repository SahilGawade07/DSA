public class random {
    public static void main(String[] args) {
        String input = "hello world";
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            res.append(' ');
        }


        for (int i = 0; i < input.length(); i++) {
            char targetChar = input.charAt(i);

            if (targetChar == ' ') {
                res.setCharAt(i, ' ');
                System.out.println(res);
                continue;
            }

            for (char c = 'a'; c <= targetChar; c++) {
                res.setCharAt(i, c);
                System.out.println(res);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
