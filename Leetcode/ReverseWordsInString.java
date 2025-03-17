public class ReverseWordsInString {
    public static String reverseWordsInString(String s) {
        String words[] = s.split(" +"); // split(" +") function is used for separation of words.
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim(); // trim() function is used for remove leading and trailing spaces(extra spaces).
    }

    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(reverseWordsInString(s));
    }
}
