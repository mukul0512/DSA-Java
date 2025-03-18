public class SmallestNumInAnArray {
    public static int smallestNumInAnArray(int arr[]) {
        int smallest_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest_num) {
                smallest_num = arr[i];
            }
        }
        return smallest_num;
    }

    public static void main(String[] args) {
        int arr[] = { 34, 69, 89, 32, 9, 45 };
        System.out.println(smallestNumInAnArray(arr));
    }
}
