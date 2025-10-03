package ArrayString;

import java.util.Arrays;

public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello world";
        String str3 = "Java,Python,C++";

        String s = "    the sky is blue     ";
        String[] words = s.split(" "); // split by space

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Find first occurrence of a substring
        int index2 = str.indexOf("\nWorld");
        System.out.println("'World' starts at index: " + index2); // 6

        // If not found
        int index3 = str.indexOf("Java");
        System.out.println("Index of 'Java': " + index3); // -1

        // 1. length()
        System.out.println("Length: " + str.length()); // 11

        // 2. charAt()
        System.out.println("Char at index 1: " + str.charAt(1)); // 'e'

        // 3. equals()
        System.out.println("Equals: " + str.equals(str2)); // false

        // 4. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2)); // true

        // 5. compareTo()
        System.out.println("CompareTo: " + "abc".compareTo("abd")); // -1

        // 6. isEmpty()
        System.out.println("Is Empty: " + "".isEmpty()); // true

        // 7. substring()
        System.out.println("Substring(6): " + str.substring(6)); // World
        System.out.println("Substring(0,5): " + str.substring(0,5)); // Hello

        // 8. indexOf & lastIndexOf
        System.out.println("IndexOf 'World': " + str.indexOf("World")); // 6
        System.out.println("LastIndexOf 'l': " + str.lastIndexOf("l")); // 9

        // 9. contains()
        System.out.println("Contains 'Hello': " + str.contains("Hello")); // true

        // 10. startsWith & endsWith
        System.out.println("StartsWith 'Hel': " + str.startsWith("Hel")); // true
        System.out.println("EndsWith 'ld': " + str.endsWith("ld")); // true

        // 11. toLowerCase & toUpperCase
        System.out.println("LowerCase: " + str.toLowerCase());
        System.out.println("UpperCase: " + str.toUpperCase());

        // 12. trim()
        System.out.println("Trim: '" + "   hi   ".trim() + "'"); // "hi"

        // 13. replace()
        System.out.println("Replace: " + str.replace('o', '0')); // Hell0 W0rld

        // 14. replaceAll & replaceFirst
        System.out.println("ReplaceAll digits: " + "a1b2c3".replaceAll("[0-9]", "")); // abc
        System.out.println("ReplaceFirst digit: " + "a1b2c3".replaceFirst("[0-9]", "")); // ab2c3

        // 15. split()
        String[] langs = str3.split(",");
        System.out.println("Split: " + Arrays.toString(langs)); // [Java, Python, C++]

        // 16. join()
        String joined = String.join("-", "2025", "10", "03");
        System.out.println("Join: " + joined); // 2025-10-03

        // 17. toCharArray()
        char[] arr = str.toCharArray();
        System.out.println("ToCharArray: " + Arrays.toString(arr));

        // 18. getBytes()
        byte[] bytes = "ABC".getBytes();
        System.out.println("GetBytes: " + Arrays.toString(bytes)); // [65,66,67]

        // 19. matches()
        System.out.println("Matches digits: " + "12345".matches("\\d+")); // true

        // 20. intern()
        String s1 = new String("hello");
        String s2 = s1.intern();
        System.out.println("Intern check: " + (s1 == s2)); // false

        // 21. format()
        String msg = String.format("Name: %s, Age: %d", "Pratik", 20);
        System.out.println("Format: " + msg);

        // 22. valueOf()
        int n = 100;
        System.out.println("ValueOf: " + String.valueOf(n)); // "100"

        // 23. concat()
        System.out.println("Concat: " + "Hello".concat(" World"));

        // 24. repeat() (Java 11+)
        System.out.println("Repeat: " + "Hi ".repeat(3)); // "Hi Hi Hi "
    }
}

