package ArrayString;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        // ✅ Create a Queue (ArrayDeque is faster than LinkedList)
        Queue<Integer> queue = new ArrayDeque<>();


        // -------------------------------
        // 1️⃣ offer(E item) → Add element to the queue (end)
        // -------------------------------
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue after offers: " + queue);
        // Output: [10, 20, 30, 40]

        // -------------------------------
        // 2️⃣ poll() → Remove and return front element
        // -------------------------------
        int removed = queue.poll(); // removes 10
        System.out.println("Removed element (poll): " + removed);
        System.out.println("Queue after poll: " + queue);
        // Output: [20, 30, 40]

        // -------------------------------
        // 3️⃣ peek() → View front element without removing
        // -------------------------------
        int front = queue.peek();
        System.out.println("Front element (peek): " + front);
        // Output: 20

        // -------------------------------
        // 4️⃣ isEmpty() → Check if queue is empty
        // -------------------------------
        boolean empty = queue.isEmpty();
        System.out.println("Is queue empty? " + empty);
        // Output: false


        // -------------------------------
        // 5️⃣ size() → Number of elements
        // -------------------------------
        System.out.println("Size of queue: " + queue.size());
        // Output: 3

        // Add more elements
        queue.offer(99);
        queue.offer(126);
        System.out.println("Queue now: " + queue);

        // -------------------------------
        // 6️⃣ contains(Object o) → Check if element exists
        // -------------------------------
        System.out.println("Queue contains 30? " + queue.contains(30));
        // Output: true

        // -------------------------------
        // 7️⃣ iterator() → Traverse queue using iterator
        // -------------------------------
        System.out.print("Traversing using iterator: ");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // -------------------------------
        // 8️⃣ forEach() → Modern traversal
        // -------------------------------
        System.out.print("Traversing using forEach: ");
        queue.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // -------------------------------
        // 9️⃣ clear() → Remove all elements
        // -------------------------------
        queue.clear();
        System.out.println("After clear(), queue: " + queue);
        System.out.println("Is empty now? " + queue.isEmpty());
    }
}
