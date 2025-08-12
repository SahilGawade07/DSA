public class contest462_1 {
    public static void main(String[] args) {
        int grid[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int x = 1, y = 0, k = 3;
        int horizontalLimit = y + (k - 1);
        int verticalLimit = x + (k - 1);

        for (int i = x; i <= horizontalLimit; i++) {
            for (int j = y; j <= verticalLimit; j++) {
                int c = grid[j][i];
                grid[j][i] = grid[j][i + 1];
                grid[j][i + 1] = c;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
