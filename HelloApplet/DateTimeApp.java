import java.applet.Applet;
import java.awt.Graphics;
import java.sql.Date;

public class DateTimeApp extends Applet implements Runnable{

    Thread th;
    public void init(){
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g){
        Date d = new Date(2000);
        g.drawString(d.toString(), 50, 100);
    }

    public void run(){
        while (true) {
            repaint();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
    }
    }