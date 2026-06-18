public class Main {
    <T> void  genprint(T t){
        System.out.println(t);
    }
static  <T> void diplay(T t){
        System.out.println(t.getClass().getName());


}
static  void show( int  ...v){
    System.out.println("no of arguments "+v.length);
    for(int i: v){
        System.out.println(i);
    }

}
static void show1(Object ...obj){
        for( Object o: obj)
        {
            System.out.println(o);
        }


    }

    // swap any type of datatype
    static <T,U> void swap(T t, U u) {
        T temp = t;
        t =(T) u;       // there is a type cast problem T,U may be same or different datatype
        u = (U) temp;
        System.out.println("After swap t = " + t + ", u = " + u);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main main = new Main();
        main.genprint("pratik");
        main.genprint(521);
        diplay("pratik Giri");
        swap("giri",123);
        show(1,78,-98,45,0);
        show(); //""" only sout statement execute ,,,, for loop do not execute due v length 0 """
        show1(10,"pratik",0.23333,true);
    }
}