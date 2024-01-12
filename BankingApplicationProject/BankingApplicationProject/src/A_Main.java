import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A_Main implements ActionListener {

    private JFrame fram1 = new JFrame();
    private JButton admin, user, exit;

    public void main() {
        fram1.setTitle("BANKING_APPLICATION");
        fram1.setLayout(null);

        // set logo image
        ImageIcon i1 = new ImageIcon("C:/Users/rajth/OneDrive/Pictures/61YkROJyjqL._SX522_.jpg");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(80, 10, 100, 100);
        fram1.add(label);

        // 1 label text
        JLabel text1 = new JLabel("Welcome to RS Bank");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(200, 25, 400, 40);
        fram1.add(text1);

        // 2 label text
        JLabel text2 = new JLabel("Rising Stars Bank");
        text2.setFont(new Font("Osward", Font.PLAIN, 16));
        text2.setBounds(200, 60, 400, 40);
        fram1.add(text2);

        // admin button
        admin = new JButton("Admin");
        admin.setFont(new Font("Raleway", Font.BOLD, 20));
        admin.setBounds(230, 160, 100, 50);
        admin.setBackground(Color.black);
        admin.setForeground(Color.white);
        admin.addActionListener(this);
        fram1.add(admin);

        // user button
        user = new JButton("User");
        user.setFont(new Font("Raleway", Font.BOLD, 20)); // font size
        user.setBounds(430, 160, 100, 50);
        user.setBackground(Color.black); // button bc color
        user.setForeground(Color.white); // button text color
        user.addActionListener(this);
        fram1.add(user);

        // Exit button
        exit = new JButton("EXIT");
        exit.setFont(new Font("Raleway", Font.BOLD, 20));
        exit.setBounds(230, 240, 300, 50);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        fram1.add(exit);

        fram1.getContentPane().setBackground(Color.white); // contener color
        fram1.setSize(800, 480); // set size
        fram1.setVisible(true); // visible
        fram1.setLocation(350, 200); // location

    }

    // Action button
    public void actionPerformed(ActionEvent action1) {
        if (action1.getSource() == admin) {
            fram1.setVisible(false);
            B_AdminLogin a = new B_AdminLogin();
            a.adminlogin();
        } else if (action1.getSource() == user) {
            fram1.setVisible(false);
            C_UserLogin u = new C_UserLogin();
            u.user();
        } else if (action1.getSource() == exit) {
            fram1.setVisible(false);
            System.out.println("Successfuly Completed Application");
            fram1.dispose();
        }
    }

    public static void main(String[] args) {
        A_Main m = new A_Main();
        m.main();
    }
}