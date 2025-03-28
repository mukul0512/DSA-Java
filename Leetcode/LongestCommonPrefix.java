import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String strs[]) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        /*
         * 
         * if (index == 0) {
         * return " ";
         * } else {
         * return str1.substring(0, index);
         * }
         * 
         */

        return index == 0 ? " " : str1.substring(0, index);
    }

    public static void main(String args[]) {
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}

/*
 * JavaScript code
 * 
 * function longestCommonPrefix(strs) {
 * if (strs.length === 0) return "";
 * 
 * strs.sort();
 * const str1 = strs[0];
 * const str2 = strs[strs.length - 1];
 * let index = 0;
 * 
 * while (index < str1.length) {
 * if (str1[index] === str2[index]) {
 * index++;
 * } else {
 * break;
 * }
 * }
 * 
 * return index === 0 ? " " : str1.substring(0, index);
 * }
 * 
 * // Example usage
 * const strs = ["flower", "flow", "flight"];
 * console.log(longestCommonPrefix(strs)); // Output: "fl"
 * 
 * 
 */
