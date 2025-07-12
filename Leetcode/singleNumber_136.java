import java.util.HashMap;
import java.util.Map;

public class singleNumber_136 {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.remove(nums[i]);
            } else {
                hm.put(nums[i], i);
            }
        }
        Map.Entry<Integer, Integer> entry = hm.entrySet().iterator().next();
        System.out.println(entry.getKey());
    }
}
