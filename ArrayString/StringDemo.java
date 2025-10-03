package ARRAY_STRING;
public class StringDemo {
    public static void main(String[] args) {
        // String class demonstration
        System.out.println("=== STRING CLASS DEMONSTRATION ===");
        String str1 = "Hello";
        String str2 = " World";

        // Concatenation
        String result = str1 + str2;
        System.out.println("Concatenation: " + result);

        // Length
        System.out.println("Length: " + result.length());

        // Character at index
        System.out.println("Char at index 1: " + result.charAt(1));

        // Substring
        System.out.println("Substring (0,5): " + result.substring(0, 5));

        // Uppercase/Lowercase
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // Replace
        System.out.println("Replace 'l' with 'x': " + result.replace('l', 'x'));

        // Split
        String[] parts = result.split(" ");
        System.out.println("Split result: " + java.util.Arrays.toString(parts));

//        System.out.println("Split result: " + parts);


        // Compare
        System.out.println("Equals 'Hello World': " + result.equals("Hello World"));

        // String is immutable - original remains unchanged
        System.out.println("Original string: " + str1);

        // StringBuffer demonstration
        System.out.println("\n=== STRINGBUFFER CLASS DEMONSTRATION ===");
        StringBuffer sbuffer = new StringBuffer("Hello");

        // Append
        sbuffer.append(" World");
        System.out.println("After append: " + sbuffer);

        // Insert
        sbuffer.insert(5, " Java");
        System.out.println("After insert: " + sbuffer);

        // Reverse
        sbuffer.reverse();
        System.out.println("After reverse: " + sbuffer);

        // Reverse back
        sbuffer.reverse();
        System.out.println("Reversed back: " + sbuffer);

        // Delete
        sbuffer.delete(5, 10);
        System.out.println("After delete: " + sbuffer);

        // Replace
        sbuffer.replace(6, 11, "Java");
        System.out.println("After replace: " + sbuffer);

        // Capacity
        System.out.println("Capacity: " + sbuffer.capacity());

        // StringBuilder demonstration
        System.out.println("\n=== STRINGBUILDER CLASS DEMONSTRATION ===");
        StringBuilder sbuilder = new StringBuilder("Hello");

        // Append
        sbuilder.append(" World");
        System.out.println("After append: " + sbuilder);

        // Insert
        sbuilder.insert(5, " Java");
        System.out.println("After insert: " + sbuilder);

        // Delete
        sbuilder.delete(5, 10);
        System.out.println("After delete: " + sbuilder);

        // Replace
        sbuilder.replace(6, 11, "Java");
        System.out.println("After replace: " + sbuilder);

        // Performance comparison
        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        int iterations = 100000;

        // String concatenation performance
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;
        System.out.println("String concatenation time: " + stringTime + "ms");

        // StringBuffer performance
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append("a");
        }
        long bufferTime = System.currentTimeMillis() - startTime;
        System.out.println("StringBuffer append time: " + bufferTime + "ms");

        // StringBuilder performance
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("a");
        }
        long builderTime = System.currentTimeMillis() - startTime;
        System.out.println("StringBuilder append time: " + builderTime + "ms");

        System.out.println("\nStringBuilder is " + (stringTime/builderTime) +
                " times faster than String for concatenation in this test");
    }
}