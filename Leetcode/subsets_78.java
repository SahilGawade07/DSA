import java.lang.reflect.Array;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(function(nums));
    }

    static List<List<Integer>> function(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(int i : nums){
            one.add(i);
        }

        recursion(l, one, op);

        return l;
    }

    static void recursion(List<List<Integer>> l, List<Integer> nums, List<Integer> op) {
        if (nums.isEmpty()) {
            l.add(op);
            return;
        }

        List<Integer> i = new ArrayList<>(op);
        i.add(nums.get(0));
        recursion(l, nums.subList(1, nums.size()), i);
        recursion(l, nums.subList(1, nums.size()), op);
    }
}
