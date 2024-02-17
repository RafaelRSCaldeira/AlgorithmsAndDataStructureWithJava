public class QuickSort {
    
    public static <T extends Comparable<T>> void sortAscending(T[] arr) {
        sortAscending(arr, 0, arr.length-1);
    }

    public static <T extends Comparable<T>> void sortAscending(T[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex)
            return;
        int midIndex = partition(arr, startIndex, endIndex,1);
        sortAscending(arr, startIndex, midIndex-1);
        sortAscending(arr, midIndex+1, endIndex);
    }

    public static <T extends Comparable<T>> void sortDescending(T[] arr) {
        sortDescending(arr, 0, arr.length-1);
    }

    public static <T extends Comparable<T>> void sortDescending(T[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex)
            return;
        int midIndex = partition(arr, startIndex, endIndex,-10);
        sortDescending(arr, startIndex, midIndex-1);
        sortDescending(arr, midIndex+1, endIndex);
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int startIndex, int endIndex, int multiplier) {
        int leftPointer = startIndex;
        T x = arr[endIndex];
        for(int midPointer = startIndex; midPointer < endIndex; midPointer++) {
            if(multiplier*(arr[midPointer].compareTo(x)) <= 0) {
                ArrayManipulation.swap(arr, midPointer, leftPointer);
                leftPointer++;
            }
        }
        ArrayManipulation.swap(arr, leftPointer, endIndex);
        return leftPointer;
    }
}
