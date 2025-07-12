public class searchInsertPosition_35 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 2;

        int i = 0;
        int j = nums.length - 1;
        int index = -1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (target < nums[mid]) {
                j = mid - 1;

            } else if (target > nums[mid]) {
                i = mid + 1;
            }
        }

        System.out.println(index);
        if (index == -1) {
            i = 0;
            while (i < nums.length - 1) {
                if (target > nums[i] && target < nums[i + 1]) {
                    index = i + 1;
                    break;
                }
                i++;
            }
            if (index == -1) {
                index = nums.length;
            }

            if (target < nums[0]) {
                index = 0;
            }
        }

        System.out.println(index);
    }
}
