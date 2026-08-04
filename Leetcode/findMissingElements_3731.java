import java.util.*;

public class findMissingElements_3731 {
    public static void main(String[] args) {
        int nums[] = { 1,5 };
        System.out.println(function(nums));

    }

    static List<Integer> function(int nums[]) {
        List ans = new ArrayList();
        Arrays.sort(nums);

        for (int i = nums[0] + 1; i < nums[nums.length - 1]; i++) {
            ans.add(i);
        }
        for (int i = 1; i < nums.length; i++) {
            if (i != nums.length - 1) {
                if (ans.contains(nums[i])) {
                    ans.remove(Integer.valueOf(nums[i]));
                }
            }
        }

        return ans;
    }
}
