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
}
