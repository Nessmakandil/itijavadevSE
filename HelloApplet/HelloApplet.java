import java.applet.Applet;
import java.awt.Color;
/*import java.awt.Font;*/
import java.awt.Graphics;
/*import java.awt.Toolkit;*/


public class HelloApplet extends Applet{

    public void paint (Graphics g){
        Color c = new Color(200, 100, 120);
        /* 
        Toolkit t= Toolkit.getDefaultToolkit();
        String[] s = t.getFontList();
        Font f = new Font(getName(), 10, 3);
        g.setFont(getFont(f));
        */
        g.setColor(c);
        g.drawString("Hello from Java Applet", 50, 100);
    }
}