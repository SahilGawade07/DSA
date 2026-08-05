public class minimumNumberOfOperationsToMoveAllBallsToEachBox_1769 {
    public static void main(String[] args) {
        String boxes = "001011";
        int ans[] = function(boxes);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static int[] function(String boxes) {
        int ans[] = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}
