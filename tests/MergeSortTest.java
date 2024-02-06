package tests;

import org.junit.*;
import org.junit.Test;
import src.MergeSort;

public class MergeSortTest {
    @Test
    public void sortAscendingTest() {
        Integer[] sorted = {5,2,10,2,1,3,12,7};
        MergeSort.sortAscending(sorted);
        Integer[] expected = {1,2,2,3,5,7,10,12};
        Assert.assertArrayEquals(expected,sorted);
    }
    @Test
    public void sortDescendingTest() {
        Integer[] sorted = {5,2,10,2,1,3,12,7};
        MergeSort.sortDescending(sorted);
        Integer[] expected = {12,10,7,5,3,2,2,1};
        Assert.assertArrayEquals(expected,sorted);
    }
}
