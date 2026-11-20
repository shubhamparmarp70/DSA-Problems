package LinkedList;
import java.util.HashMap;

class Node2 {
    int key, value;
    Node2 prev, next;

    Node2(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCacheDesign {

    private int capacity;
    private HashMap<Integer, Node2> map;

    private Node2 head, tail;

    public LRUCacheDesign(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node2(0, 0);   // Dummy head
        tail = new Node2(0, 0);   // Dummy tail

        head.next = tail;
        tail.prev = head;
    }

    // Remove a node
    private void remove(Node2 node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert node just after head
    private void insert(Node2 node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node2 node = map.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node2 node = map.get(key);
            node.value = value;

            remove(node);
            insert(node);
        }
        else {

            if (map.size() == capacity) {

                Node2 lru = tail.prev;

                remove(lru);
                map.remove(lru.key);
            }

            Node2 node = new Node2(key, value);

            insert(node);
            map.put(key, node);
        }
    }

    public void display() {

        Node2 curr = head.next;

        while (curr != tail) {
            System.out.print("(" + curr.key + "," + curr.value + ") ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LRUCacheDesign cache = new LRUCacheDesign(2);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.display();

        System.out.println(cache.get(1));
        cache.display();

        cache.put(3, 30);
        cache.display();

        System.out.println(cache.get(2));

        cache.put(4, 40);
        cache.display();

        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
