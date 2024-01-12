import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.*;

public class B11_Account implements ActionListener {
    private JFrame fram5 = new JFrame();
    private JButton submit, clear, back;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    private JDateChooser dob;
    private JRadioButton male, female, other;
    private JComboBox account1, branch1;
    private String gender = "";

    public void createaccount() {
        try {
            fram5.setTitle("Create Account");
            fram5.setLayout(null);

            // label 1 text
            JLabel l1 = new JLabel("Application Form");
            l1.setFont(new Font("Osward", Font.BOLD, 30));
            l1.setBounds(250, 10, 350, 50);
            fram5.add(l1);

            // label 2 text
            JLabel l2 = new JLabel("First Name :");
            l2.setFont(new Font("Osward", Font.PLAIN, 17));
            l2.setBounds(40, 80, 150, 30);
            fram5.add(l2);
            // text field 1
            t1 = new JTextField();
            t1.setFont(new Font("Osward", Font.PLAIN, 16));
            t1.setBounds(190, 80, 160, 30);
            fram5.add(t1);

            // label 3 text
            JLabel l3 = new JLabel("Last Name :");
            l3.setFont(new Font("Osward", Font.PLAIN, 17));
            l3.setBounds(380, 80, 150, 30);
            fram5.add(l3);
            // text field 2
            t2 = new JTextField();
            t2.setFont(new Font("Osward", Font.PLAIN, 16));
            t2.setBounds(550, 80, 160, 30);
            fram5.add(t2);

            // label 4 text
            JLabel l4 = new JLabel("Father's Name :");
            l4.setFont(new Font("Osward", Font.PLAIN, 17));
            l4.setBounds(40, 120, 150, 30);
            fram5.add(l4);
            // text field 3
            t3 = new JTextField();
            t3.setFont(new Font("Osward", Font.PLAIN, 16));
            t3.setBounds(190, 120, 160, 30);
            fram5.add(t3);

            // label 5 text
            JLabel l5 = new JLabel("Contact Number :");
            l5.setFont(new Font("Osward", Font.PLAIN, 17));
            l5.setBounds(380, 120, 150, 30);
            fram5.add(l5);
            // text field 4
            t4 = new JTextField();
            t4.setFont(new Font("Osward", Font.PLAIN, 16));
            t4.setBounds(550, 120, 160, 30);
            fram5.add(t4);

            // label 6 text
            JLabel l6 = new JLabel("Address :");
            l6.setFont(new Font("Osward", Font.PLAIN, 17));
            l6.setBounds(40, 160, 150, 30);
            fram5.add(l6);
            // text field 5
            t5 = new JTextField();
            t5.setFont(new Font("Osward", Font.PLAIN, 16));
            t5.setBounds(190, 160, 520, 30);
            fram5.add(t5);

            // label 7 text
            JLabel l7 = new JLabel("Date Of Birth :");
            l7.setFont(new Font("Osward", Font.PLAIN, 17));
            l7.setBounds(40, 200, 150, 30);
            fram5.add(l7);
            // clender
            dob = new JDateChooser();
            dob.setDateFormatString("dd-MM-yyyy");
            dob.setFont(new Font("Osward", Font.PLAIN, 16));
            dob.setBounds(190, 200, 160, 30);
            fram5.add(dob);

            // label 9 text
            JLabel l9 = new JLabel("Gender :");
            l9.setFont(new Font("Osward", Font.PLAIN, 17));
            l9.setBounds(380, 200, 80, 30);
            fram5.add(l9);
            // radio button
            // male
            male = new JRadioButton("Male");
            male.setFont(new Font("Osward", Font.PLAIN, 17));
            male.setBounds(480, 200, 70, 30);
            male.setBackground(Color.WHITE);
            male.addActionListener(this);
            fram5.add(male);
            // female
            female = new JRadioButton("Female");
            female.setFont(new Font("Osward", Font.PLAIN, 17));
            female.setBounds(555, 200, 80, 30);
            female.setBackground(Color.WHITE);
            female.addActionListener(this);
            fram5.add(female);
            // other
            other = new JRadioButton("Other");
            other.setFont(new Font("Osward", Font.PLAIN, 17));
            other.setBounds(640, 200, 70, 30);
            other.setBackground(Color.WHITE);
            other.addActionListener(this);
            fram5.add(other);
            // radio button group
            ButtonGroup gender = new ButtonGroup();
            gender.add(male);
            gender.add(female);
            gender.add(other);

            // label 8 text
            JLabel l8 = new JLabel("E-mail ID :");
            l8.setFont(new Font("Osward", Font.PLAIN, 17));
            l8.setBounds(40, 240, 150, 30);
            fram5.add(l8);
            // text field 7
            t6 = new JTextField();
            t6.setFont(new Font("Osward", Font.PLAIN, 16));
            t6.setBounds(190, 240, 520, 30);
            fram5.add(t6);

            // label 10 text
            JLabel l10 = new JLabel("Account Type :");
            l10.setFont(new Font("Osward", Font.PLAIN, 17));
            l10.setBounds(40, 280, 150, 30);
            fram5.add(l10);
            // account type
            String ac_type[] = { "Current", "Saving" };
            account1 = new JComboBox(ac_type);
            account1.setFont(new Font("Osward", Font.PLAIN, 16));
            account1.setBounds(190, 280, 160, 30);
            account1.setBackground(Color.WHITE);
            fram5.add(account1);

            // label 11 text
            JLabel l11 = new JLabel("Branch :");
            l11.setFont(new Font("Osward", Font.PLAIN, 17));
            l11.setBounds(380, 280, 150, 30);
            fram5.add(l11);
            // branch
            String ac_branch[] = { "Indore", "Bhopal", "Sagar", "Ujjain", "Devas", "Khandwa" };
            branch1 = new JComboBox(ac_branch);
            branch1.setFont(new Font("Osward", Font.PLAIN, 16));
            branch1.setBounds(550, 280, 160, 30);
            branch1.setBackground(Color.WHITE);
            fram5.add(branch1);

            // label 12 text
            JLabel l12 = new JLabel("Aadhar Number :");
            l12.setFont(new Font("Osward", Font.PLAIN, 17));
            l12.setBounds(40, 320, 150, 30);
            fram5.add(l12);
            // text field 11
            t7 = new JTextField();
            t7.setFont(new Font("Osward", Font.PLAIN, 16));
            t7.setBounds(190, 320, 160, 30);
            fram5.add(t7);

            // label 13 text
            JLabel l13 = new JLabel("Pancard Number :");
            l13.setFont(new Font("Osward", Font.PLAIN, 17));
            l13.setBounds(380, 320, 150, 30);
            fram5.add(l13);
            // text field 12
            t8 = new JTextField();
            t8.setFont(new Font("Osward", Font.PLAIN, 16));
            t8.setBounds(550, 320, 160, 30);
            fram5.add(t8);

            // label 15 text
            JLabel l15 = new JLabel("Amount :");
            l15.setFont(new Font("Osward", Font.PLAIN, 17));
            l15.setBounds(40, 360, 150, 30);
            fram5.add(l15);
            // text field 14
            t10 = new JTextField();
            t10.setFont(new Font("Osward", Font.PLAIN, 16));
            t10.setBounds(190, 360, 160, 30);
            fram5.add(t10);

            // label 14 text
            JLabel l14 = new JLabel("Nominee :");
            l14.setFont(new Font("Osward", Font.PLAIN, 17));
            l14.setBounds(380, 360, 150, 30);
            fram5.add(l14);
            // text field 13
            t9 = new JTextField();
            t9.setFont(new Font("Osward", Font.PLAIN, 16));
            t9.setBounds(550, 360, 160, 30);
            fram5.add(t9);

            // create button
            submit = new JButton("Submit");
            submit.setFont(new Font("Raleway", Font.BOLD, 18));
            submit.setBounds(550, 400, 160, 30);
            submit.setBackground(Color.black);
            submit.setForeground(Color.white);
            submit.addActionListener(this);
            fram5.add(submit);

            // clear button
            clear = new JButton("Clear");
            clear.setFont(new Font("Raleway", Font.BOLD, 18));
            clear.setBounds(300, 400, 160, 30);
            clear.setBackground(Color.black);
            clear.setForeground(Color.white);
            clear.addActionListener(this);
            fram5.add(clear);

            // clear button
            back = new JButton("Back");
            back.setFont(new Font("Raleway", Font.BOLD, 18));
            back.setBounds(40, 400, 160, 30);
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.addActionListener(this);
            fram5.add(back);

            fram5.getContentPane().setBackground(Color.WHITE);
            fram5.setSize(800, 480);
            fram5.setLocation(350, 200);
            fram5.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent action5) {
        try {
            String fname = t1.getText();
            String lname = t2.getText();
            String father = t3.getText();
            String mobile = t4.getText();
            String address = t5.getText();
            String date = ((JTextField) dob.getDateEditor().getUiComponent()).getText();
            String g = "";
            if (action5.getSource() == male) {
                g = "Male";
                gender = g;
            } else if (action5.getSource() == female) {
                g = "Female";
                gender = g;
            } else if (action5.getSource() == other) {
                g = "Other";
                gender = g;
            }
            String email = t6.getText();
            String account = "" + account1.getSelectedItem();
            String branch = "" + branch1.getSelectedItem();
            String aadhar = t7.getText();
            String pan = t8.getText();
            String amount = t10.getText();
            String nominee = t9.getText();
            int rand = (int) (Math.random() * (999 - 100 + 1) + 100);
            String password = fname + "@" + rand;
            if (action5.getSource() == submit) {
                int am = Integer.parseInt(amount);
                if (!fname.matches("^[a-zA-Z]+$") || !(fname.length() >= 2) || !(fname.length() <= 20)) {
                    JOptionPane.showMessageDialog(null, "Invalid First Name");
                } else if (!lname.matches("^[a-zA-Z]+$") || !(lname.length() >= 2) || !(lname.length() <= 20)) {
                    JOptionPane.showMessageDialog(null, "Invalid last Name");
                } else if (!father.matches("^[a-z A-Z.]+$") || !(father.length() >= 2) || !(father.length() <= 50)) {
                    JOptionPane.showMessageDialog(null, "Invalid Father Name");
                } else if (!mobile.matches("^[0-9]+$") || !(mobile.length() == 10)) {
                    JOptionPane.showMessageDialog(null, "Invalid Mobile Number");
                } else if (!address.matches("^[1-9a-zA-Z().-_/ ]+$") || !(address.length() >= 4)) {
                    JOptionPane.showMessageDialog(null, "Invalid Address");
                } else if (!date.matches("^[0-9-]+$") || !(date.length() == 10)) {
                    JOptionPane.showMessageDialog(null, "Invalid Date Of Birth");
                } else if (!email.matches("^[a-zA-Z0-9@.]+$") || !(email.length() >= 13) || !(email.length() <= 30)) {
                    JOptionPane.showMessageDialog(null, "Invalid E-Mail");
                } else if (!aadhar.matches("^[0-9]+$") || !(aadhar.length() == 12)) {
                    JOptionPane.showMessageDialog(null, "Invalid Aadhar Number");
                } else if (!pan.matches("^[0-9A-Z]+$") || !(pan.length() == 10)) {
                    JOptionPane.showMessageDialog(null, "Invalid Pan Number");
                } else if (!amount.matches("^[0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "Invalid Amount");
                } else if ((!account.equals("Current") && !(am >= 500))) {
                    JOptionPane.showMessageDialog(null, "Plese Enter atlast 1000 Rs");
                } else if ((!account.equals("Saving") && !(am >= 1000))) {
                    JOptionPane.showMessageDialog(null, "Plese Enter atlast 500 Rs");
                } else if (!nominee.matches("^[a-z A-Z.]+$") || !(nominee.length() >= 2) || !(nominee.length() <= 50)) {
                    JOptionPane.showMessageDialog(null, "Invalid Nominee Name");
                } else {
                    try {
                        D_DatabaseConnection obj = new D_DatabaseConnection();
                        String q1 = "insert into account values (null,'" + fname + "','" + lname + "','" + father
                                + "','"
                                + mobile + "','" + address + "','" + gender + "','" + email + "','" + aadhar + "','"
                                + pan
                                + "','" + account + "','" + branch + "'," + amount + ",'" + nominee + "','" + password
                                + "','"
                                + date + "',default)";
                        obj.s.executeUpdate(q1);
                        JOptionPane.showMessageDialog(fram5, "Account Created Successfully", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                        fram5.setVisible(false);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(fram5, "Plesew Fill the Form", "Alert",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
            } else if (action5.getSource() == clear) {
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
                t6.setText(null);
                t7.setText(null);
                t8.setText(null);
                t9.setText(null);
                t10.setText(null);
                dob.setDate(null);
            } else if (action5.getSource() == back) {
                fram5.setVisible(false);
            }

        } catch (Exception e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(fram5, "Somthing Want Wrong", "Alert", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void main(String[] args) {
        B11_Account ac = new B11_Account();
        ac.createaccount();
    }

}
