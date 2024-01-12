import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;

public class Updatedata implements ActionListener {
    private JFrame fram9 = new JFrame("Update Data");
    private JButton submit, clear, back;
    private JTextField t1, t2, t3, t4, t5, t6, t9, dob;
    public String acno = "", gender = "";
    private D_DatabaseConnection obj1 = null;

    public void update() {
        try {
            fram9.setLayout(null);

            acno = JOptionPane.showInputDialog(fram9, "Enter Account Number");
            // read dat
            String s = "", s1 = "", s2 = "", s3 = "", s5 = "", s6 = "", s7 = "", s8 = "";
            if (acno.matches("^[0-9]+$")) {
                String q4 = "select * from account where active = 1 AND Account_Number = " + acno;
                obj1 = new D_DatabaseConnection();
                ResultSet rest = obj1.s.executeQuery(q4);
                for (; rest.next();) {
                    s = rest.getString("First_Name");
                    s1 = rest.getString("Last_Name");
                    s2 = rest.getString("Date_Of_Birth");
                    s3 = rest.getString("Mobile_Number");
                    s5 = rest.getString("Father_Name");
                    s6 = rest.getString("Nominee_Name");
                    s7 = rest.getString("Address");
                    s8 = rest.getString("E_Mail");
                }
                if (!s.equals("")) {
                    // label 1 text
                    JLabel l1 = new JLabel("Update Form");
                    l1.setFont(new Font("Osward", Font.BOLD, 30));
                    l1.setBounds(250, 10, 350, 50);
                    fram9.add(l1);

                    // label 2 text
                    JLabel l2 = new JLabel("First Name :");
                    l2.setFont(new Font("Osward", Font.PLAIN, 17));
                    l2.setBounds(40, 80, 150, 30);
                    fram9.add(l2);
                    // text field 1
                    t1 = new JTextField(s);
                    t1.setFont(new Font("Osward", Font.PLAIN, 16));
                    t1.setBounds(190, 80, 160, 30);
                    fram9.add(t1);

                    // label 3 text
                    JLabel l3 = new JLabel("Last Name :");
                    l3.setFont(new Font("Osward", Font.PLAIN, 17));
                    l3.setBounds(380, 80, 150, 30);
                    fram9.add(l3);
                    // text field 2
                    t2 = new JTextField(s1);
                    t2.setFont(new Font("Osward", Font.PLAIN, 16));
                    t2.setBounds(550, 80, 160, 30);
                    fram9.add(t2);

                    // label 4 text
                    JLabel l4 = new JLabel("Father's Name :");
                    l4.setFont(new Font("Osward", Font.PLAIN, 17));
                    l4.setBounds(40, 120, 150, 30);
                    fram9.add(l4);
                    // text field 3
                    t3 = new JTextField(s5);
                    t3.setFont(new Font("Osward", Font.PLAIN, 16));
                    t3.setBounds(190, 120, 160, 30);
                    fram9.add(t3);

                    // label 5 text
                    JLabel l5 = new JLabel("Contact Number :");
                    l5.setFont(new Font("Osward", Font.PLAIN, 17));
                    l5.setBounds(380, 120, 150, 30);
                    fram9.add(l5);
                    // text field 4
                    t4 = new JTextField(s3);
                    t4.setFont(new Font("Osward", Font.PLAIN, 16));
                    t4.setBounds(550, 120, 160, 30);
                    fram9.add(t4);

                    // label 6 text
                    JLabel l6 = new JLabel("Address :");
                    l6.setFont(new Font("Osward", Font.PLAIN, 17));
                    l6.setBounds(40, 160, 150, 30);
                    fram9.add(l6);
                    // text field 5
                    t5 = new JTextField(s7);
                    t5.setFont(new Font("Osward", Font.PLAIN, 16));
                    t5.setBounds(190, 160, 520, 30);
                    fram9.add(t5);

                    // label 7 text
                    JLabel l7 = new JLabel("Date Of Birth :");
                    l7.setFont(new Font("Osward", Font.PLAIN, 17));
                    l7.setBounds(40, 200, 150, 30);
                    fram9.add(l7);
                    // clender
                    dob = new JTextField(s2);
                    dob.setFont(new Font("Osward", Font.PLAIN, 16));
                    dob.setBounds(190, 200, 160, 30);
                    fram9.add(dob);

                    // label 14 text
                    JLabel l14 = new JLabel("Nominee :");
                    l14.setFont(new Font("Osward", Font.PLAIN, 17));
                    l14.setBounds(380, 200, 150, 30);
                    fram9.add(l14);
                    // text field 13
                    t9 = new JTextField(s6);
                    t9.setFont(new Font("Osward", Font.PLAIN, 16));
                    t9.setBounds(550, 200, 160, 30);
                    fram9.add(t9);

                    // label 8 text
                    JLabel l8 = new JLabel("E-mail ID :");
                    l8.setFont(new Font("Osward", Font.PLAIN, 17));
                    l8.setBounds(40, 240, 150, 30);
                    fram9.add(l8);
                    // text field 7
                    t6 = new JTextField(s8);
                    t6.setFont(new Font("Osward", Font.PLAIN, 16));
                    t6.setBounds(190, 240, 520, 30);
                    fram9.add(t6);

                    // create button
                    submit = new JButton("Submit");
                    submit.setFont(new Font("Raleway", Font.BOLD, 18));
                    submit.setBounds(550, 400, 160, 30);
                    submit.setBackground(Color.black);
                    submit.setForeground(Color.white);
                    submit.addActionListener(this);
                    fram9.add(submit);

                    // clear button
                    clear = new JButton("Clear");
                    clear.setFont(new Font("Raleway", Font.BOLD, 18));
                    clear.setBounds(300, 400, 160, 30);
                    clear.setBackground(Color.black);
                    clear.setForeground(Color.white);
                    clear.addActionListener(this);
                    fram9.add(clear);

                    // clear button
                    back = new JButton("Back");
                    back.setFont(new Font("Raleway", Font.BOLD, 18));
                    back.setBounds(40, 400, 160, 30);
                    back.setBackground(Color.black);
                    back.setForeground(Color.white);
                    back.addActionListener(this);
                    fram9.add(back);

                    fram9.getContentPane().setBackground(Color.WHITE);
                    fram9.setSize(800, 480);
                    fram9.setLocation(350, 200);
                    fram9.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Not Found........");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invelid Account Number........");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthing Want Wrong........");
        }
    }

    public void Block() {
        try {
            D_DatabaseConnection o = new D_DatabaseConnection();
            String acno = JOptionPane.showInputDialog(fram9, "Enter Account Number");
            if (!acno.matches("^[0-9]+$") || acno.equals("")) {
                JOptionPane.showMessageDialog(null, "Invelid Account Number");
            } else {
                String q3 = "update account set active = false where account_Number = " + acno;
                o.s.executeUpdate(q3);
                JOptionPane.showMessageDialog(null, acno + " Account Blocked Successfuly");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthibg Want Wrong");
        }
    }

    public void Unblock() {
        try {
            D_DatabaseConnection o1 = new D_DatabaseConnection();
            String acno2 = JOptionPane.showInputDialog(fram9, "Enter Account Number");
            if (!acno2.matches("^[0-9]+$") || acno2.equals("")) {
                JOptionPane.showMessageDialog(null, "Invelid Account Number");
            } else {
                String q2 = "update account set active = true where account_Number = " + acno2;
                o1.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, acno2 + " Account Unblocked Successfuly");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthibg Want Wrong");
        }
    }

    public void Delete() {
        try {
            D_DatabaseConnection o2 = new D_DatabaseConnection();
            String acno1 = JOptionPane.showInputDialog(fram9, "Enter Account Number");
            if (!acno1.matches("^[0-9]+$") || acno1.equals("")) {
                JOptionPane.showMessageDialog(null, "Invelid Account Number");
            } else {
                String q4 = "delete from account where account_Number = " + acno1;
                o2.s.executeUpdate(q4);
                JOptionPane.showMessageDialog(null, acno1 + " Account Deleted Successfuly");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthibg Want Wrong");
        }
    }

    public void actionPerformed(ActionEvent action9) {
        try {
            if (action9.getSource() == submit) {
                String fname = t1.getText();
                String lname = t2.getText();
                String father = t3.getText();
                String mobile = t4.getText();
                String add = t5.getText();
                String date = dob.getText();
                String nominee = t9.getText();
                String email = t6.getText();
                if (!fname.matches("^[a-zA-Z]+$") || !(fname.length() >= 2) || !(fname.length() <= 20)
                        || fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid First Name");
                } else if (!lname.matches("^[a-zA-Z]+$") || !(lname.length() >= 2) || !(lname.length() <= 20)
                        || fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Last Name");
                } else if (!father.matches("^[a-z A-Z]+$") || !(father.length() >= 2) || !(father.length() <= 50)
                        || fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Father Name");
                } else if (!mobile.matches("^[0-9]+$") || !(mobile.length() == 10) || mobile.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Mobile Number");
                } else if (!add.matches("^[a-z,()0-9A-Z -.]+$") || !(add.length() <= 50) || add.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Address");
                } else if (!date.matches("^[0-9-]+$") || !(date.length() == 10) || date.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Date Of Birth");
                } else if (!email.matches("^[a-zA-Z0-9@.]+$") || !(email.length() >= 12) || !(email.length() <= 50)
                        || email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Email");
                } else if (!nominee.matches("^[a-z A-Z]+$") || !(father.length() >= 2) || !(father.length() <= 50)
                        || nominee.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invelid Nominee Name");
                } else {
                    String q = "update account set First_Name = '" + fname + "', Last_Name = '" + lname
                            + "', Father_Name = '" + father + "', Mobile_Number = '" + mobile + "', address = '" + add
                            + "', E_Mail = '" + email + "', nominee_name = '" + nominee + "', Date_Of_Birth = '" + date
                            + "' where Account_Number = " + acno + "";
                    obj1.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Account Updated Successfuly");
                    fram9.setVisible(false);
                }

            } else if (action9.getSource() == clear) {
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
                t6.setText(null);
                t9.setText(null);
            } else if (action9.getSource() == back) {
                fram9.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somthing Want Wrong........");
        }
    }

    public static void main(String[] args) {
        Updatedata up = new Updatedata();
        up.update();
    }
}
