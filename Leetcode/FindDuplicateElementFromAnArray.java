public class FindDuplicateElementFromAnArray {
    public static void findDuplicateElementFromAnArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate element is : " + arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6 };
        findDuplicateElementFromAnArray(arr);
    }
}
