import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void sortAscendingTest() {
        Integer[] realOutput = {5,2,10,2,1,3,12,7};
        Integer[] expectedOutput = {1,2,2,3,5,7,10,12};
        BubbleSort.sortAscending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }
    @Test
    public void sortDescendingTest() {
        Integer[] realOutput = {5,2,10,2,1,3,12,7};
        Integer[] expectedOutput = {12,10,7,5,3,2,2,1};
        BubbleSort.sortDescending(realOutput);
        assertArrayEquals(expectedOutput, realOutput);
    }
}
