public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass m = obj.new InnerClass();

        OuterClass.StaticInnerClass obj2 = new OuterClass.StaticInnerClass();
        

        System.out.println(m.xMethod());
        System.out.println(obj2.returnMethod());
        obj.classMethod();
    }
}