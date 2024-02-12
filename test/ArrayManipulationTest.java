import org.junit.Test;
import org.junit.*;


public class ArrayManipulationTest {
    @Test
    public void copyTest() {
        Integer[] source = {1,2,3,4,5,6,7};
        Integer[] target = new Integer[source.length];
        ArrayManipulation.copy(source, target, 0, source.length-1);
        Assert.assertArrayEquals(source, target);
    }
    @Test
    public void reverseTest() {
        Integer[] reversed = {7,6,5,4,3,2,1};
        Integer[] original = {1,2,3,4,5,6,7};
        ArrayManipulation.reverse(reversed);
        Assert.assertArrayEquals(original, reversed);
    }
}