import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(", "); // arr = ["dog", "cat", "cat", "dog"];
        if (pattern.length() != arr.length) { // 4, 4
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>(); // hm = [:]
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i); // i = 0, ch = a, containskey = false, arr[i] = dog, hm[a: "dog"]
            boolean containsKey = hm.containsKey(ch); // i = 1, ch = b, containsKey = false, arr[i] =cat, hm[a: "dog",
                                                      // b: "cat"]
            if (hm.containsValue(arr[i]) && !containsKey) { // i = 2, ch = b, containsKey = true, arr[i] = cat, hm[a:
                                                            // "dog", b: "cat"]
                return false; // i = 3, ch = a, containsKey = true, arr[i] = dog, hm[a: "dog", b: "cat"]
            }
            if (containsKey && !hm.get(ch).equals(arr[i])) {
                return false;
            } else {
                hm.put(ch, arr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog, cat, cat, dog";
        System.out.println(wordPattern(pattern, s));
    }
}
