import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void sortAscendingTest() {
        Integer[] expectedOutput = {1,2,3,4,5,6,7,8,9};
        Integer[] realOutput = {4,2,5,1,7,9,3,8,6};
        QuickSort.sortAscending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
        
        realOutput = new Integer[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        expectedOutput = new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        QuickSort.sortAscending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }

    @Test
    public void sortDescendingTest() {
        Integer[] expectedOutput = {9,8,7,6,5,4,3,2,1};
        Integer[] realOutput = {4,2,5,1,7,9,3,8,6};
        QuickSort.sortDescending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
        
        realOutput = new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        expectedOutput = new Integer[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        QuickSort.sortDescending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }
}
