public class mergeSortedArray_88 {

    public static int[] addElementAt(int[] nums1, int index, int value) {
        for (int i = nums1.length - 2; i >= index; i--) {
            nums1[i + 1] = nums1[i];
        }
        nums1[index] = value;
        return nums1;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };

        int m = 3, n = 3;
        int afterSize = m;
        int i2 = 0;

        if (m == 0) {
            int i = 0, j = 0;
            while (i < m + n) {
                nums1[i++] = nums2[j++];
            }
        } else {
            for (int i = 0; i < afterSize && i2 < n; i++) {
                if (nums1[i] <= nums2[i2] && nums1[i + 1] >= nums2[i2]) {
                    addElementAt(nums1, i + 1, nums2[i2]);
                    i2++;
                    afterSize++;
                }
            }

            while (i2 < n) {
                nums1[afterSize++] = nums2[i2++];
            }
        }

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
