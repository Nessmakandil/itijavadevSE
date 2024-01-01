public class StaticOuterClass {

    private int x;
    static int y;

    
    static class StaticInnerClass {
    
        public int returnMethod(){
            // x = 3;  wrong
            y = 3;
            return y;
        }  
    }
}