public class baseBallGame_682 {
    public static void main(String[] args) {
        String operations[] = { "1", "C" };
        System.out.println(fn(operations));
    }

    public static int fn(String[] operations) {
        int ind = 0;
        int ans[] = new int[operations.length];
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == "C") {
                ind--;
            } else if (operations[i] == "D") {
                ans[ind] = ans[ind - 1] * 2;
                ind++;
            } else if (operations[i] == "+") {
                ans[ind] = ans[ind - 2] + ans[ind - 1];
                ind++;

            } else {
                ans[ind] = Integer.parseInt(operations[i]);
                ind++;
            }

        }
        if (ind == 0) {
            return 0;
        }
        int i = 0;
        int sum = 0;
        while (ans[i] != 0) {
            sum += ans[i];
            i++;
        }
        return sum;
    }
}
