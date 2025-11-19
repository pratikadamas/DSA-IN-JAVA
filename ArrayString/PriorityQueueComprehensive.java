package ArrayString;

import java.util.*;


public class PriorityQueueComprehensive {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(50);
        minHeap.add(20);

        System.out.println("✅ Min-Heap PriorityQueue (Default): " + minHeap);
        System.out.println("Peek (smallest): " + minHeap.peek());

        // Poll removes the smallest
        System.out.println("Polling elements in order of priority:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println("\n");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(Arrays.asList(30, 10, 50, 20));
        System.out.println("✅ Max-Heap PriorityQueue: " + maxHeap);
        System.out.println("Peek (largest): " + maxHeap.peek());

        System.out.println("Polling elements from Max-Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println("\n");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(30, 10, 50, 20));
        queue.offer(-3);
        System.out.println(queue);
    }
}
