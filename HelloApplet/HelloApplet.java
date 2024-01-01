import java.applet.Applet;
/*import java.awt.Font;*/
import java.awt.*;
import java.awt.event.ActionEvent;
/*import java.awt.Toolkit;*/
import java.awt.event.ActionListener;


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
        g.drawString("X= "+x, 100, 200);

        g.drawString("Hello from Java Applet", 50, 100);
    }
    Button bButton, xButton;
    bButtonListener li;
    // xButtonListener lx;
    int x;

    public void init(){ 

    bButton = new Button("ok");
    xButton = new Button("X++");

    li = new bButtonListener();
    // lx = new xButtonListener();

    bButton.addActionListener(li);
    xButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            x++;
            repaint();
            System.out.println("x button clicked");
        }
    });
    add(bButton);
    add(xButton);
    }

    /**
     * MyListener
     */
    class bButtonListener implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            System.out.println("b button clicked");
        }

    }
}