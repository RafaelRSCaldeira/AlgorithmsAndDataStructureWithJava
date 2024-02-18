public class CountingSort {
    public static void sortAscending(int[] arr) {
        int[] count = new int[ArrayManipulation.max(arr)+1];
        for(int num: arr) {
            count[num]++;
        }
        for(int i = 1; i < count.length; i++)
            count[i] += count[i-1];
        int[] sorted = new int[arr.length];
        for(int j = arr.length-1; j >= 0; j--) {
            count[arr[j]]--;
            sorted[count[arr[j]]] = arr[j];
        }
        ArrayManipulation.copy(sorted, arr);
    }
    public static void sortDescending(int[] arr) {
        sortAscending(arr);
        ArrayManipulation.reverse(arr);
    }
}