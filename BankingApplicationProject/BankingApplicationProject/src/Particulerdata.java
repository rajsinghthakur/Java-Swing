import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;

public class Particulerdata implements ActionListener {
    private JFrame fram8 = new JFrame();
    private JButton back;

    public void Particuler() {
        try {
            fram8.setTitle("View Particuler Account");
            fram8.setLayout(null);

            String acno = JOptionPane.showInputDialog(fram8, "Enter Account Number");
            // read dat
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "",
                    s12 = "";
            if (acno.matches("^[0-9]+$")) {
                String q4 = "select * from account where active = 1 AND Account_Number = " + acno;
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
                }
                if (!s1.equals("")) {
                    // label 1 text
                    JLabel h = new JLabel("User Details");
                    h.setFont(new Font("Osward", Font.BOLD, 30));
                    h.setBounds(280, 10, 350, 50);
                    fram8.add(h);

                    // label 2 text
                    JLabel l1 = new JLabel("Name :");
                    l1.setFont(new Font("Osward", Font.BOLD, 17));
                    l1.setBounds(40, 80, 150, 30);
                    fram8.add(l1);
                    // label 2 text
                    JLabel t1 = new JLabel(s1);
                    t1.setFont(new Font("Osward", Font.PLAIN, 16));
                    t1.setBounds(190, 80, 150, 30);
                    fram8.add(t1);

                    // label 2 text
                    JLabel l2 = new JLabel("Date Of Birth :");
                    l2.setFont(new Font("Osward", Font.BOLD, 17));
                    l2.setBounds(380, 80, 150, 30);
                    fram8.add(l2);
                    // label 2 text
                    JLabel t2 = new JLabel(s2);
                    t2.setFont(new Font("Osward", Font.PLAIN, 16));
                    t2.setBounds(550, 80, 150, 30);
                    fram8.add(t2);

                    // label 4 text
                    JLabel l3 = new JLabel("Contact Number :");
                    l3.setFont(new Font("Osward", Font.BOLD, 17));
                    l3.setBounds(40, 120, 150, 30);
                    fram8.add(l3);
                    // label 4 text
                    JLabel t3 = new JLabel(s3);
                    t3.setFont(new Font("Osward", Font.PLAIN, 16));
                    t3.setBounds(190, 120, 150, 30);
                    fram8.add(t3);

                    // label 9 text
                    JLabel l4 = new JLabel("Gender :");
                    l4.setFont(new Font("Osward", Font.BOLD, 17));
                    l4.setBounds(380, 120, 80, 30);
                    fram8.add(l4);
                    // label 9 text
                    JLabel t4 = new JLabel(s4);
                    t4.setFont(new Font("Osward", Font.PLAIN, 16));
                    t4.setBounds(550, 120, 80, 30);
                    fram8.add(t4);

                    // label 3 text
                    JLabel l5 = new JLabel("Father's Name :");
                    l5.setFont(new Font("Osward", Font.BOLD, 17));
                    l5.setBounds(40, 160, 200, 30);
                    fram8.add(l5);
                    // label 3 text
                    JLabel t5 = new JLabel(s5);
                    t5.setFont(new Font("Osward", Font.PLAIN, 16));
                    t5.setBounds(190, 160, 200, 30);
                    fram8.add(t5);

                    // label 14 text
                    JLabel l6 = new JLabel("Nominee :");
                    l6.setFont(new Font("Osward", Font.BOLD, 17));
                    l6.setBounds(380, 160, 200, 30);
                    fram8.add(l6);
                    // label 14 text
                    JLabel t6 = new JLabel(s6);
                    t6.setFont(new Font("Osward", Font.PLAIN, 16));
                    t6.setBounds(550, 160, 200, 30);
                    fram8.add(t6);

                    // label 6 text
                    JLabel l7 = new JLabel("Address :");
                    l7.setFont(new Font("Osward", Font.BOLD, 17));
                    l7.setBounds(40, 200, 150, 30);
                    fram8.add(l7);
                    // label 6 text
                    JLabel t7 = new JLabel(s7);
                    t7.setFont(new Font("Osward", Font.PLAIN, 16));
                    t7.setBounds(190, 200, 300, 30);
                    fram8.add(t7);

                    // label 8 text
                    JLabel l8 = new JLabel("E-mail ID :");
                    l8.setFont(new Font("Osward", Font.BOLD, 17));
                    l8.setBounds(40, 240, 150, 30);
                    fram8.add(l8);
                    // label 8 text
                    JLabel t8 = new JLabel(s8);
                    t8.setFont(new Font("Osward", Font.PLAIN, 16));
                    t8.setBounds(190, 240, 300, 30);
                    fram8.add(t8);

                    // label 10 text
                    JLabel l9 = new JLabel("Account Type :");
                    l9.setFont(new Font("Osward", Font.BOLD, 17));
                    l9.setBounds(40, 280, 150, 30);
                    fram8.add(l9);
                    // label 10 text
                    JLabel t9 = new JLabel(s9);
                    t9.setFont(new Font("Osward", Font.PLAIN, 16));
                    t9.setBounds(190, 280, 150, 30);
                    fram8.add(t9);

                    // label 11 text
                    JLabel l10 = new JLabel("Branch :");
                    l10.setFont(new Font("Osward", Font.BOLD, 17));
                    l10.setBounds(380, 280, 150, 30);
                    fram8.add(l10);
                    // label 11 text
                    JLabel t10 = new JLabel(s10);
                    t10.setFont(new Font("Osward", Font.PLAIN, 16));
                    t10.setBounds(550, 280, 150, 30);
                    fram8.add(t10);

                    // label 12 text
                    JLabel l11 = new JLabel("Aadhar Number :");
                    l11.setFont(new Font("Osward", Font.BOLD, 17));
                    l11.setBounds(40, 320, 150, 30);
                    fram8.add(l11);
                    // label 12 text
                    JLabel t11 = new JLabel(s11);
                    t11.setFont(new Font("Osward", Font.PLAIN, 16));
                    t11.setBounds(190, 320, 150, 30);
                    fram8.add(t11);

                    // label 13 text
                    JLabel l12 = new JLabel("Pancard Number :");
                    l12.setFont(new Font("Osward", Font.BOLD, 17));
                    l12.setBounds(380, 320, 150, 30);
                    fram8.add(l12);
                    // label 13 text
                    JLabel t12 = new JLabel(s12);
                    t12.setFont(new Font("Osward", Font.PLAIN, 16));
                    t12.setBounds(550, 320, 150, 30);
                    fram8.add(t12);

                    // clear button
                    back = new JButton("Back");
                    back.setFont(new Font("Raleway", Font.BOLD, 18));
                    back.setBounds(40, 400, 160, 30);
                    back.setBackground(Color.black);
                    back.setForeground(Color.white);
                    back.addActionListener(this);
                    fram8.add(back);

                    fram8.getContentPane().setBackground(Color.WHITE);
                    fram8.setSize(800, 480);
                    fram8.setLocation(350, 200);
                    fram8.setVisible(true);
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

    public void actionPerformed(ActionEvent action8) {
        fram8.setVisible(false);
    }

    public static void main(String[] args) {
        Particulerdata obj = new Particulerdata();
        obj.Particuler();
    }
}
