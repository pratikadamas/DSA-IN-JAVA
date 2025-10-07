package ArrayString;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        // ✅ Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // -------------------------------
        // 1️⃣ push(E item) → Add an element to the top
        // -------------------------------
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after pushes: " + stack);
        // Output: [10, 20, 30, 40]

        // -------------------------------
        // 2️⃣ pop() → Remove and return the top element
        // -------------------------------
        int popped = stack.pop(); // removes 40
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);
        // Output: [10, 20, 30]

        // -------------------------------
        // 3️⃣ peek() → View the top element (without removing it)
        // -------------------------------
        int top = stack.peek();
        System.out.println("Top element (peek): " + top);
        // Output: 30

        // -------------------------------
        // 4️⃣ empty() → Check if stack is empty
        // -------------------------------
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);
        // Output: false

        // -------------------------------
        // 5️⃣ search(Object o) → Return 1-based position from top
        // -------------------------------
        // Top element is position 1
        int pos = stack.search(20);
        System.out.println("Position of 20 from top: " + pos);
        // Output: 2  (top=30→pos1, below it=20→pos2)

        // -------------------------------
        // 6️⃣ size() → Number of elements in stack
        // -------------------------------
        System.out.println("Size of stack: " + stack.size());
        // Output: 3

        // -------------------------------
        // 7️⃣ iterator() → Traverse stack using iterator
        // -------------------------------
        System.out.print("Traversing stack using iterator: ");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // -------------------------------
        // 8️⃣ forEach() → Modern way to traverse stack
        // -------------------------------
        System.out.print("Traversing using forEach: ");
        stack.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // -------------------------------
        // 9️⃣ clear() → Remove all elements
        // -------------------------------
        stack.clear();
        System.out.println("After clear(), stack: " + stack);
        System.out.println("Is empty now? " + stack.empty());
    }
}

