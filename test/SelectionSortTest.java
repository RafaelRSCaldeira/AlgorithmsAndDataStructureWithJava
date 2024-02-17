import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void sortAscendingTest() {
        Integer[] sorted = {5,2,10,2,1,3,12,7};
        SelectionSort.sortAscending(sorted);
        Integer[] expected = {1,2,2,3,5,7,10,12};
        assertArrayEquals(expected,sorted);
    }
    @Test
    public void sortDescendingTest() {
        Integer[] sorted = {5,2,10,2,1,3,12,7};
        SelectionSort.sortDescending(sorted);
        Integer[] expected = {12,10,7,5,3,2,2,1};
        assertArrayEquals(expected,sorted);
    }
}