public class SelectionSort {
    static <T extends Comparable<T>> void sortAscending(T[] arr) {
        T minor;
        int index;
        for(int i = 0; i < arr.length-1; i++) {
            minor = arr[i];
            index = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(minor) < 0) {
                    minor = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = minor;
        }
    }
    static <T extends Comparable<T>> void sortDescending(T[] arr) {
        T major;
        int index;
        for(int i=0; i<arr.length-1; i++) {
            major = arr[i];
            index = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j].compareTo(major) > 0) {
                    major = arr[j];
                    index = j;
                }
            }
             arr[index] = arr[i];
             arr[i] = major;
        }
    }
}
