public class singlelinkedlist
{
    public static  class node{
        int data;
        node next;
        node(int x)
        {
            this.data=x;
        }
    }


    public static class Linkedlist{

        node head=null;
        node tail=null;
        void  insertAtEnd(int x){
            node temp=new node(x);
            if(head==null){
                head=temp;
                tail=temp;

                return;
            }
            else {
                tail.next = temp;
                tail = temp;
            }

        }
    //Dispaly the Linkedlist
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }


        int size()
        {
           int  count=0;
           node temp=head;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           return count;

        }

        // Insert at bigening
        void insertAtStart(int x){
            node temp=new node(x);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }


        void insertAt(int index,int x)
        {
            node newNode=new node(x);
            node temp=head;
            if(index==size()){
                insertAtEnd(x);
                return;
            }
            if(index==0){
                insertAtStart(x);
                return;
            }
            if(index<0||index>size()){
                System.out.println("Invalid index!!.");
                return;
            }

            for(int i=1;i<index;i++){
                temp=temp.next;

            }
            newNode.next=temp.next;
            temp.next=newNode;


        }


        int getAt(int index){
            node temp=head;

            if(index<0||index>size()){
                System.out.println("Invalid index!!.");
                return -1;
            }
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }


        void delete(int index){
            if (head == null) {
                System.out.println("List is empty. Cannot delete.");
                return;
            }
            if (index < 0 || index >= size()) { // Valid indices are 0 to size-1
                System.out.println("Invalid index!!.");
                return;
            }

            if (index == 0) { // Deleting the head
                head = head.next;
                if (head == null) { // If list becomes empty after deleting head
                    tail = null;
                }
                return;
            }

            node temp = head;
            for (int i = 0; i < index - 1; i++) { // Iterate to the node *before* the one to be deleted
                temp = temp.next;
            }

            // Now temp is the node *before* the one to be deleted
            if (temp.next == tail) { // If deleting the tail node
                tail = temp;
            }
            temp.next = temp.next.next;
        }


    }


    public static void main(String[] args) {


//         Why can you create an object if Linkedlist is static?
//
//        Because in Java:
//
//        static on a nested class (like your Linkedlist) only means:
//
//“This inner class does not depend on an object of the outer class (singlelinkedlist).”

        Linkedlist l=new Linkedlist();
        l.insertAtEnd(1);
        l.insertAtEnd(2);//1->2
        l.insertAtEnd(3);//1->2->3
        l.insertAtEnd(4);//1->2->3->4
        l.insertAtStart(0);
        l.insertAtStart(-1);
        l.display();
        System.out.println("\nSize of the linkedlist is : "+l.size());
        System.out.println(l.tail.data);
        l.insertAt(8,10);
//        System.out.println("\nSize of the linkedlist is : "+l.size());
//        System.out.println(l.tail.data);
        System.out.println("data at index 4 :- "+l.getAt(-1));
       l.delete(1);
       System.out.println("after deleting");
       l.display();

    }
}
