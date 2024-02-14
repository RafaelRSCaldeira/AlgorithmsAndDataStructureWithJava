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

    public void show() {
        for(int num: arr) 
            System.out.print(num + " ");
        System.out.println();
        System.out.println(pointer);
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
    
    public void insert(int num) {
        arr.add(num);
        pointer++;
        checkOrderAscending(pointer);
    }

    public int getValue(int index) {
        swap(index, pointer);
        organize(index);
        return getLastValue();
    }

    public void update(int index, int newValue) {
        arr.set(index, newValue);
        organize(index);
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(secondIndex));
        arr.set(secondIndex, temp);
    }

    private void organize(int index) {
        if(arr.get(index) > getFather(index))
            checkOrderAscending(index);
        else if(arr.get(index) < arr.get(max(index)))
            checkOrderDescending(index);
    }

    private int getLastValue() {
        int num = arr.remove(pointer);
        pointer--;
        return num;
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

    private void checkOrderDescending(int index) {
        int valueIndex = index;
        while(!isOrderedDescending(valueIndex)) {
            int max = max(valueIndex);
            swap(valueIndex, max);
            valueIndex = max;
        }
    }

    private boolean isOrderedDescending(int index) {
        if(arr.get(index) < arr.get(max(index)))
            return false;
        return true;
    }

    private int max(int index) {
        if(hasBoth(index)) {
            if(getLeft(index) > getRight(index))
                return index*2 + 1;
            return index*2 + 2;
        }
        if(hasLeft(index))
            return index*2 + 1;
        return index;
    }

    private boolean hasBoth(int index) {
        if(2*index + 2 <= pointer)
            return true;
        return false;
    }

    private boolean hasLeft(int index) {
        if(2*index + 1 <= pointer)
            return true;
        return false;
    }
}
