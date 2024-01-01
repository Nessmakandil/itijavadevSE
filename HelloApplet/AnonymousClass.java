import java.applet.Applet;
import java.awt.Graphics;
/**
 * AnonymousClass
 */
public class AnonymousClass extends Applet{

    int x;

    public void doSomething(){
        System.out.println("Anonymous outer Class");
    }

    

    public void init(){
        Thread th = new Thread(new Runnable() {
            public void run(){
                // Perform some task or operation
            for (int i = 0; i < 10; i++) {
                System.out.println("Count: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            // Update the value of x in the outer class
            x = 42;
            
            // Call a method in the outer class
            doSomething();
            }
        });

        th.start();
    }

    public void paint(Graphics g) {
            g.drawString("Output of paint method",20,20);
        }
}