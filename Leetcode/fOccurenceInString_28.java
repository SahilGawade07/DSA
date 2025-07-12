
public class fOccurenceInString_28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";
        int index = 0;
        int j = needle.length();

        if (!(haystack.length() < needle.length())) {
            for (int i = 0; i < haystack.length(); i++) {
                int left = i + j;
                if (left <= haystack.length()) {
                    String subs = haystack.substring(i, left);
                    if (subs.equals(needle)) {
                        index = i;

                        break;
                    } else {
                        index = -1;
                    }
                }
            }
        } else {
            index = -1;
        }

        System.out.println(index);

    }
}