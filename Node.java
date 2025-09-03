public class Node {
    static  class node {
        int data;
        node next;

        node(int x) {
            this.data = x;
        }
    }

    static void display( node head )
    {
        while( head !=null){
            System.out.println("\n"+head.data); // This will add an extra newline before each number
            head = head.next;
        }

    }
    static void disrec( node head ){
        if( head ==null )
            return;
//        System.out.println( head.data );  forward direction
        disrec( head.next );
        System.out.println( head.data );  // reverse direction

    }

    static  int length( node head ){
        int i=0;
        while( head !=null){
            i++;
            head = head.next;
        }
        return i;
    }


    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(6);
        node c = new node(7);
        node d = new node(8);
        node e = new node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = a; // This line is commented out, which is good for a linear list. If uncommented, it would create a circular linked list.
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

        // Display the linkedlist use while loop
        node temp=a;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(); // Add a newline after the iterative display for better formatting

        // Display using function
        display(a);
        System.out.println("data value a=="+a.data);

        // use recursion - Moved inside main
        System.out.println("\nDisplay using recursion:"); // Added a label for clarity
        disrec(a);

//        System.out.println("Length of linked list");
       int len =length(a);
       System.out.println("Length of linked list:"+len);



    }
}