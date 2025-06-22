import java.util.HashMap;
import java.util.Map;

public class majorityElement_169 {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(fn(nums));
    }

    public static int fn(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int maxKey = 0;

        for (int i : nums) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
