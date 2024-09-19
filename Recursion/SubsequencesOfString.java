package Recursion;

public class SubsequencesOfString {
    public static void subsequencesOfString(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequencesOfString(str, idx + 1, newString + currChar);
        // or not to be
        subsequencesOfString(str, idx + 1, newString);
    }
    public static void main(String args[]) {
        String str = "abc";
        subsequencesOfString(str, 0, " ");
    }
}
