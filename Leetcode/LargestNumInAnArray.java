public class LargestNumInAnArray {
    public static int largestNumInAnArray(int arr[]) {
        int largest_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest_num) {
                largest_num = arr[i];
            }
        }
        return largest_num;
    }

    public static void main(String[] args) {
        int arr[] = { 34, 69, 89, 32, 9, 45 };
        System.out.println(largestNumInAnArray(arr));
    }
}
