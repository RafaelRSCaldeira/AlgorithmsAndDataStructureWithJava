public class MergeSort {
    public static int[] sortAscending(int[] arr, int ini, int end) {
        if(ini >= end)
            return arr;
        int mid = (end+ini)/2;
        int[] L = new int[mid - ini + 1];
        int[] R = new int[end - mid];
        for(int i = 0; i < L.length; i++)
            L[i] = arr[i];
        for(int j = 0; j < R.length; j++)
            R[j] = arr[L.length + j];
        L = sortAscending(L, ini, mid);
        R = sortAscending(R, mid+1, end);
        return merge(L,R);
    }
    public static int[] merge(int[] L, int[] R) {
        int i = 0;
        int j = 0;
        int[] arr = new int[L.length + R.length];
        while(i < L.length && j < R.length) {
            if(L[i] < R[j]) {
                arr[i+j] = L[i];
                i++;
            }
            else {
                arr[i+j] = R[j];
                j++;
            }
        }
        while(i < L.length) {
            arr[i+j] = L[i];
            i++;
        }
        while(j < R.length) {
            arr[i+j] = R[j];
            j++;
        }
        return arr;
    }
}