public class String_in_java {

    public static void main(String[] args) {

        System.out.println('a'+'b'); // add ASCII code
        System.out.println("a"+"b"); // string concatination
        System.out.println((char)('a'+3)); // o/p= d
        System.out.println("a"+1);
        //this is same as after few steps: "a"+"1"
        // integer will be converted to Integer that will call toString()


        String x = new String("kunal"); // new object in heap
        String y = new String("kunal"); // another new object

        System.out.println(x==y);          // false (different objects)
        System.out.println(x.equals(y));     // true  (same content)
        System.out.println(x.hashCode());    // same hashCode
        System.out.println(y.hashCode());    // same hashCode



        String a="kunal";
        String b="kunal";
        System.out.println(" hashcode a= "+a.hashCode()+"\n hashcode b= "+b.hashCode());// a,b both refer a same object

//        let change the a

        a="pratik";// create a new object
//        b="giri";// a refers "pratik" and b refers "giri"  and  "kunal" destroy
        b=a;
        System.out.println(" hashcode a= "+a.hashCode());
        System.out.println(" hashcode b= "+b.hashCode());
        System.out.println(b);


// tosring
        Integer i=126;
        System.out.println(i.toString());

//        length() function

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"



        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));
        // Outputs 7  The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

//        if not found return -1

        System.out.println("ends with =="+txt2.endsWith("occurs!"));
        System.out.println("strat == "+txt.startsWith("Please "));

        String txt3= "Hello";
        System.out.println(txt3.charAt(0));  // H
        System.out.println(txt3.charAt(4));

//        You can also use the concat() method to concatenate strings:
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));


        // String
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s); // "Hello"

        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb); // "Hello World"

        // StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println("StringBuilder: " + sbd); // "Hello World"

    }

}
