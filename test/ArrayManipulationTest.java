import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayManipulationTest {
    @Test
    public void copyTest() {
        Integer[] expected = {1,2,3,4,5,6,7};
        Integer[] arr = new Integer[expected.length];
        ArrayManipulation.copy(expected, arr, 0, expected.length-1);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void reverseTest() {
        Integer[] expected = {1,2,3,4,5,6,7};
        Integer[] arr = {7,6,5,4,3,2,1};
        ArrayManipulation.reverse(arr);
        assertArrayEquals(expected,arr);
    }

    @Test
    public void swapTest() {
        Integer[] expected = {1,2,3,4,5,6,7};
        Integer[] arr = {1,3,2,4,5,6,7};
        ArrayManipulation.swap(arr, 1, 2);
        assertArrayEquals(expected,arr);

        expected = new Integer[] {7,2,3,4,5,6,1};
        ArrayManipulation.swap(arr, 0, 6);
        assertArrayEquals(expected,arr);
    }

    @Test
    public void sumTest() {
        int[] arr = {1,2,3,4,5,6,7};
        int sum = ArrayManipulation.sum(arr,2,5);
        assertEquals(18, sum);

        sum = ArrayManipulation.sum(arr);
        assertEquals(28,sum);
    }

    @Test
    public void maxTest() {
        int[] arr = {5,3,1,20,3,18,8,14};
        int max = ArrayManipulation.max(arr);
        assertEquals(20, max);

        Integer[] arr2 = {5,3,1,20,3,18,8,14};
        max = ArrayManipulation.max(arr2);
        assertEquals(20, max);
    }

    @Test
    public void minTest() {
        int[] arr = {5,3,1,20,3,18,8,14};
        int min = ArrayManipulation.min(arr);
        assertEquals(1, min);

        Integer[] arr2 = {5,3,1,20,3,18,8,14};
        min = ArrayManipulation.min(arr2);
        assertEquals(1, min);
    }
}
