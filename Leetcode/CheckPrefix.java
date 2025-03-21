public class CheckPrefix {
    public static int checkPrefix(String sentence, String searchWord) {
        String sentences[] = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(checkPrefix(sentence, searchWord));
    }
}
