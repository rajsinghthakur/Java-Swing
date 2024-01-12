import java.awt.*;
import javax.swing.JFrame;

class MyCanvas extends Canvas {

    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("C:\\Users\\rajth\\OneDrive\\Pictures\\images.png");
        g.drawImage(i, 100, 100, this);

    }

    public static void main(String[] args) {
        MyCanvas m = new MyCanvas();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}