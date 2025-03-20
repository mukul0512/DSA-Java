import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementFromAnArrayUsingHashSet {
    public static void findDuplicateElementFromAnArrayUsingHashSet(int arr[]) {
        Set<Integer> hs = new HashSet<>();
        for (int num : arr) {
            if (!hs.add(num)) {
                System.out.println("The duplicate element is : " + num);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6, 7 };
        findDuplicateElementFromAnArrayUsingHashSet(arr);
    }
}
