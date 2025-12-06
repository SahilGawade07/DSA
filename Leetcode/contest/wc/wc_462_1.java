package contest.wc;

public class wc_462_1 {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int x = 1, y = 0, k = 3;

        int sr = x, er = x + k - 1;
        int sc = y, ec = y + k - 1;

        while (sr < er) {
            for (int i = sc; i <= ec; i++) {
                int c = grid[sr][i];
                grid[sr][i] = grid[er][i];
                grid[er][i] = c;

            }
            sr++;
            er--;
        }

        for (int i = 0; i < grid.length; i++) { // loop for rows
            for (int j = 0; j < grid[i].length; j++) { // loop for columns
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
