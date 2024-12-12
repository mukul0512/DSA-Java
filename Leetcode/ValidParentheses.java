public class ValidParentheses {
    public static boolean validParentheses(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String args[]) {
        String s = "()[]{}";
        System.out.println(validParentheses(s));
    }
}
