package tests;
public class PrintArray {
    public static <T> void print(T[] arr) {
        for(T element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void print(int[] arr) {
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
