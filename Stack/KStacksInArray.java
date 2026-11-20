package Stack;

import java.util.Arrays;

class KStacks {

    int[] arr;     // Stores actual stack elements
    int[] top;     // Top index of each stack
    int[] next;    // Next entry (or free list)
    int free;      // Beginning index of free list
    int n, k;

    KStacks(int k, int n) {
        this.k = k;
        this.n = n;

        arr = new int[n];
        top = new int[k];
        next = new int[n];

        // Initialize all stacks as empty
        Arrays.fill(top, -1);

        // Initialize free list
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;

        free = 0;
    }

    boolean isFull() {
        return free == -1;
    }

    boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    boolean push(int item, int sn) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }

        // Get first free index
        int i = free;

        // Update free to next free slot
        free = next[i];

        // Link new element with previous top
        next[i] = top[sn];

        // Update top
        top[sn] = i;

        // Store value
        arr[i] = item;

        return true;
    }

    Integer pop(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Stack Underflow");
            return null;
        }

        // Index of top element
        int i = top[sn];

        // Update top
        top[sn] = next[i];

        // Add removed index to free list
        next[i] = free;
        free = i;

        return arr[i];
    }

    Integer peek(int sn) {
        if (isEmpty(sn))
            return null;

        return arr[top[sn]];
    }

    void printStack(int sn) {
        System.out.print("Stack " + sn + ": ");

        if (isEmpty(sn)) {
            System.out.println("Empty");
            return;
        }

        int i = top[sn];

        while (i != -1) {
            System.out.print(arr[i] + " ");
            i = next[i];
        }

        System.out.println();
    }
}

public class KStacksInArray {

    public static void main(String[] args) {

        KStacks ks = new KStacks(3, 10);

        // Stack 0
        ks.push(10, 0);
        ks.push(20, 0);

        // Stack 1
        ks.push(100, 1);
        ks.push(200, 1);
        ks.push(300, 1);

        // Stack 2
        ks.push(1000, 2);
        ks.push(2000, 2);

        ks.printStack(0);
        ks.printStack(1);
        ks.printStack(2);

        System.out.println();

        System.out.println("Pop Stack 1 : " + ks.pop(1));
        System.out.println("Peek Stack 2: " + ks.peek(2));
        System.out.println("Pop Stack 0 : " + ks.pop(0));

        System.out.println();

        ks.printStack(0);
        ks.printStack(1);
        ks.printStack(2);
    }
}