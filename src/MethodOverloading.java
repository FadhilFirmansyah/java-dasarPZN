public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Fadhil");
        sayHello("Fadhil", "Firmansyah");
    }

    public static void sayHello(){
        System.out.println("Hello, World!");
    }
    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }
    public static void sayHello(String firstName, String lastName){
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
