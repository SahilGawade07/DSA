// Incomplete solution

import java.util.ArrayList;

public class findTheWinnerOfTheCircularGame_1823 {
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        System.out.println(fn(n, k));
    }

    public static int fn(int n, int k) {
        int ind = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            al.add(i);
        }
        System.out.println(al);
        while (al.size() > 1) {

            for (int j = 0; j < k; j++) {
                if (j == k - 1) {
                    System.out.println(al.removeFirst());
                    // al.removeFirst();
                }
                al.add(al.remove(ind));
                System.out.println(al);
            }
            // if (count == k) {
            // al.remove(ind);
            // System.out.println(al);
            // ind++;
            // count = 1;
            // continue;
            // }
            // if (ind >= n) {
            // ind = 1;
            // count++;
            // continue;
            // }

            // ind++;
            // count++;

        }
        System.out.println(al);
        return al.getFirst();
    }
}
