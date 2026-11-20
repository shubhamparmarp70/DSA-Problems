package Hashing;

public class OpenAddressingImplimentation {
    public static void main(String[] args) {
        MyHash1 h = new MyHash1(7);

        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(7);
        h.insert(17);

        h.display();

        System.out.println(h.search(17)); // true

        h.delete(17);

        System.out.println(h.search(17)); // false
    }
}

class MyHash1 {
    int[] arr;
    int cap, size;

    MyHash1(int c) {
        cap = c;
        size = 0;
        arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = -1;
        }
    }

    int hash(int key) {
        return key % cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                return true;
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false;
            }
        }
        return false;
    }

    boolean insert(int key) {
        if (size == cap) {
            return false;
        }
        int i = hash(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i + 1) % cap;
        }
        if (arr[i] == key) {
            return false;
        } else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    void display() {
        for (int i = 0; i < cap; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   boolean delete(int key) {
    int h = hash(key);
    int i = h;

    while (arr[i] != -1) {
        if (arr[i] == key) {
            arr[i] = -2;
            size--;
            return true;
        }

        i = (i + 1) % cap;

        if (i == h)
            return false;
    }

    return false;
}
}
