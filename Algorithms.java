public class Algorithms {
    public static void main(String[] args) {
        Integer[] arr = {7,10,2,4,8,5};
        SelectionSort.sortAscending(arr);
        PrintArray.print(arr);
        SelectionSort.sortDescending(arr);
        PrintArray.print(arr);
    }
}