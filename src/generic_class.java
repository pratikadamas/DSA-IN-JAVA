class box <T> {
    private T t;
     box(T t){
         this.t = t;
     }
     void show(){
         System.out.println(t);
     }
}


public class generic_class {
    public static void main(String[] args) {
        System.out.println(" Generic class");

        box<Integer> I=new box<>(123);
        I.show();
        box<Double> D=new box<>(12.3);
        D.show();
        box<Float> F=new box<>(12.3f);
        F.show();
        box<Character> C=new box <>('a');
        C.show();
        box<String> S=new box<>("hello");
        S.show();
    }
}
