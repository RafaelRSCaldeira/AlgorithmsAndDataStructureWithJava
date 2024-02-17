public class BubbleSort {
    public static <T extends Comparable<T>> void sortAscending(T[] arr) {
        boolean sorted = true;
        for(;;) {
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1]) > 0) {
                    ArrayManipulation.swap(arr, i, i+1);
                    sorted = false;
                }
            }
            if(sorted)
                break;
            sorted = true;
        }
    }
    public static <T extends Comparable<T>> void sortDescending(T[] arr) {
        boolean sorted = true;
        for(;;) {
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1]) < 0) {
                    ArrayManipulation.swap(arr, i, i+1);
                    sorted = false;
                }
            }
            if(sorted)
                break;
            sorted = true;
        }
    }
}