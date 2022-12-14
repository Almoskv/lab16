import java.awt.*;
import javax.swing.JFrame;

public class ris extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing house");
        Canvas canvas = new ris();
        canvas.setSize(450,350);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(25,175,125,75);
        g.drawLine(150,100,150,75);
        g.drawLine(175,125,175,75);
        g.drawLine(225,175,125,75);
        g.drawLine(150,75,175,75);
        g.drawLine(25,300,425,300);
        g.drawLine(365,250,365,300);
        g.drawLine(335,250,335,300);
        g.drawArc(275,50,150,200,280,340);
        g.drawRect(50,150,150,150);
        g.drawRect(75,200,50,50);
    }
}