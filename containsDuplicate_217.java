import java.util.HashMap;

class containsDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(fn(nums));
    }

    public static boolean fn(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}