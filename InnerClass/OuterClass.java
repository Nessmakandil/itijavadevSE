// Normal Inner class
public class OuterClass {

    private int x;
    static int y;


    public void myMethod(){
        InnerClass m = new InnerClass();
    }

    class  InnerClass {
    
        int x;
        public int xMethod(){
            this.x = 3;
            OuterClass.this.x = 5; // of Inner
            return OuterClass.this.x; // of outer
        }
    }

    static class StaticInnerClass {
    
        public int returnMethod(){
            // x = 3;  wrong
            y = 3;
            return y;
        }  
    }

    public void classMethod(){
        final int v = 7;  

        class LocalInnerClass {

            public int InsideLocalInnerClassMethod(){
                System.out.println("Hello from local class");
                return v;
            }        
            
        }

        LocalInnerClass z = new LocalInnerClass();

        System.out.println("Inside Class Method "+z.InsideLocalInnerClassMethod());
    }

}    