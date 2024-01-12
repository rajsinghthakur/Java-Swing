import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class C_UserLogin implements ActionListener {
    private JFrame fram3 = new JFrame();
    private JButton login, clear, back;
    private JTextField user_id;
    private JPasswordField user_password;
    public static String acnumber;

    public void user() {
        fram3.setTitle("User Login");
        fram3.setLayout(null);

        // set logo image
        ImageIcon i1 = new ImageIcon("C:/Users/rajth/OneDrive/Pictures/61YkROJyjqL._SX522_.jpg");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label2 = new JLabel(i3);
        label2.setBounds(180, 15, 100, 100);
        fram3.add(label2);

        // label 1 text
        JLabel text1 = new JLabel("User Login");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(290, 38, 350, 50);
        fram3.add(text1);

        // label 2 text
        JLabel text2 = new JLabel("User Account_No :");
        text2.setFont(new Font("Osward", Font.BOLD, 20));
        text2.setBounds(120, 150, 200, 30);
        fram3.add(text2);

        // text field 1
        user_id = new JTextField();
        user_id.setFont(new Font("Osward", Font.PLAIN, 18));
        user_id.setBounds(300, 150, 230, 30);
        fram3.add(user_id);

        // label 3 text
        JLabel text3 = new JLabel("Password :");
        text3.setFont(new Font("Osward", Font.BOLD, 20));
        text3.setBounds(120, 200, 200, 30);
        fram3.add(text3);

        // text field 2
        user_password = new JPasswordField(20);
        user_password.setFont(new Font("Osward", Font.PLAIN, 18));
        user_password.setBounds(300, 200, 230, 30);
        fram3.add(user_password);

        // login button
        login = new JButton("lOGIN");
        login.setFont(new Font("Raleway", Font.BOLD, 18));
        login.setBounds(300, 250, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        fram3.add(login);

        // clear button
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Raleway", Font.BOLD, 18));
        clear.setBounds(430, 250, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        fram3.add(clear);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(300, 300, 230, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram3.add(back);

        fram3.getContentPane().setBackground(Color.white);
        fram3.setSize(800, 480);
        fram3.setLocation(350, 200);
        fram3.setVisible(true);
    }

    public void actionPerformed(ActionEvent action3) {
        if (action3.getSource() == login) {
            D_DatabaseConnection obj = new D_DatabaseConnection();
            String u_id = user_id.getText();
            this.acnumber = u_id;
            char c[] = user_password.getPassword();
            String u_password = String.valueOf(c);
            String q2 = "select * from account where account_number = " + u_id + " and password = '" + u_password
                    + "';";
            try {
                ResultSet rs = obj.s.executeQuery(q2);
                if (rs.next()) {
                    fram3.setVisible(false);
                    C1_UserFunction uf = new C1_UserFunction();
                    uf.userfunction();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Information plese try again");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect Information plese try again");
            }
        } else if (action3.getSource() == clear) {
            user_id.setText(null);
            user_password.setText(null);
        } else if (action3.getSource() == back) {
            fram3.setVisible(false);
            A_Main m = new A_Main();
            m.main();
        }
    }

    public static void main(String[] args) {
        C_UserLogin u = new C_UserLogin();
        u.user();
    }
}
