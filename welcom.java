import javax.swing.*;

public class welcom {
    public static void main(String[] args) {
        JFrame f = new JFrame("welcom");

        JLabel l1 = new JLabel("First Label");
        l1.setBounds(0, 0, 100, 100);
        f.add(l1);
        // JLabel l2 = new JLabel("Second Label");
        // l2.setBounds(100, 40, 60, 120);
        // f.add(l2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
