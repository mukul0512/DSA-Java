package Recursion;

public class PrintKeypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"} ;
    public static void printKeypadCombination(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++) {
            printKeypadCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printKeypadCombination(str, 0, " ");
    }
}
