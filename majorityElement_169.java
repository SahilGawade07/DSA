// import java.util.HashMap;
// import java.util.Map;

// public class majorityElement_169 {
//     public static void main(String[] args) {
//         int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
//         System.out.println(fn(nums));
//     }

//     public static int fn(int nums[]) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int max = 0;
//         int maxKey = 0;

//         for (int i : nums) {
//             if (hm.containsKey(i)) {
//                 hm.put(i, hm.get(i) + 1);
//             } else {
//                 hm.put(i, 1);
//             }
//         }

//         for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//             if (entry.getValue() > max) {
//                 max = entry.getValue();
//                 maxKey = entry.getKey();
//             }
//         }
//         return maxKey;
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class majorityElement_169 {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(fn(nums));
    }

    public static int fn(int nums[]) {
        int candidate = 0;
        int count = 0;

        for(int i : nums){
        candidate = i;
        if()
        }

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == candidate) {
        //         count++;
        //     } else if (nums[i] != candidate && count != 0) {
        //         candidate = nums[i];
        //         count = 1;
        //     } else {
        //         candidate = nums[i];
        //         count = 1;
        //     }
        // }
        return candidate;
    }
}
