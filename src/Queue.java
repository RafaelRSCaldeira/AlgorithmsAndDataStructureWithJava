public class Queue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int numberOfElements;

    Queue() {
        this.queue = new int[10];
        this.numberOfElements = 0;
        this.size = 10;
    }
    
    Queue(int size) {
        this.queue = new int[size];
        this.numberOfElements = 0;
        this.size = size;
    }

    Queue(int[] nums) {
        this.queue = new int[nums.length];
        this.numberOfElements = 0;
        this.size = nums.length;
        for(int i = 0; i < nums.length; i++)
            this.enqueue(nums[i]);
    }

    public int dequeue() {
        if(this.numberOfElements <= 0) {
            return Integer.MIN_VALUE;
        }
        if(this.head == this.size-1) {
            this.head = 0;
            this.numberOfElements--;
            return this.queue[this.size-1];
        }
        this.head++;
        this.numberOfElements--;
        return this.queue[this.head-1];
    }


    public void enqueue(int item) {
        if(this.isEmpty())
            this.enqueueStart(item);
        else  {
            if(this.isOnTheEnd())
                this.extend();
            this.tail++;
            this.queue[this.tail] = item;
        }
        this.numberOfElements++;        
    }

    public boolean isEmpty() {
        if(this.numberOfElements == 0)
            return true;
        return false;
    }

    private void enqueueStart(int item) {
        this.head = 0;
        this.tail = 0;
        this.queue[0] = item;
    }

    private boolean isOnTheEnd() {
        if(this.tail >= this.queue.length - 1)
            return true;
        return false;
    }

    private void extend() {
        int[] newQueue = new int[this.size*2];
        for(int i = 0; i < this.size; i++) {
            newQueue[i] = this.getInOrder();
        }
        this.head = 0;
        this.tail = this.size-1;
        this.size *= 2;
        this.queue = newQueue;
    }

    private int getInOrder() {
        if(this.head == this.size-1) {
            this.head = 0;
            return this.queue[this.size-1];
        }
        else {
            this.head++;
            return this.queue[this.head-1];
        }
    }

    public boolean equals(Queue q) {
        if(this == q)
            return true;
        if(q.getSize() == this.getSize()) {
            for(int i = 0; i < this.getSize(); i++)
                if(q.dequeue() != this.dequeue())
                    return false;
            return true;
        }
        else
            return false;
    }

    public int getSize() {
        return this.size;
    }

    public int getNumberOfElements() {
        return this.numberOfElements;
    }
}
