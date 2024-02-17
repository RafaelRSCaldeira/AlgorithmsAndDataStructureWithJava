import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;


public class MinHeapTest {
    MinHeap heap = new MinHeap();

    @Before
    public void before() {
        heap = new MinHeap(new int[] {12,3,8,1,16,9,4,2,6,13});
    }

    @Test
    public void constructorTest() {
        heap = new MinHeap(new int[]{13,9,12,3,8,6,4,1,2});
        List<Integer> expected = List.of(1,2,4,3,9,12,6,13,8);
        assertEquals(expected, heap.getArray());

        heap = new MinHeap(new int[] {12,3,8,1,16,9,4,2,6,13});
        expected = List.of(1,2,4,3,13,9,8,12,6,16);
        assertEquals(expected, heap.getArray());
    }

    @Test
    public void getFatherTest() {
        assertEquals(1, heap.getFather(1));
        assertEquals(1, heap.getFather(2));
        assertEquals(3, heap.getFather(7));
        assertEquals(3, heap.getFather(8));
    }

    @Test
    public void getLeftTest() { 
        assertEquals(2, heap.getLeft(0));
        assertEquals(3,heap.getLeft(1));
        assertEquals(12,heap.getLeft(3));
        assertEquals(Integer.MIN_VALUE, heap.getLeft(7));
    }

    @Test
    public void getRightTest() { 
        assertEquals(4, heap.getRight(0));
        assertEquals(8,heap.getRight(2));
        assertEquals(Integer.MIN_VALUE, heap.getRight(6));
    }

    @Test
    public void insertTest() {
        heap.insert(10);
        List<Integer> expected = List.of(1,2,4,3,10,9,8,12,6,16,13);
        assertEquals(expected, heap.getArray());
        heap.insert(-1);
        expected = List.of(-1,2,1,3,10,4,8,12,6,16,13,9);
        assertEquals(expected, heap.getArray());

    }

    @Test
    public void getValueTest() {
        int num = heap.getValue(5);
        List<Integer> expected = List.of(1,2,4,3,13,16,8,12,6);
        assertEquals(9, num);
        assertEquals(expected, heap.getArray());

        num = heap.getValue(2);
        expected = List.of(1,2,6,3,13,16,8,12);
        assertEquals(4, num);
        assertEquals(expected, heap.getArray());

        num = heap.getValue(1);
        expected = List.of(1,3,6,12,13,16,8);
        assertEquals(2, num);
        assertEquals(expected, heap.getArray());

        num = heap.getValue(0);
        expected = List.of(3,8,6,12,13,16);
        assertEquals(1, num);
        assertEquals(expected, heap.getArray());
    }

    @Test
    public void updateTest() {
        heap.update(3, 20);
        List<Integer> expected = List.of(1,2,4,6,13,9,8,12,20,16);
        assertEquals(expected, heap.getArray());

        heap.update(9, 0);
        expected = List.of(0,1,4,6,2,9,8,12,20,13);
        assertEquals(expected, heap.getArray());
    }
}
