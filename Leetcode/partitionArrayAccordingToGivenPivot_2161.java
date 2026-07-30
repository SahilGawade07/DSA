import java.util.ArrayDeque;
import java.util.Queue;

public class partitionArrayAccordingToGivenPivot_2161 {

    public static void main(String[] args) {
        int nums[] = {-3,4,3,2};
        int pivot = 2;
        int nums2[] = function(nums, pivot);
        for (int i : nums2) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    static int[] function(int[] nums, int pivot) {

        // O(log N) space
        Queue<Integer> smaller = new ArrayDeque<>();
        Queue<Integer> greater = new ArrayDeque<>();
        int sameCount = 0;

        for (int i : nums) {
            if (i < pivot) {
                smaller.add(i);
            } else if (i == pivot) {
                sameCount++;
            } else {
                greater.add(i);
            }
        }
        int ans[] = new int[nums.length];
        int ind = 0;
        int loop1 = smaller.size();
        int loop2 = greater.size();
        for (int i = 0; i < loop1; i++) {
            ans[i] = smaller.poll();
            ind++;
        }

        int ind2 = ind;
        for (int i = ind; i < ind2+sameCount; i++) {
            ans[i] = pivot;
            ind++;
        }
        int ind3 = ind;
        for (int i = ind; i < ind3+loop2; i++) {
            ans[i] = greater.poll();
        }


        return ans;
    }
}
