
public class maximumProductOfThreeNumbers_628 {

    public static void main(String[] args) {
        int nums[] = {-100,-98,-1,2,3,4};
        System.out.println(function(nums));

    }

    static int function(int[] nums) {
        int top[] = new int[3];
        int bot[] = new int[2];
        for (int i = 0; i < top.length; i++) {
            top[i] = Integer.MIN_VALUE;
        }
        bot[0] = Integer.MAX_VALUE;
        bot[1] = Integer.MAX_VALUE;
       

        for (int i = 0; i < nums.length; i++) {
            if (top[0] < nums[i]) {
                top[2] = top[1];
                top[1] = top[0];
                top[0] = nums[i];
                continue;

            }
            if (top[1] < nums[i]) {
                top[2] = top[1];
                top[1] = nums[i];
                continue;
            }
            if (top[2] < nums[i]) {
                top[2] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (bot[0] > nums[i]) {
                bot[1] = bot[0];
                bot[0] = nums[i];
                continue;

            }
            if (bot[1] > nums[i]) {
                bot[1] = nums[i];
            }
        }

        int ans = Math.max(top[0]*top[1]*top[2], bot[0]*bot[1]*top[0]);



        return ans;
    }
}
