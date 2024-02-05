package src;

import tests.PrintArray;

public class BubbleSort {
    public static <T extends Comparable<T>> void sortAscending(T[] arr) {
        boolean swapped = false;
        for(;;) {
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1]) > 0) {
                    swap(arr, i);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
            swapped = false;
        }
    }
    public static <T extends Comparable<T>> void sortDescending(T[] arr) {
        boolean swapped = false;
        for(;;) {
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1]) < 0) {
                    swap(arr, i);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
            swapped = false;
        }
    }
    private static <T extends Comparable<T>> void swap(T[] arr, int index) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }
}