// HashTable implementation without Collection Framework
class HashTable {
    // Node for Linked List (for separate chaining)
    class HashNode {
        int key;
        String value;
        HashNode next;

        public HashNode(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private HashNode[] buckets;   // Array of buckets
    private int capacity;         // Size of bucket array
    private int size;             // Number of key-value pairs

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new HashNode[capacity];
        this.size = 0;
    }

    // Hash function
    private int getBucketIndex(int key) {
        return key % capacity; // Simple modulo hash
    }

    // Insert key-value
    public void put(int key, String value) {
        int index = getBucketIndex(key);
        HashNode head = buckets[index];

        // If key already exists, update value
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at the beginning
        size++;
        head = buckets[index];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Get value by key
    public String get(int key) {
        int index = getBucketIndex(key);
        HashNode head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return null; // Not found
    }

    // Remove key
    public String remove(int key) {
        int index = getBucketIndex(key);
        HashNode head = buckets[index];
        HashNode prev = null;

        while (head != null) {
            if (head.key == key) {
                break;
            }
            prev = head;
            head = head.next;
        }

        if (head == null) {
            return null; // Not found
        }

        size--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            buckets[index] = head.next;
        }

        return head.value;
    }

    // Current size of hash table
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display Hash Table
    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            HashNode head = buckets[i];
            while (head != null) {
                System.out.print("[" + head.key + " : " + head.value + "] -> ");
                head = head.next;
            }

            System.out.println("null");

        }
    }
}

// Driver class
public class Hash_table
{
    public static void main(String[] args) {
        HashTable table = new HashTable(5);

        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(6, "Orange"); // Collision (since 6 % 5 == 1)

        table.display();

        System.out.println("Get key 2: " + table.get(2));
        System.out.println("Remove key 6: " + table.remove(6));
        System.out.println("Size: " + table.size());

        table.display();
    }

}
