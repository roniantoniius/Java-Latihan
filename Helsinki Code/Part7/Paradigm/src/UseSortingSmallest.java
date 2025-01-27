public class UseSortingSmallest {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, 99, 3, 12};
        System.out.println("Array sebelum sorting:");
        printArray(numbers);

        Sorting.sort(numbers);
        System.out.println("Array setelah sorting:");
        printArray(numbers);

        System.out.println("Apakah array terurut? " + Checker.isSorted(numbers));
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}