public class Sorting {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = Smallest.smallestStartingFrom(array, i);
            Swapper.swap(array, i, smallestIndex);
        }
    }
}