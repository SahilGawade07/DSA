import java.util.Arrays;

public class missingNumber_238 {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        System.out.println(fn(nums));
    }

    public static int fn(int[] nums) {
        Arrays.sort(nums);
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                System.out.println(nums[i] + "  " + num);
                num++;
                continue;
            } else {
                return nums[i] - 1;
            }
            // return nums[i] + 1;
        }
        // if (nums[0] == 0 && i)
        return nums[nums.length - 1] + 1;
    }
}
