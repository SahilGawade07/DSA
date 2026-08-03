import java.util.*;

public class subsets2_90 {
    public static void main(String[] args) {
        int nums[] = { 4, 4, 4, 1, 4 };
        System.out.println(function(nums));

    }

    static List<List<Integer>> function(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        List<Integer> op = new ArrayList<>();
        subset(list, op, l);
        return l;
    }

    static void subset(List<Integer> list, List<Integer> op, List<List<Integer>> ans) {
        if (list.isEmpty()) {
            op.sort(Comparator.naturalOrder());

            if (!ans.contains(op)) {
                ans.add(op);
            }
            return;
        }
        List<Integer> l = new ArrayList<>(op);
        l.add(list.get(0));
        subset(list.subList(1, list.size()), l, ans);
        subset(list.subList(1, list.size()), op, ans);

    }
}
