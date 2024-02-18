import org.junit.Test;
import static org.junit.Assert.*;

public class CountingSortTest {
    @Test
    public void sortAscendingTest() {
        int[] expectedOutput = {1,2,3,4,5,6,7,8,9};
        int[] realOutput = {4,2,5,1,7,9,3,8,6};
        CountingSort.sortAscending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
        
        realOutput = new int[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        expectedOutput = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        CountingSort.sortAscending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }

    @Test
    public void sortDescendingTest() {
        int[] expectedOutput = {9,8,7,6,5,4,3,2,1};
        int[] realOutput = {4,2,5,1,7,9,3,8,6};
        CountingSort.sortDescending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
        
        realOutput = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        expectedOutput = new int[] {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        CountingSort.sortDescending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }
}
