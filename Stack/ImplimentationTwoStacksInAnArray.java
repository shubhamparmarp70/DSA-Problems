package Stack;

class TwoStacks {
    int arr[];
    int cap, top1, top2;

    TwoStacks(int n) {
        cap = n;
        arr = new int[cap];
        top1 = -1;
        top2 = cap;
    }

    boolean push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
            return true;
        }
        return false;
    }

    boolean push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
            return true;
        }
        return false;
    }

    Integer pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        }
        return null;
    }

    Integer pop2() {
        if (top2 < cap) {
            return arr[top2++];
        }
        return null;
    }

    Integer peek1() {
        if (top1 >= 0)
            return arr[top1];
        return null;
    }

    Integer peek2() {
        if (top2 < cap)
            return arr[top2];
        return null;
    }

    int size1() {
        return top1 + 1;
    }

    int size2() {
        return cap - top2;
    }

    boolean isEmpty1() {
        return top1 == -1;
    }

    boolean isEmpty2() {
        return top2 == cap;
    }

    void printStack1() {
        System.out.print("Stack 1: ");
        if (isEmpty1()) {
            System.out.println("Empty");
            return;
        }

        for (int i = top1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void printStack2() {
        System.out.print("Stack 2: ");
        if (isEmpty2()) {
            System.out.println("Empty");
            return;
        }

        for (int i = top2; i < cap; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ImplimentationTwoStacksInAnArray {

    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(10);

        // Push into Stack 1
        ts.push1(10);
        ts.push1(20);
        ts.push1(30);

        // Push into Stack 2
        ts.push2(100);
        ts.push2(200);
        ts.push2(300);

        ts.printStack1();
        ts.printStack2();

        System.out.println("\nTop of Stack1: " + ts.peek1());
        System.out.println("Top of Stack2: " + ts.peek2());

        System.out.println("\nPop Stack1: " + ts.pop1());
        System.out.println("Pop Stack2: " + ts.pop2());

        System.out.println("\nAfter Pop:");

        ts.printStack1();
        ts.printStack2();

        System.out.println("\nSize of Stack1: " + ts.size1());
        System.out.println("Size of Stack2: " + ts.size2());

        // Fill remaining space
        ts.push1(40);
        ts.push1(50);
        ts.push1(60);
        ts.push1(70);
        ts.push2(400);
        ts.push2(500);

        System.out.println("\nAfter More Pushes:");

        ts.printStack1();
        ts.printStack2();

        // Try pushing when full
        if (!ts.push1(80)) {
            System.out.println("\nArray is Full. Cannot push into Stack1.");
        }

        if (!ts.push2(600)) {
            System.out.println("Array is Full. Cannot push into Stack2.");
        }
    }
}
