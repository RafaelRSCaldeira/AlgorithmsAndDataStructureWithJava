public class PrintArray {
    static <T> void print(T[] arr) {
        for(T element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
