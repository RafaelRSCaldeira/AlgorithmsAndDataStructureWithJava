public class Algorithms {
    public static void main(String[] args) {
        Integer[] arr = {7,10,4,8,5};
        InsertionSort.sortAscending(arr);
        PrintArray.print(arr);
        InsertionSort.sortDescending(arr);
        PrintArray.print(arr);
    }
}