public class CountNumberOfCharacters {
    public static void countNumberOfCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Number of character in a string are : " + count);
    }

    public static void main(String[] args) {
        String str = "Hello Java";
        countNumberOfCharacters(str);
    }
}