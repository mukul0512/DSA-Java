import java.util.Arrays;

public class DistinctDifferenceArray {
    public static int[] distinctDifferenceArray(int nums[]) {
        int diff[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int countPrefix = countDistinctElements(nums, 0, i);
            int countSuffix = countDistinctElements(nums, i + 1, nums.length - 1);
            diff[i] = countPrefix - countSuffix;
        }
        return diff;
    }

    public static int countDistinctElements(int nums[], int start, int end) {
        boolean visited[] = new boolean[1000001];
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!visited[nums[i]]) {
                visited[nums[i]] = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }
}
