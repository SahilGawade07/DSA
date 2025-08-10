public class reversePrefixOfWord_2000 {
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';
        System.out.println(fn(word, ch));
    }

    public static String fn(String word, char ch) {
        // int indexOfChar = word.indexOf(ch);
        // StringBuffer str = new StringBuffer(word.substring(0, indexOfChar + 1));

        // str.append(word .substring(indexOfChar + 1, word.length()));

        char stack[] = new char[word.length()];
        int top = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                stack[i] = word.charAt(i);
                top = i;
                break;
            }
            stack[i] = word.charAt(i);

        }

        StringBuffer ans = new StringBuffer();

        for (int i = top; i >= 0; i--) {
            ans.append(stack[i]);
        }
        for (int i = top + 1; i < word.length(); i++) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}
