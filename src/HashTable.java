class HashTable {
    private SimpleLinkedList[] data;
    private int size;
    
    HashTable() {
        this(10);
    }
    
    HashTable(int size) {
        data = new SimpleLinkedList[size];
        this.size = size;
    }
    
    public void put(String key, int val) {
        SimpleNode node = new SimpleNode(key, val);
        int index = this.calculateIndex(key);
        if(this.data[index] == null)
            this.pushEmpty(index, node);
        else
            this.push(index, node);
    }
    
    private int calculateIndex(String key) {
        return HashTable.stringToNumber(key) % this.size;
    }
    
    private void pushEmpty(int index, SimpleNode node) {
        SimpleLinkedList list = new SimpleLinkedList(node);
        this.data[index] = list;
    }
    
    private void push(int index, SimpleNode node) {
        this.data[index].insertEnd(node);
    }
    
    public int get(String key) {
        int index = this.calculateIndex(key);
        SimpleLinkedList list = this.data[index];
        return list.search(key);
    }
    
    public static int stringToNumber(String str) {
        int result = 0;
        for(int i = 0; i < str.length(); i++)
            result += (int) str.charAt(i);
        return result;
    }
}