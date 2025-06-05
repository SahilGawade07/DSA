class removeElement_27 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int k = 0;
        int nums2[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums2[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);

    }
}