public class two_linkedlist {

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;

        }
    }


    static  class linkedList {
            node head=null;
            node tail=null;


      void add(int data)
      {
          node newNode = new node(data);
          if (head == null) {
              head = newNode;
              tail = newNode;
              return;
          }
          else {
              tail.next = newNode;
              tail = newNode;
          }
      }

      void display()
      {
          node temp=head;
          while (temp!=null){
              System.out.print(temp.data+" ");
              temp=temp.next;
          }
      }

      void reverse(node head){
          node temp=head;
          if(temp==null)
          {
              return;
          }
          else {
              reverse(temp.next);
              System.out.print(temp.data+" ");
          }
      }

    }

  static void add2node(node n1,node n2 )
    {
        node temp1=n1,temp2=n2;
        linkedList dummy=new linkedList();
//        node curr=dummy.head;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
            int sum=carry;
            if (temp1!=null){
                sum+=temp1.data;
                temp1=temp1.next;
            }

            if (temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }

            dummy.add(sum%10);
//            node newnode=new node(sum%10);



            carry=sum/10;

//            temp1=temp1.next;
//            temp2=temp2.next;

        }
        if(carry!=0){
            dummy.add(carry);

        }

        dummy.display();



    }




    public static void main(String[] args) {
        linkedList l1=new linkedList();

        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);

        linkedList l2=new linkedList();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(5);
        l2.add(0);

        l1.display();
        System.out.println();
        l2.display();

        System.out.println();

        add2node(l1.head,l2.head);
        System.out.println("\nReverse the list");

        l1.reverse(l1.head);



    }
}