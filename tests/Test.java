package tests;
import src.*;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {7, 10, 2, 5, 8, 0, 5};
        int[] arr2 = {2, 4, 1, 12, 7, 1, 10};

        MergeSort.sortAscending(arr2, 0, 6);
        PrintArray.print(arr2);

        BubbleSort.sortAscending(arr);
        PrintArray.print(arr);
        BubbleSort.sortDescending(arr);
        PrintArray.print(arr);
    }
}
