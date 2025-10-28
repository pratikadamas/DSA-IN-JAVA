package Linkedlist;

public class DoublyLinklist {
   static class Node{
        int data;
        Node next;
        Node prev;
      public  Node(int d){
            data=d;
            next=null;

            prev=null;
        }
    }

   static class doublyList{
        Node head=null;
        Node tail=null;
        void add(int x){
            Node newnode= new Node(x);
            if(head==null){
                System.out.println("1st insertion data = "+x);
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }
        }

        void displayFront(){
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            System.out.println("Display front ");
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
       void displayReverse() {
           System.out.println("Display reverse ");
           Node temp = tail;
           while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.prev;
           }
       }
       void insertXafterY(int x,int y){
            Node newnode = new Node(y);
            Node temp = head;
            while (temp.data!=x){
                temp=temp.next;
                if(temp==null){
                    System.out.println("\nerror:: element "+x+" not found");
                    return;
                }
            }

            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;

       }

       int size(){
           Node temp = head;
           int count=0;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           return count;
       }

       void DeleteNodeAtIndex(int x){
            int count=0;

            if(x>size()||x<0){
                System.out.println("\nerror:: index out of bounds");
                return;
            }

            //Delete at 1st position
            if(x==0){
                head=head.next;
                head.prev=null;
            }
            else if (x == size() - 1) { // delete tail
                if (head == tail) { // only one node
                    head = null;
                    tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
            }

            else{
                Node temp = head;
                for (int i = 0; i < x; i++) {
                    temp = temp.next;
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;

            }



       }



   }

    public static void main(String[] args) {
       doublyList d= new doublyList();
       d.add(10);
       d.add(20);
       d.add(30);
       d.add(40);
       d.add(50);

       d.displayFront();

       d.displayReverse();


       d.insertXafterY(10,404);
        System.out.println("After insert 404 ");

        d.displayFront();
        System.out.println("\nSize of DoublyLinked list is "+d.size());

        System.out.println("Delete node at index 5");
        d.DeleteNodeAtIndex(2);

        System.out.println("Before Delete node at index 2");
        d.displayFront();
        System.out.println("\nAfter delete node at index 2");
        d.displayFront();

    }

}
