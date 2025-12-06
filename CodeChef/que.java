import java.util.HashMap;
import java.util.Map;

public class que {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3, 2, 3, 2, 3 };
        int queries[][] = { { 0, 6, 4 }, { 1, 5, 2 }, { 2, 4, 1 }, { 3, 3, 1 } };
        int ans[] = fn(nums, queries);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] fn(int[] nums, int[][] queries) {
        int ans[] = new int[queries.length];
        int ind = 0;
        boolean valInserted = false;

        for (int i = 0; i < queries.length; i++) {
            valInserted = false;
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (!hm.containsKey(nums[j])) {
                    hm.put(nums[j], 1);
                } else {
                    hm.put(nums[j], hm.get(nums[j]) + 1);
                }
            }

            int bestFreq = 0;
            int bestKey = -1;

            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() >= queries[i][2]) {
                    if (entry.getValue() > bestFreq || (entry.getValue() == bestFreq && entry.getKey() < bestKey)) {
                        bestFreq = entry.getValue();
                        bestKey = entry.getKey();
                        valInserted = true;
                    }
                }
            }

            if (valInserted) {
                ans[ind] = bestKey;
            } else {
                ans[ind] = -1;
            }

            ind++;
        }

        return ans;
    }
}
