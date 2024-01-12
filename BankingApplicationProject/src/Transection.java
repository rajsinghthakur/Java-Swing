import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transection implements ActionListener {
    JFrame fram10 = new JFrame("Transection");
    private JButton login, clear, back;
    private JTextField ac, money;

    public void transfer() {
        fram10.setLayout(null);

        // 1 label text
        JLabel text1 = new JLabel("Transfer Money");
        text1.setFont(new Font("Osward", Font.BOLD, 36));
        text1.setBounds(250, 25, 400, 40);
        fram10.add(text1);

        // label 2 text
        JLabel text2 = new JLabel("Account Number :");
        text2.setFont(new Font("Osward", Font.BOLD, 20));
        text2.setBounds(110, 150, 200, 30);
        fram10.add(text2);

        // text field 1
        ac = new JTextField();
        ac.setFont(new Font("Osward", Font.PLAIN, 18));
        ac.setBounds(290, 150, 250, 30);
        fram10.add(ac);

        // label 3 text
        JLabel text3 = new JLabel("Transfer Money :");
        text3.setFont(new Font("Osward", Font.BOLD, 20));
        text3.setBounds(110, 200, 200, 30);
        fram10.add(text3);

        // text field 2
        money = new JTextField();
        money.setFont(new Font("Osward", Font.PLAIN, 18));
        money.setBounds(290, 200, 250, 30);
        fram10.add(money);

        // login button
        login = new JButton("Transfer");
        login.setFont(new Font("Raleway", Font.BOLD, 18));
        login.setBounds(290, 250, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        fram10.add(login);

        // clear button
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Raleway", Font.BOLD, 18));
        clear.setBounds(420, 250, 120, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        fram10.add(clear);

        // back button
        back = new JButton("BACK");
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBounds(290, 300, 250, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        fram10.add(back);

        fram10.getContentPane().setBackground(Color.white); // contener color
        fram10.setSize(800, 480); // set size
        fram10.setVisible(true); // visible
        fram10.setLocation(350, 200); // location

    }

    public void transectionhistory() {

    }

    public void actionPerformed(ActionEvent event10) {
        if (event10.getSource() == login) {
            D_DatabaseConnection obj = new D_DatabaseConnection();
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            try {

                String q4 = "select * from account where Account_Number = " + C_UserLogin.acnumber;
                ResultSet rest = obj.s.executeQuery(q4);
                int am = 0;
                while (rest.next()) {
                    am = rest.getInt("Amount");
                }

                String q5 = "select * from account where Account_Number = " + ac.getText();
                ResultSet rest2 = obj.s.executeQuery(q5);
                int am2 = 0;
                while (rest2.next()) {
                    am2 = rest2.getInt("Amount");
                }

                String q1 = "insert into transection values('date','transfer','recever', null ,amount,balance),('date','transfer','recever', null ,amount,balance)";
                // obj.s.executeUpdate(q1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (event10.getSource() == clear) {
            ac.setText(null);
            money.setText(null);
        } else if (event10.getSource() == back) {
            fram10.setVisible(false);
            C1_UserFunction o1 = new C1_UserFunction();
            o1.userfunction();
        }
    }

    public static void main(String[] args) {
        Transection obj = new Transection();
        obj.transfer();
    }
}

/*
 * public void actionPerformed(ActionEvent event10) {
 * try {
 * String q4 = "select * from account where Account_Number = " +
 * C_UserLogin.acnumber;
 * D_DatabaseConnection obj1 = new D_DatabaseConnection();
 * ResultSet rest = obj1.s.executeQuery(q4);
 * String am = "";
 * while (rest.next()) {
 * am = rest.getString("Amount");
 * }
 * 
 * LocalDate currentDate = LocalDate.now();
 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
 * 
 * String date = "" + currentDate.format(formatter);
 * String transfer = "" + C_UserLogin.acnumber;
 * String recever = "" + ac.getText();
 * String debit = "" + am;
 * String credit = "" + money.getText();
 * String balence = "" + am;
 * 
 * if (event10.getSource() == login) {
 * if (recever.equals("") || credit.equals("")) {
 * JOptionPane.showMessageDialog(null, "Plese fill the Information");
 * } else if (!recever.matches("^[0-9]+$") || recever.length() != 10 ||
 * recever.equals("")) {
 * JOptionPane.showMessageDialog(null, "Invalid Account Number");
 * } else if (!credit.matches("^[0-9.]+$")) {
 * JOptionPane.showMessageDialog(null, "Invalid Amount");
 * } else {
 * try {
 * D_DatabaseConnection obj = new D_DatabaseConnection();
 * String q1 = "insert into transection values('" + date + "','" + transfer +
 * "','" + recever
 * + "'," + null + "," + credit + "," + balence + "),('" + date + "','" +
 * recever + "','"
 * + transfer + "'," + debit + "," + null + "," + balence + ")";
 * 
 * obj.s.executeUpdate(q1);
 * JOptionPane.showMessageDialog(fram10, "Transfer Money Successfully", "Alert",
 * JOptionPane.WARNING_MESSAGE);
 * fram10.setVisible(false);
 * } catch (Exception e) {
 * JOptionPane.showMessageDialog(fram10, "Somthing Want Wrong", "Alert",
 * JOptionPane.ERROR_MESSAGE);
 * }
 * }
 * } else if (event10.getSource() == clear) {
 * ac.setText(null);
 * money.setText(null);
 * } else if (event10.getSource() == back) {
 * fram10.setVisible(false);
 * C1_UserFunction o1 = new C1_UserFunction();
 * o1.userfunction();
 * }
 * 
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * }
 */