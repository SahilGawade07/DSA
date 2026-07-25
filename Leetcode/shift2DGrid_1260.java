
import java.util.ArrayList;
import java.util.List;

public class shift2DGrid_1260 {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}, // {1, 2, 3, 4},
        // { 5, 6, 7,8},
        // { 9,10,11,12}, 
        };

        int k = 2;

        shift2DGrid_1260 obj = new shift2DGrid_1260();
        List<List<Integer>> ans = obj.shiftGrid(grid, k);

        for (List<Integer> row : ans) {
            System.out.println(row);
        }
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int a = 0; a < k; a++) {
            int last = grid[m - 1][n - 1];
            int popped;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    popped = grid[i][j];
                    grid[i][j] = last;
                    last = popped;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}
