import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void sortAscendingTest() {
        Integer[] expected = {1,2,3,4,5,6,7,8,9};
        Integer[] arr = {4,2,5,1,7,9,3,8,6};
        QuickSort.sortAscending(arr);
        assertArrayEquals(expected, arr);
        
        arr = new Integer[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        expected = new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        QuickSort.sortAscending(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void sortDescendingTest() {
        Integer[] expected = {9,8,7,6,5,4,3,2,1};
        Integer[] arr = {4,2,5,1,7,9,3,8,6};
        ArrayManipulation.print(arr);
        QuickSort.sortDescending(arr);
        ArrayManipulation.print(arr);
        assertArrayEquals(expected, arr);
        
        arr = new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        expected = new Integer[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        QuickSort.sortDescending(arr);
        assertArrayEquals(expected, arr);
    }
}
