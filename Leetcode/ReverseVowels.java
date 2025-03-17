public class ReverseVowels {
    public static String reverseVowels(String s) {

        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
