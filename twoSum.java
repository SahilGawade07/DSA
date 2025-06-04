class twoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 18;

        int i = 0, j = 0;
        while (i < nums.length) {
            for (j = i + 1; j < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    break;
                }
                j++;
            }
            i++;
        }
    }
}