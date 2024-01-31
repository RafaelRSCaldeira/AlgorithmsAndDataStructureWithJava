public class InsertionSort {
    static <T extends Comparable<T>> void sortAscending(T[] arr) {
        if(arr.length < 2) {
            System.out.println("Array already sorted");
            return;
        }
        else {
            for(int i=1; i<arr.length; i++) {
                T key = arr[i];
                int j = i-1;
                while(j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;

            }
        }
    }
    static <T extends Comparable<T>> void sortDescending(T[] arr) {
        for(int i=0; i<arr.length; i++) {
            T key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j].compareTo(key) < 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

}
