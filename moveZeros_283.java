public class moveZeros_283 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        int n2[] = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                n2[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = n2[i];
            System.out.println(nums[i]);
        }
    }

}
