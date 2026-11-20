package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplimentationOfChainning {
    public static void main(String[] args) {
        MyHash h = new MyHash(7);

        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(7);
        h.insert(17);

        h.display();

        System.out.println(h.search(17)); // true

        h.delete(17);

        System.out.println(h.search(17)); // false

        h.display();
    }
}

class MyHash {

    int bucket;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        bucket = b;
        table = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<>());
        }
    }

    void insert(int key) {
        int i = key % bucket;
        table.get(i).add(key);
    }

    void delete(int key) {
        int i = key % bucket;
        table.get(i).remove(Integer.valueOf(key));
    }

    boolean search(int key) {
        int i = key % bucket;
        return table.get(i).contains(key);
    }

    void display() {
        for (int i = 0; i < bucket; i++) {
            System.out.println(i + " -> " + table.get(i));
        }
    }
}