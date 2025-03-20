public class ReverseAString {
    public static void reverseAString(String str) {
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        String str = "INTERVIEW";
        reverseAString(str);
    }
}
