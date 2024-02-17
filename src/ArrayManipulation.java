public class ArrayManipulation {
    public static <T> void copy(T[] source, T[] target, int startIndex, int endIndex) {
        for(int i = startIndex; i <= endIndex; i++)
            target[i-startIndex] = source[i];
        return;
    }
    public static <T> void print(T[] array) {
        for(T item: array)
            System.out.print(item + " ");
        System.out.println("");
    }
    public static <T> void reverse(T[] array) {
        @SuppressWarnings("unchecked")
        T[] reversed = (T[]) new Object[array.length];
        for(int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length-i-1];
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for(T item: array)
            sum += (double) item;
        return sum;
    }
    public static int sum(int[] array) {
        int sum = 0;
        for(int num: array)
            sum += num;
        return sum;
    }
    public static int sum(int[] array, int startIndex, int endIndex) {
        int sum = 0;
        for(int i = startIndex; i <= endIndex; i++)
            sum += array[i];
        return sum;
    }
    public static <T extends Comparable<T>> void swap(T[] arr, int firstIndex, int secondIndex) {
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}