class twoSum_1 {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 18;
        int twoSums[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoSums[0] = i;
                    twoSums[1] = j;
                    break;
                }
            }
        }

        System.out.println("Indices: [" + twoSums[0] + ", " + twoSums[1] + "]");
        System.out.println("Value: [" + nums[twoSums[0]] + ", " + nums[twoSums[1]] + "]");
    }
}
