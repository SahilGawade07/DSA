//Incomplete

import java.util.*;

public class triangle_120 {
    public static void main(String[] args) {
        // Example test case
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        Solution sol = new Solution();
        int result = sol.minimumTotal(triangle);

        System.out.println("Output: " + result); // Expected: 11
    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (int i = 0; i < triangle.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (triangle.get(i).get(j) < min) {
                    min = triangle.get(i).get(j);
                }
            }
            sum += min;
        }
        return sum;
    }
}
