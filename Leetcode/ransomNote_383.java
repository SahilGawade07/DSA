public class ransomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aaba";
        System.out.println(fn(ransomNote, magazine));

    }

    public static boolean fn(String ransomNote, String magazine) {
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer(magazine);

        while (i < ransomNote.length() && j < sb.length()) {
            if (ransomNote.charAt(i) == magazine.charAt(j)) {
                i++;
                sb.deleteCharAt(j);
                if (i == ransomNote.length() - 1 || j == sb.length() - 1) {
                    return true;
                }

            }
            j++;
        }
        return false;

    }
}
