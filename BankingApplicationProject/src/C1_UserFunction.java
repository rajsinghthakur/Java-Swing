import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;

public class C1_UserFunction implements ActionListener {
    private JFrame fram6 = new JFrame();
    private JFrame fram10 = new JFrame();
    private JButton b1, b2, b3, b4, b5, b6, back, back2;
    public static String bln;

    public void userfunction() {
        fram6.setTitle("User");
        fram6.setLayout(null);

        JLabel text1 = new JLabel("Welcome User");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(250, 25, 300, 40);
        fram6.add(text1);

        // create account button
        b1 = new JButton("View Account");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBounds(100, 100, 250, 50);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        fram6.add(b1);

        // View all account button
        b2 = new JButton("Transfer Money");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBounds(100, 200, 250, 50);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        fram6.add(b2);

        // view account button
        b3 = new JButton("Loan");
        b3.setFont(new Font("Raleway", Font.BOLD, 18));
        b3.setBounds(100, 300, 250, 50);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        fram6.add(b3);

        // update account button
        b4 = new JButton("View Account Balence");
        b4.setFont(new Font("Raleway", Font.BOLD, 18));
        b4.setBounds(400, 100, 250, 50);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        fram6.add(b4);

        // remove account button
        b5 = new JButton("Transection History");
        b5.setFont(new Font("Raleway", Font.BOLD, 18));
        b5.setBounds(400, 200, 250, 50);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        fram6.add(b5);

        // delete account button
        b6 = new JButton("Laon Stetement");
        b6.setFont(new Font("Raleway", Font.BOLD, 18));
        b6.setBounds(400, 300, 250, 50);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        fram6.add(b6);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(270, 380, 200, 50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram6.add(back);

        fram6.getContentPane().setBackground(Color.white);
        fram6.setSize(800, 480);
        fram6.setLocation(350, 200);
        fram6.setVisible(true);
    }

    public void UParticuler() {
        try {
            fram10.setTitle("View Particuler Account");
            fram10.setLayout(null);

            String acno = C_UserLogin.acnumber;
            // read dat
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "",
                    s12 = "";
            if (acno.matches("^[0-9]+$") || !acno.equals("")) {
                String q4 = "select * from account where Account_Number = " + acno;
                D_DatabaseConnection obj1 = new D_DatabaseConnection();
                ResultSet rest = obj1.s.executeQuery(q4);
                for (; rest.next();) {
                    s1 = rest.getString("First_Name") + " " + rest.getString("Last_Name");
                    s2 = rest.getString("Date_Of_Birth");
                    s3 = rest.getString("Mobile_Number");
                    s4 = rest.getString("Gender");
                    s5 = rest.getString("Father_Name");
                    s6 = rest.getString("Nominee_Name");
                    s7 = rest.getString("Address");
                    s8 = rest.getString("E_Mail");
                    s9 = rest.getString("Account_Type");
                    s10 = rest.getString("Branch_Name");
                    s11 = rest.getString("Aadhar_Number");
                    s12 = rest.getString("Pan_Number");
                    this.bln = rest.getString("Amount");
                }
                if (!s1.equals("")) {
                    // label 1 text
                    JLabel h = new JLabel("User Details");
                    h.setFont(new Font("Osward", Font.BOLD, 30));
                    h.setBounds(280, 10, 350, 50);
                    fram10.add(h);

                    // label 2 text
                    JLabel l1 = new JLabel("Name :");
                    l1.setFont(new Font("Osward", Font.BOLD, 17));
                    l1.setBounds(40, 80, 150, 30);
                    fram10.add(l1);
                    // label 2 text
                    JLabel t1 = new JLabel(s1);
                    t1.setFont(new Font("Osward", Font.PLAIN, 16));
                    t1.setBounds(190, 80, 150, 30);
                    fram10.add(t1);

                    // label 2 text
                    JLabel l2 = new JLabel("Date Of Birth :");
                    l2.setFont(new Font("Osward", Font.BOLD, 17));
                    l2.setBounds(380, 80, 150, 30);
                    fram10.add(l2);
                    // label 2 text
                    JLabel t2 = new JLabel(s2);
                    t2.setFont(new Font("Osward", Font.PLAIN, 16));
                    t2.setBounds(550, 80, 150, 30);
                    fram10.add(t2);

                    // label 4 text
                    JLabel l3 = new JLabel("Contact Number :");
                    l3.setFont(new Font("Osward", Font.BOLD, 17));
                    l3.setBounds(40, 120, 150, 30);
                    fram10.add(l3);
                    // label 4 text
                    JLabel t3 = new JLabel(s3);
                    t3.setFont(new Font("Osward", Font.PLAIN, 16));
                    t3.setBounds(190, 120, 150, 30);
                    fram10.add(t3);

                    // label 9 text
                    JLabel l4 = new JLabel("Gender :");
                    l4.setFont(new Font("Osward", Font.BOLD, 17));
                    l4.setBounds(380, 120, 80, 30);
                    fram10.add(l4);
                    // label 9 text
                    JLabel t4 = new JLabel(s4);
                    t4.setFont(new Font("Osward", Font.PLAIN, 16));
                    t4.setBounds(550, 120, 80, 30);
                    fram10.add(t4);

                    // label 3 text
                    JLabel l5 = new JLabel("Father's Name :");
                    l5.setFont(new Font("Osward", Font.BOLD, 17));
                    l5.setBounds(40, 160, 200, 30);
                    fram10.add(l5);
                    // label 3 text
                    JLabel t5 = new JLabel(s5);
                    t5.setFont(new Font("Osward", Font.PLAIN, 16));
                    t5.setBounds(190, 160, 200, 30);
                    fram10.add(t5);

                    // label 14 text
                    JLabel l6 = new JLabel("Nominee :");
                    l6.setFont(new Font("Osward", Font.BOLD, 17));
                    l6.setBounds(380, 160, 200, 30);
                    fram10.add(l6);
                    // label 14 text
                    JLabel t6 = new JLabel(s6);
                    t6.setFont(new Font("Osward", Font.PLAIN, 16));
                    t6.setBounds(550, 160, 200, 30);
                    fram10.add(t6);

                    // label 6 text
                    JLabel l7 = new JLabel("Address :");
                    l7.setFont(new Font("Osward", Font.BOLD, 17));
                    l7.setBounds(40, 200, 150, 30);
                    fram10.add(l7);
                    // label 6 text
                    JLabel t7 = new JLabel(s7);
                    t7.setFont(new Font("Osward", Font.PLAIN, 16));
                    t7.setBounds(190, 200, 300, 30);
                    fram10.add(t7);

                    // label 8 text
                    JLabel l8 = new JLabel("E-mail ID :");
                    l8.setFont(new Font("Osward", Font.BOLD, 17));
                    l8.setBounds(40, 240, 150, 30);
                    fram10.add(l8);
                    // label 8 text
                    JLabel t8 = new JLabel(s8);
                    t8.setFont(new Font("Osward", Font.PLAIN, 16));
                    t8.setBounds(190, 240, 300, 30);
                    fram10.add(t8);

                    // label 10 text
                    JLabel l9 = new JLabel("Account Type :");
                    l9.setFont(new Font("Osward", Font.BOLD, 17));
                    l9.setBounds(40, 280, 150, 30);
                    fram10.add(l9);
                    // label 10 text
                    JLabel t9 = new JLabel(s9);
                    t9.setFont(new Font("Osward", Font.PLAIN, 16));
                    t9.setBounds(190, 280, 150, 30);
                    fram10.add(t9);

                    // label 11 text
                    JLabel l10 = new JLabel("Branch :");
                    l10.setFont(new Font("Osward", Font.BOLD, 17));
                    l10.setBounds(380, 280, 150, 30);
                    fram10.add(l10);
                    // label 11 text
                    JLabel t10 = new JLabel(s10);
                    t10.setFont(new Font("Osward", Font.PLAIN, 16));
                    t10.setBounds(550, 280, 150, 30);
                    fram10.add(t10);

                    // label 12 text
                    JLabel l11 = new JLabel("Aadhar Number :");
                    l11.setFont(new Font("Osward", Font.BOLD, 17));
                    l11.setBounds(40, 320, 150, 30);
                    fram10.add(l11);
                    // label 12 text
                    JLabel t11 = new JLabel(s11);
                    t11.setFont(new Font("Osward", Font.PLAIN, 16));
                    t11.setBounds(190, 320, 150, 30);
                    fram10.add(t11);

                    // label 13 text
                    JLabel l12 = new JLabel("Pancard Number :");
                    l12.setFont(new Font("Osward", Font.BOLD, 17));
                    l12.setBounds(380, 320, 150, 30);
                    fram10.add(l12);
                    // label 13 text
                    JLabel t12 = new JLabel(s12);
                    t12.setFont(new Font("Osward", Font.PLAIN, 16));
                    t12.setBounds(550, 320, 150, 30);
                    fram10.add(t12);

                    // clear button
                    back2 = new JButton("Back");
                    back2.setFont(new Font("Raleway", Font.BOLD, 18));
                    back2.setBounds(40, 400, 160, 30);
                    back2.setBackground(Color.black);
                    back2.setForeground(Color.white);
                    back2.addActionListener(this);
                    fram10.add(back2);

                    fram10.getContentPane().setBackground(Color.WHITE);
                    fram10.setSize(800, 480);
                    fram10.setLocation(350, 200);
                    fram10.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Record Not Found........");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invelid Account Number........");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthinq Want Wrong......");
        }
    }

    public void balance() {
        JOptionPane.showMessageDialog(null, "Account Balance : " + bln);
    }

    public void actionPerformed(ActionEvent action6) {
        C1_UserFunction v = new C1_UserFunction();
        if (action6.getSource() == b1) {
            fram6.setVisible(false);
            v.UParticuler();
        } else if (action6.getSource() == b2) {
            fram6.setVisible(false);
            Transection t = new Transection();
            t.transfer();
        } else if (action6.getSource() == b3) {
            fram6.setVisible(false);
        } else if (action6.getSource() == b4) {
            v.balance();
        } else if (action6.getSource() == b5) {
            fram6.setVisible(false);
        } else if (action6.getSource() == b6) {
            fram6.setVisible(false);
        } else if (action6.getSource() == back) {
            fram6.setVisible(false);
            A_Main obj = new A_Main();
            obj.main();
        } else if (action6.getSource() == back2) {
            fram10.setVisible(false);
            v.userfunction();
        }
    }

    public static void main(String[] args) {
        C1_UserFunction us = new C1_UserFunction();
        us.userfunction();
    }
}
