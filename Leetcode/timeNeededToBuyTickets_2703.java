//This is not complete solution

public class timeNeededToBuyTickets_2703 {
    public static void main(String[] args) {
        int tickets[] = { 5, 1, 1, 1 };
        int k = 2;
        int no = tickets[2];
        int time = 0;
        for (int i = 0; i < k; i++) {
            if (tickets[i] <= k) {
                time += tickets[i];
            }
            time += no;
        }
        System.out.println(time);
    }
}
