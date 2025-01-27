public class Smallest {
    public static int smallestStartingFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}