import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class FindMaxSubArrayTest {
    @Test
    public void findTest() {
        int[] source = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int[] result = FindMaxSubArray.find(source, 0, source.length-1);
        int[] expectedResult = {7, 10, 43};
        assertArrayEquals(expectedResult, result);
    }
    @Test
    public void findTest2() {
        int[] source = {-2,-1,-3};
        int[] result = FindMaxSubArray.find(source, 0, source.length-1);
        int[] expectedResult = {1,1,-1};
        assertArrayEquals(expectedResult, result);
    }
    @Test
    public void findTest3() {
        int[] source = {5};
        int[] result = FindMaxSubArray.find(source, 0, source.length-1);
        int[] expectedResult = {0,0,5};
        assertArrayEquals(expectedResult, result);
    }
}
