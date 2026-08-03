public class instence {
    static {
        System.out.println("Hello from static block ");
    }
    {
        System.out.println("Hello from Instance  block ");
    }
    instence() {
        System.out.println("Hello from Constructor ");
    }
    public static void main(String[] args) {
        System.out.println("java code execution started");
        instence obj1 = new instence();
//        instence obj2 = new instence();
        System.out.println("java code execution ended");

    }
}
