class SimpleLinkedList {
    private SimpleNode head;
    private SimpleNode tail;
    private int numberOfElements;
    
    SimpleLinkedList() {
        this.head = null;
        this.tail = null;
        this.numberOfElements = 0;
    }
    
    SimpleLinkedList(SimpleNode node) {
        this();
        this.pushEmpty(node);
    }
    
    public void insertStart(SimpleNode node) {
        if(this.isEmpty())
            this.pushEmpty(node);
        else
            this.pushStart(node);
    }
    
    public boolean isEmpty() {
        if(this.numberOfElements == 0)
            return true;
        return false;
    }
    
    private void pushEmpty(SimpleNode node) {
        this.head = node;
        this.tail = node;
        this.numberOfElements++;
    }
    
    private void pushStart(SimpleNode node) {
        node.next = this.head;
        this.head = node;
        this.numberOfElements++;
    }
    
    public void insertEnd(SimpleNode node) {
        if(this.isEmpty())
            this.pushEmpty(node);
        else
            this.pushEnd(node);
    }
    
    private void pushEnd(SimpleNode node) {
        this.tail.next = node;
        this.tail = node;
        this.numberOfElements++;
    }
    
    public int search(String key) {
        SimpleNode currNode = this.head;
        while(currNode != null) {
            if(currNode.name == key)
                return currNode.val;
        }
        return Integer.MIN_VALUE;
    }
}

class SimpleNode {
    SimpleNode next;
    String name;
    int val;
    
    SimpleNode(String name, int val) {
        this.next = null;
        this.name = name;
        this.val = val;
    }
    
    SimpleNode(String name, int val, SimpleNode next) {
        this(name, val);
        this.next = next;
    }
    
    public boolean hasNext() {
        if(this.next != null)
            return true;
        return false;
    }
}

