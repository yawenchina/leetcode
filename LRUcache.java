public class LRUCache {
    private class Node{
        int key;
        Node prev;
        Node tail;
        int value;
        private Node(int key,int value){
            this.key = key;
            this.value = value;
            this.prev = null;
            this.tail = null;
        }
        
    }
    private int capacity;
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
     private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);
    public LRUCache(int  capacity){
        this.capacity = capacity;
        tail.prev = head;
        head.next = tail;
    }
    public int get(int key){
        if(!map.contains(key)){
            return -1;
        }
        Node node = map.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        moveToTail(node);
        return node.value;
    }
    public void set(int key, int value){
        if(map.get(key) != -1){
            map.get(key).value = value;
            return;
        }
        if(this.size() == capacity){
            map.remove(head.next.key);
            head.next =head.next.next;
            head.next.prev = head.next;
        }
        Node insert = new Node(key, value);
        map.put(key, value);
        move_to_tail(insert);
    }
    public void moveToTail(Node insert){
        insert.prev.next = insert;
        insert.prev = tail.prev;
        insert.next = tail;
        tail.prev = insert;
    }
}

