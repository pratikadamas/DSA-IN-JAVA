import java.util.Scanner;
import java.util.ArrayList;

class student{
    String name;
    int roll;
    public student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display() {
        System.out.println(name + " " + roll);
    }
}

public class array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(13);
        list.add(54);
        list.add(0);

        System.out.println(list);

        System.out.println("To get a element by index == "+list.get(4));
        System.out.println("Add a new element by index position \n Enter a valid index \n Coresponding value ");
        int i = sc.nextInt();
        int value = sc.nextInt();
        list.add(i,value);
        System.out.println(list);

        System.out.println("Modify a element by index \n Enter a valid index \n New value ");
        i = sc.nextInt();
        value = sc.nextInt();

        list.set(i,value);

        System.out.println(list);
        list.sort(null);
        System.out.println("sort the arraylist ");
        System.out.println(list);

        ArrayList<student> stu = new ArrayList<>();
        stu.add(new student("John", 1));
        stu.add(new student("Jane", 2));
        stu.add(new student("Jack", 3));
        stu.add(new student("Bob", 4));
        stu.add(new student("Mary", 5));
//        System.out.println(stu);

        System.out.println("user define arraylist display--");
        System.out.println(stu);// hashcode

        for(student s : stu) {
            System.out.println(s.name+" "+s.roll);
            s.display();
        }




    }
}
