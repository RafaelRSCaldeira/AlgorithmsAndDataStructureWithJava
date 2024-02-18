public class ArrayManipulation {
    public static <T> void copy(T[] source, T[] target, int startIndex, int endIndex) {
        for(int i = startIndex; i <= endIndex; i++)
            target[i-startIndex] = source[i];
        return;
    }
    public static <T> void copy(T[] source, T[] target) {
        for(int i = 0; i < source.length; i++)
            target[i] = source[i];
        return;
    }
    public static void copy(int[] source, int[] target, int startIndex, int endIndex) {
        for(int i = startIndex; i <= endIndex; i++)
            target[i-startIndex] = source[i];
        return;
    }
    public static void copy(int[] source, int[] target) {
        for(int i = 0; i < source.length; i++)
            target[i] = source[i];
        return;
    }
    public static <T> void print(T[] arr) {
        for(T item: arr)
            System.out.print(item + " ");
        System.out.println("");
    }
    public static void print(int[] arr) {
        for(int item: arr)
            System.out.print(item + " ");
        System.out.println();
    }
    public static <T> void reverse(T[] arr) {
        @SuppressWarnings("unchecked")
        T[] reversed = (T[]) new Object[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length-i-1];
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = reversed[i];
        }
    }
    public static void reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length-i-1];
        }
        copy(reversed, arr);
    }
    public static <T extends Number> double sum(T[] arr) {
        double sum = 0;
        for(T item: arr)
            sum += (double) item;
        return sum;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for(int num: arr)
            sum += num;
        return sum;
    }
    public static int sum(int[] arr, int startIndex, int endIndex) {
        int sum = 0;
        for(int i = startIndex; i <= endIndex; i++)
            sum += arr[i];
        return sum;
    }
    public static <T extends Comparable<T>> void swap(T[] arr, int firstIndex, int secondIndex) {
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    public static <T extends Comparable<T>> T max(T[] arr) {
        T max = arr[0];
        for(T num: arr)
            if(num.compareTo(max) > 0)
                max = num;
        return max;
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for(int num: arr)
            if(num > max)
                max = num;
        return max;
    }
    public static <T extends Comparable<T>> T min(T[] arr) {
        T min = arr[0];
        for(T num: arr)
            if(num.compareTo(min) < 0)
                min = num;
        return min;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for(int num: arr)
            if(num < min)
                min = num;
        return min;
    }
}