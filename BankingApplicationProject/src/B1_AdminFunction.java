import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B1_AdminFunction implements ActionListener {
    private JFrame fram4 = new JFrame();
    private JButton b1, b2, b3, b4, b5, b6, b7, back;

    public void adminfunction() {
        fram4.setTitle("Admin");
        fram4.setLayout(null);

        JLabel text1 = new JLabel("Welcome Admin");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(250, 25, 300, 40);
        fram4.add(text1);

        // create account button
        b1 = new JButton("Create Account");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBounds(100, 100, 250, 50);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        fram4.add(b1);

        // View all account button
        b2 = new JButton("View All Account");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBounds(100, 180, 250, 50);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        fram4.add(b2);

        // block account button
        b5 = new JButton("Block Account");
        b5.setFont(new Font("Raleway", Font.BOLD, 18));
        b5.setBounds(100, 260, 250, 50);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        fram4.add(b5);

        // update account button
        b4 = new JButton("Update Account");
        b4.setFont(new Font("Raleway", Font.BOLD, 18));
        b4.setBounds(100, 340, 250, 50);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        fram4.add(b4);

        // delete account button
        b6 = new JButton("Delete Account");
        b6.setFont(new Font("Raleway", Font.BOLD, 18));
        b6.setBounds(400, 100, 250, 50);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        fram4.add(b6);

        // view account button
        b3 = new JButton("View_Particular Account");
        b3.setFont(new Font("Raleway", Font.BOLD, 18));
        b3.setBounds(400, 180, 250, 50);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        fram4.add(b3);

        // delete account button
        b7 = new JButton("Unblock Account");
        b7.setFont(new Font("Raleway", Font.BOLD, 18));
        b7.setBounds(400, 260, 250, 50);
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b7.addActionListener(this);
        fram4.add(b7);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(400, 340, 250, 50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram4.add(back);

        fram4.getContentPane().setBackground(Color.white);
        fram4.setSize(800, 480);
        fram4.setLocation(350, 200);
        fram4.setVisible(true);
    }

    public void actionPerformed(ActionEvent action4) {
        Updatedata up = new Updatedata();
        B11_Account ac = new B11_Account();
        Particulerdata pr = new Particulerdata();
        A_Main m = new A_Main();
        Getdata obj = new Getdata();

        if (action4.getSource() == b1) {
            ac.createaccount();
        } else if (action4.getSource() == b2) {
            obj.read();
        } else if (action4.getSource() == b3) {
            pr.Particuler();
        } else if (action4.getSource() == b4) {
            up.update();
        } else if (action4.getSource() == b5) {
            up.Block();
        } else if (action4.getSource() == b6) {
            up.Delete();
        } else if (action4.getSource() == b7) {
            up.Unblock();
        } else if (action4.getSource() == back) {
            fram4.setVisible(false);
            m.main();
        }
    }

    public static void main(String[] args) {
        B1_AdminFunction a = new B1_AdminFunction();
        a.adminfunction();
    }
}
