public class SelectionSort {
    static <T extends Comparable<T>> void sortAscending(T[] arr) {
        T min;
        int index;
        for(int i = 0; i < arr.length-1; i++) {
            min = arr[i];
            index = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(min) < 0) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }
    static <T extends Comparable<T>> void sortDescending(T[] arr) {
        T max;
        int index;
        for(int i=0; i<arr.length-1; i++) {
            max = arr[i];
            index = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j].compareTo(max) > 0) {
                    max = arr[j];
                    index = j;
                }
            }
             arr[index] = arr[i];
             arr[i] = max;
        }
    }
}
