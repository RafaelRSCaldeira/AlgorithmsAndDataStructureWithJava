package src;

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
}