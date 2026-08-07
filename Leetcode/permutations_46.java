import java.util.*;

public class permutations_46 {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3 };

        List<List<Integer>> result = function(nums);

        System.out.println(result);

    }

    public static List<List<Integer>> function(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ip = new ArrayList<>();
        for (int i : nums) {
            ip.add(i);
        }
        List<Integer> op = new ArrayList<>();
        solve(ip, op, ans);

        return ans;
    }

    static void solve(List<Integer> ip, List<Integer> op, List<List<Integer>> ans) {
        if (ip.size() == 0) {
            ans.add(op);
            return;
        }

        for (int i = 0; i < ip.size(); i++) {
            List<Integer> newIp = new ArrayList<>(ip.subList(0, i));
            newIp.addAll(ip.subList(i + 1, ip.size()));

            List<Integer> newOp = new ArrayList<>(op);
            newOp.add(ip.get(i));
            solve(newIp, newOp, ans);
        }
    }
}