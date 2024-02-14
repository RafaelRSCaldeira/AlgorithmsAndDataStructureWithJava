import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> arr;
    private int pointer;

    MaxHeap() {
        arr = new ArrayList<>();
        pointer = -1;
    }

    MaxHeap(int[] arr) {
        this.arr = new ArrayList<>(arr.length);
        pointer = -1;
        for(int num: arr) {
            insert(num);
        }
    }

    public ArrayList<Integer> getArray() {
        return arr;
    }

    public void insert(int num) {
        arr.add(num);
        pointer++;
        checkOrderAscending(pointer);
    }

    private void checkOrderAscending(int index) {
        int valueIndex = index;
        while(!isOrderedAscending(valueIndex)) {
            swap(valueIndex, (valueIndex-1)/2);
            valueIndex = (valueIndex-1)/2;
        }
    }

    private boolean isOrderedAscending(int index) {
        if(index > 0 && arr.get(index) > getFather(index))
            return false;
        return true;
    }

    private void swap(int firstIndex, int secondIndex) {
        System.out.println(firstIndex + " " + secondIndex);
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(secondIndex));
        arr.set(secondIndex, temp);
    }

    public int getFather(int childIndex) {
        if((childIndex-1)/2 >= 0 && (childIndex-1)/2 <= pointer)
            return arr.get((childIndex-1)/2);
        return Integer.MIN_VALUE;
    }

    public int getLeft(int fatherIndex) {
        if(fatherIndex*2 + 1 <= pointer) {
            return arr.get(fatherIndex*2 + 1);
        }
        return Integer.MIN_VALUE;
    } 

    public int getRight(int fatherIndex) {
        if(fatherIndex*2 + 2 <= pointer) {
            return arr.get(fatherIndex*2 + 2);
        }
        return Integer.MIN_VALUE;
    }

    public void show() {
        for(int num: arr) 
            System.out.print(num + " ");
        System.out.println();
    }
}
