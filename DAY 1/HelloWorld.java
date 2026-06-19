class Name {
    public static void printName() {
        System.out.println("My name is ChatGPT.");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Name.printName();
        new practise();
        new shaadi();
        practise.abc();
    }
}
class shaadi {

    static {
        System.out.println("This is shaadi class");
    }
}
class practise{
    public static void abc(){
        System.out.println("This is abc method");
    }
    practise(){
         System.out.println("This is practise class");
    }
}