class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;
    
    DoubleLinkedList() { 
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    DoubleLinkedList(DoubleNode node) {
        this.head = node;
        this.tail = node;
        this.size = 1;
    }
    
    public boolean isEmpty() {
        if(this.size <= 0)
            return true;
        return false;
    }
    
    public void addStart(DoubleNode node) {
        if(this.isEmpty())
            this.tail = node;
        node.next = this.head;
        this.head = node;
        if(node.hasNext())
            node.next.prev = node;
        this.size++;
    }
    
    public void removeStart() {
        if(this.isEmpty())
            return;
        this.head = this.head.next;
        if(this.head != null)
            this.head.prev = null;
        this.size--;
    }
    
    public void addEnd(DoubleNode node) {
        if(this.isEmpty())
            this.head = node;
        node.prev = this.tail;
        this.tail = node;
        if(node.hasPrev())
            node.prev.next = node;
        this.size++;
    }
    
    public void removeEnd() {
        if(this.head == null)
            return;
        this.tail = this.tail.prev;
        if(this.tail != null)
            this.tail.next = null;
        this.size--;
    }
    
    public void remove(int val) {
        remove(getNodeWithValue(val));
    }
    
    public void remove(DoubleNode node) {
        if(this.hasNode(node)) {
            if(node == this.head) {
                this.removeStart();
            }
            else if(node == this.tail)
                this.removeEnd();
            else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        }
    }
    
    public boolean hasNode(DoubleNode node) {
        DoubleNode currNode = this.head;
        while(currNode != null) {
            if(currNode == node)
                return true;
            currNode = currNode.next;
        }
        return false;
    }
    
    private DoubleNode getNodeWithValue(int val) {
        DoubleNode currNode = this.head;
        while(currNode != null) {
            if(currNode.val == val)
                return currNode;
            currNode = currNode.next;
        }
        return null;
    }
    
    public boolean hasValue(int val) {
        DoubleNode currNode = this.head;
        while(currNode != null) {
            if(currNode.val == val)
                return true;
            currNode = currNode.next;
        }
        return false;
    }
    
    
    
    public void add(int index, DoubleNode node) {
        if(index >= size)
            this.addEnd(node);
        else if(index <= 0)
            this.addStart(node);
        else {
            DoubleNode currNode = this.tail;
            for(int i = 0; i < index; i++)
                currNode = currNode.next;
            this.add(currNode, node);
        }
    }
    
    private void add(DoubleNode listed, DoubleNode newNode) {
        newNode.next = listed;
        newNode.prev = listed.prev;
        listed.prev.next = newNode;
        listed.prev = newNode;
    }
    
    public void info() {
        DoubleNode currNode = this.head;
        System.out.print("Linked List: ");
        while(currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    
    public DoubleNode popStart() {
        DoubleNode node = this.head;
        this.removeStart();
        return new DoubleNode(node.val);
    }
    
    public DoubleNode popEnd() {
        DoubleNode node = this.tail;
        this.removeEnd();
        return new DoubleNode(node.val);
    }
}


class DoubleNode {
    DoubleNode next;
    DoubleNode prev;
    int val;
    DoubleNode() {
        this.next = null;
        this.prev = null;
        this.val = 0;
    }
    DoubleNode(int val) { 
        this();
        this.val = val;
    }
    
    public boolean hasNext() {
        if(this.next != null)
            return true;
        return false;
    }
    
    public boolean hasPrev() {
        if(this.prev != null)
            return true;
        return false;
    }
}