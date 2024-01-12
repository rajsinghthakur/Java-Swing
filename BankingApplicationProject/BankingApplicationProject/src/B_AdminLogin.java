import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class B_AdminLogin implements ActionListener {
    private JFrame fram2 = new JFrame();
    private JButton login, clear, back;
    private JTextField admin_id;
    private JPasswordField admin_password;

    public void adminlogin() {
        fram2.setTitle("Admin Login");
        fram2.setLayout(null);

        // set logo image
        ImageIcon i1 = new ImageIcon("C:/Users/rajth/OneDrive/Pictures/61YkROJyjqL._SX522_.jpg");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label2 = new JLabel(i3);
        label2.setBounds(180, 15, 100, 100);
        fram2.add(label2);

        // label 1 text
        JLabel text1 = new JLabel("Admin Login");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(290, 38, 350, 50);
        fram2.add(text1);

        // label 2 text
        JLabel text2 = new JLabel("Admin ID :");
        text2.setFont(new Font("Osward", Font.BOLD, 20));
        text2.setBounds(170, 150, 200, 30);
        fram2.add(text2);

        // text field 1
        admin_id = new JTextField();
        admin_id.setFont(new Font("Osward", Font.PLAIN, 18));
        admin_id.setBounds(290, 150, 230, 30);
        fram2.add(admin_id);

        // label 3 text
        JLabel text3 = new JLabel("Password :");
        text3.setFont(new Font("Osward", Font.BOLD, 20));
        text3.setBounds(170, 200, 200, 30);
        fram2.add(text3);

        // text field 2
        admin_password = new JPasswordField(20);
        admin_password.setFont(new Font("Osward", Font.PLAIN, 18));
        admin_password.setBounds(290, 200, 230, 30);
        fram2.add(admin_password);

        // login button
        login = new JButton("lOGIN");
        login.setFont(new Font("Raleway", Font.BOLD, 18));
        login.setBounds(290, 250, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        fram2.add(login);

        // clear button
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Raleway", Font.BOLD, 18));
        clear.setBounds(420, 250, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        fram2.add(clear);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(290, 300, 230, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram2.add(back);

        fram2.getContentPane().setBackground(Color.white);
        fram2.setSize(800, 480);
        fram2.setLocation(350, 200);
        fram2.setVisible(true);
    }

    public void actionPerformed(ActionEvent action2) {
        if (action2.getSource() == login) {
            D_DatabaseConnection obj = new D_DatabaseConnection();
            String a_id = admin_id.getText();
            char c[] = admin_password.getPassword();
            String a_password = String.valueOf(c);
            if (!a_id.matches("^[0-9]+$")) {
                JOptionPane.showMessageDialog(null, "Incorrect Id please enter only numbers");
            } else if (!a_password.matches("^[a-zA-Z0-9@]+$")) {
                JOptionPane.showMessageDialog(null, "Incorrect password");
            } else {
                String q3 = "select * from admin where admin_id = " + a_id + " and password = '" + a_password + "'";
                try {
                    ResultSet rs = obj.s.executeQuery(q3);
                    if (rs.next()) {
                        fram2.setVisible(false);
                        B1_AdminFunction f = new B1_AdminFunction();
                        f.adminfunction();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Information plese try again");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Plese enter ID and Password");
                }
            }
        } else if (action2.getSource() == clear) {
            admin_id.setText(null);
            admin_password.setText(null);
        } else if (action2.getSource() == back) {
            fram2.setVisible(false);
            A_Main m = new A_Main();
            m.main();
        }
    }

    public static void main(String[] args) {
        B_AdminLogin obj = new B_AdminLogin();
        obj.adminlogin();
    }
}