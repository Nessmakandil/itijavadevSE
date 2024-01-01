public class MainClass {

    public static void main(String[] args) {
        MyInterface myInt = new MyClass();
        /* You can create object from an interface. so MyInterface myInt = new MyInterface(); is not allowed*/
        myInt.computeArea();
        myInt.doAnything(); /* Compile Error */
    }
}