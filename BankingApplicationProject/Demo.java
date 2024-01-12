// //JButton
// //JFrame
// //JLable
// //JTextfeld
// //JPasswordfeald
// //ActionListioner

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setTitle("SWING");
        obj.setLayout(null);

        // set logo image
        ImageIcon i1 = new ImageIcon("C:\\Users\\rajth\\OneDrive\\Pictures\\photo-1502989642968-94fbdc9eace4.jpeg");
        Image i2 = i1.getImage().getScaledInstance(500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 750);
        obj.add(image);

        JLabel jl = new JLabel("Login Page");
        jl.setBounds(125, 20, 270, 45);
        jl.setFont(new Font("", Font.BOLD, 40));
        jl.setForeground(Color.white);
        image.add(jl);

        // set logo image
        ImageIcon ii1 = new ImageIcon("C:\\Users\\rajth\\OneDrive\\Pictures\\61YkROJyjqL._SX522_.jpg");
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(180, 105, 100, 100);
        image.add(iimage);
        
        JLabel n1 = new JLabel("Name :");
        n1.setBounds(50, 250, 130, 25);
        n1.setFont(new Font("", Font.BOLD, 24));
        n1.setForeground(Color.white);
        image.add(n1);

        JTextField t1 = new JTextField();
        t1.setFont(new Font("", Font.PLAIN, 17));
        t1.setBounds(190, 250, 200, 25);
        image.add(t1);

        JLabel n2 = new JLabel("Password :");
        n2.setBounds(50, 310, 130, 25);
        n2.setFont(new Font("", Font.BOLD, 24));
        n2.setForeground(Color.white);
        image.add(n2);

        JTextField t2 = new JTextField();
        t2.setFont(new Font("", Font.PLAIN, 17));
        t2.setBounds(190, 310, 200, 25);
        image.add(t2);

        obj.setSize(500, 750);
        obj.setLocation(520, 40);
        obj.setVisible(true);

    }
}

// import java.awt.Color;
// import java.awt.Font;
// import java.awt.Image;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPasswordField;
// import javax.swing.JTextField;

// public class Demo implements ActionListener {
// private static JButton b1, b2;
// private static JTextField t1;
// private static JPasswordField t2;

// public void demo() {
// JFrame obj = new JFrame("demo swing");
// obj.setLayout(null);

// // set logo image
// ImageIcon i1 = new
// ImageIcon("C:\\Users\\rajth\\OneDrive\\Pictures\\61YkROJyjqL._SX522_.jpg");
// Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
// ImageIcon i3 = new ImageIcon(i2);
// JLabel label = new JLabel(i3);
// label.setBounds(100, 100, 200, 200);
// obj.add(label);

// // 1 label text
// JLabel text1 = new JLabel("Welcome");
// text1.setFont(new Font("Osward", Font.BOLD, 36));
// text1.setBounds(200, 25, 400, 40);
// obj.add(text1);

// // 1 label text
// JLabel text2 = new JLabel("Admin");
// text2.setFont(new Font("Osward", Font.BOLD, 26));
// text2.setBounds(150, 180, 150, 40);
// obj.add(text2);

// // text feald 1
// t1 = new JTextField();
// t1.setFont(new Font("Osward", Font.PLAIN, 22));
// t1.setBounds(300, 180, 200, 40);
// obj.add(t1);

// // 1 label text
// JLabel text3 = new JLabel("Password");
// text3.setFont(new Font("Osward", Font.BOLD, 26));
// text3.setBounds(150, 230, 150, 40);
// obj.add(text3);

// // text feald 1
// t2 = new JPasswordField();
// t2.setFont(new Font("Osward", Font.PLAIN, 22));
// t2.setBounds(300, 230, 200, 40);
// obj.add(t2);

// // Button 1
// b1 = new JButton("login");
// b1.setFont(new Font("Osward", Font.PLAIN, 26));
// b1.setBounds(350, 280, 100, 40);
// obj.add(b1);

// // Button 2
// b2 = new JButton("clear");
// b2.setFont(new Font("Osward", Font.PLAIN, 26));
// b2.setBounds(250, 280, 100, 40);
// b2.addActionListener(this);
// obj.add(b2);

// obj.getContentPane().setBackground(Color.white); // contener color
// obj.setSize(800, 480); // set size
// obj.setVisible(true); // visible
// obj.setLocation(350, 200); // location
// }

// public void actionPerformed(ActionEvent ac) {
// if (ac.getSource() == b2) {
// t1.setText("");
// t2.setText("");
// }
// }

// public static void main(String[] args) {
// Demo obj = new Demo();
// obj.demo();
// }
// }
