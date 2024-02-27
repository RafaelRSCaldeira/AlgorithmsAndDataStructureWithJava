public class Stack {
    private int[] stack;
    private int size;
    private int numberOfElements;
    private boolean expandable;

    Stack() {
        this.stack = new int[10];
        this.size = 10;
        this.numberOfElements = 0;
        this.expandable = false;
    }

    Stack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.numberOfElements = 0;
        this.expandable = false;
    }

    Stack(int[] nums) {
        this.stack = new int[nums.length];
        this.size = nums.length;
        this.numberOfElements = 0;
        this.expandable = false;
        for(int i = 0; i < nums.length; i++)
            this.push(nums[i]);
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        numberOfElements--;
        return this.stack[numberOfElements];
    }

    public boolean isEmpty() {
        if(this.numberOfElements > 0)
            return false;
        return true;
    }


    public void push(int item) {
        if(this.canPush()) {
            this.stack[numberOfElements] = item;
            this.numberOfElements++;
            System.out.println("Element added.");
        }
        else {
            System.out.println("Stack is full.");
        }
    }

    private boolean canPush() {
        if(this.isFull()) {
            if(this.isExpandable()) {
                this.expand();
                return true;
            }
            else
                return false;
        }   
        return true;
    }

    public boolean isFull() {
        if(this.numberOfElements >= this.size) 
            return true;
        return false;
    }

    private void expand() {
        int[] newStack = new int[this.size*2];
        for(int i = 0; i < size; i++)
            newStack[i] = this.stack[i];
        this.size *= 2;
        this.stack = newStack;
    }

    public void setExpandable(boolean mode) {
        this.expandable = mode;
    }

    public boolean isExpandable() {
        return this.expandable;
    }

}
