import java.util.HashMap;

class containsDuplicate {
    public static void main(String[] args) {
        int prices[] = { 1, 2, 3, 4 };
        System.out.println(fn(prices));
    }

    public static boolean fn(int prices[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            if (hm.containsKey(prices[i])) {
                return true;
            } else {
                hm.put(prices[i], i);
            }
        }
        return false;
    }
}