public class IndexOfFirstOccurrenceInString {
    public static int indexOfFirstOccurrenceInString(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOfFirstOccurrenceInString("sadbutsad", "sad"));
    }
}

/*
 * 
 * In JavaScript
 * 
 * function indexOfFirstOccurrenceInString(haystack, needle) {
 * for (let i = 0; i <= haystack.length - needle.length; i++) {
 * if (haystack[i] === needle[0]) {
 * if (haystack.substring(i, i + needle.length) === needle) {
 * return i;
 * }
 * }
 * }
 * return -1;
 * }
 * 
 * console.log(indexOfFirstOccurrenceInString("sadbutsad", "sad")); // Output: 0
 * 
 * 
 */
