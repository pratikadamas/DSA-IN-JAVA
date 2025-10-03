package ArrayString;

public class StringBuilderDemo {
    public static void main(String[] args) {

        // 1. Creating StringBuilder objects
        StringBuilder sb1 = new StringBuilder(); // Empty StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello"); // Initialized with a string

        System.out.println("Initial sb2: " + sb2);

        // 2. append() - Adds text to the end
        sb2.append(" World");
        System.out.println("After append: " + sb2);

        // 3. insert() - Inserts text at a specific index
        sb2.insert(6, "Java "); // Insert "Java " at index 6
        System.out.println("After insert: " + sb2);

        // 4. replace() - Replaces characters from start to end index
        sb2.replace(6, 10, "C++"); // Replace "Java" with "C++"
        System.out.println("After replace: " + sb2);

        // 5. delete() - Removes characters from start to end index
        sb2.delete(6, 10); // Delete "C++ "
        System.out.println("After delete: " + sb2);

        // 6. reverse() - Reverses the string
        sb2.reverse();
        System.out.println("After reverse: " + sb2);

        // Reversing back to original
        sb2.reverse();

        // 7. charAt() - Returns character at index
        char ch = sb2.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // 8. setCharAt() - Changes character at index
        sb2.setCharAt(0, 'h'); // Change 'H' to 'h'
        System.out.println("After setCharAt: " + sb2);

        // 9. length() - Returns number of characters
        int len = sb2.length();
        System.out.println("Length: " + len);

        // 10. capacity() - Returns current capacity of StringBuilder
        int cap = sb2.capacity();
        System.out.println("Capacity: " + cap);

        // 11. ensureCapacity() - Ensures minimum capacity
        sb2.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb2.capacity());

        // 12. setLength() - Sets new length, truncates or pads with '\u0000'
        sb2.setLength(5);
        System.out.println("After setLength(5): " + sb2);

        // Reset to a proper value for next examples
        sb2.setLength(0);
        sb2.append("Hello World");

        // 13. substring() - Returns a part of string
        String sub = sb2.substring(0, 5);
        System.out.println("Substring(0,5): " + sub);

        // 14. indexOf() - Returns index of substring
        int idx = sb2.indexOf("World");
        System.out.println("Index of 'World': " + idx);

        // 15. lastIndexOf() - Returns last index of substring
        int lastIdx = sb2.lastIndexOf("l");
        System.out.println("Last index of 'l': " + lastIdx);

        // 16. toString() - Converts StringBuilder to String
        String str = sb2.toString();
        System.out.println("Converted to String: " + str);

        // 17. deleteCharAt() - Deletes character at index
        sb2.deleteCharAt(5); // Remove space
        System.out.println("After deleteCharAt(5): " + sb2);

        // 18. trimToSize() - Trims capacity to current length
        sb2.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb2.capacity());
    }
}
