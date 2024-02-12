public class MergeSort {
    public static <T extends Comparable<T>> void sortAscending(T[] arr) {
        if(arr.length == 1)
            return;
        sort(arr);
        return;
    }
    public static <T extends Comparable<T>> void sortDescending(T[] arr) {
        if(arr.length == 1)
            return;
        sort(arr);
        ArrayManipulation.reverse(arr);
        return;
    }
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int leftLength = arr.length/2;
        int rightLength = arr.length-leftLength;
        @SuppressWarnings("unchecked")
        T[] left = (T[]) new Comparable[leftLength];
        @SuppressWarnings("unchecked")
        T[] right = (T[]) new Comparable[rightLength];
        ArrayManipulation.copy(arr, left, 0, leftLength-1);
        ArrayManipulation.copy(arr, right, leftLength, arr.length - 1);
        sortAscending(left);
        sortAscending(right);
        merge(arr, left, right);
    }
    public static <T extends Comparable<T>> void merge(T[] finalArray, T[] left, T[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        while(leftIndex < left.length && rightIndex < right.length) {
            if(left[leftIndex].compareTo(right[rightIndex]) < 0) {
                finalArray[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            }
            else {
                finalArray[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }
        while(leftIndex < left.length) {
            finalArray[leftIndex + rightIndex] = left[leftIndex];
            leftIndex++;
        }
        while(rightIndex < right.length) {
            finalArray[leftIndex + rightIndex] = right[rightIndex];
            rightIndex++;
        }
        return;
    }
}