// import java.util.Stack;

// public class validParantheses_20 {
//     public static void main(String[] args) {
//         String s = "(})";
//         Stack<Character> stk = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             if ((s.charAt(0) == '}') || (s.charAt(0) == ']') || (s.charAt(0) == ')')) {
//                 System.out.println("not a valid");
//             } else if ((s.charAt(s.length() - 1) == '{') || (s.charAt(s.length() - 1) == '[')
//                     || (s.charAt(s.length() - 1) == '(')) {
//                 System.out.println("not a valid");
//             } else if (s.charAt(i) == '{') {
//                 stk.push('}');
//             } else if (s.charAt(i) == '(') {
//                 stk.push(')');
//             } else if (s.charAt(i) == '[') {
//                 stk.push(']');
//             } else if (s.charAt(i) == '}' && stk.peek() == '}') {
//                 stk.pop();
//             } else if (s.charAt(i) == ']' && stk.peek() == ']') {
//                 stk.pop();
//             } else if (s.charAt(i) == ')' && stk.peek() == ')') {
//                 stk.pop();
//             }

//             else if (!(s.charAt(i) == '}' && stk.peek() == '}')) {
//                 stk.pop();
//             } else if (!(s.charAt(i) == ']' && stk.peek() == ']')) {
//                 stk.pop();
//             } else if (!(s.charAt(i) == ')' && stk.peek() == ')')) {
//                 stk.pop();
//             }
//         }

//         if (stk.isEmpty()) {
//             System.out.println("s is a valid string");
//         } else {
//             System.out.println("s is a not a valid string");
//         }

//     }
// }

import java.util.Stack;

public class validParantheses_20 {
    public static void main(String[] args) {
        String s = "()";
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((s.charAt(0) == '}') || (s.charAt(0) == ']') || (s.charAt(0) == ')')) {
                System.out.println("not a valid");
            } else if ((s.charAt(s.length() - 1) == '{') || (s.charAt(s.length() - 1) == '[')
                    || (s.charAt(s.length() - 1) == '(')) {
                System.out.println("not a valid");
            }

            if ((ch == '{') || (ch == '[') || (ch == '(')) {
                if (ch == '{') {
                    stk.push('}');
                } else if (ch == '[') {
                    stk.push(']');
                } else if (ch == '(') {
                    stk.push(')');
                }
            } else {
                if (ch == stk.peek()) {
                    stk.pop();
                }
            }
        }

        if (stk.isEmpty()) {
            System.out.println("s is a valid string");
        } else {
            System.out.println("s is a not a valid string");
        }

    }
}
