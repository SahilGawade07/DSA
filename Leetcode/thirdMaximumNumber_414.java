import java.util.*;

public class thirdMaximumNumber_414 {
    public static void main(String[] args) {
        // Example test case
        int[] nums = { 2, 2, 3, 1 };
        // int[] nums = { 1, 2 };
        // int[] nums = { 1, 2, 3 };

        Solution sol = new Solution();
        int result = sol.thirdMax(nums);

        System.out.println("Output: " + result); // Expected: 1
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] > firstMax) {
        // firstMax = nums[i];
        // continue;
        // }
        // if (nums[i] > secondMax && nums[i] < firstMax) {
        // secondMax = nums[i];
        // continue;
        // }
        // if (nums[i] > thirdMax && nums[i] < secondMax) {
        // thirdMax = nums[i];
        // continue;
        // }
        // }

        // System.out.println(firstMax + " " + secondMax + " " + thirdMax);

        Arrays.sort(nums);

        Set<Integer> st = new HashSet<>();
        int i = nums.length - 1;
        while (true) {
            System.out.print(i + " ");
            st.add(nums[i]);
            i--;
            System.out.println(st.size());
            if (st.size() == 3) {
                System.out.println(nums[i]);
                return nums[i];
            }

        }
    }
}
