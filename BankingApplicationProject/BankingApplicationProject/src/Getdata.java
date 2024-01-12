import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Getdata implements ActionListener {
    private JFrame fram7 = new JFrame("Users Data");
    public int count = 0;
    private JButton back;

    public void read() {
        try {
            // back button
            back = new JButton("BACK");
            back.setFont(new Font("Raleway", Font.BOLD, 20));
            back.setBounds(10, 725, 100, 40);
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            back.addActionListener(this);
            fram7.add(back);

            // read dat
            String q4 = "select * from account where active = 1";
            D_DatabaseConnection obj1 = new D_DatabaseConnection();
            ResultSet rest = obj1.s.executeQuery(q4);
            String data[][] = new String[10][13];
            for (int i = 0; rest.next(); i++) {
                data[i][0] = "" + rest.getInt("Account_Number");
                data[i][1] = rest.getString("First_Name") + " " + rest.getString("Last_Name");
                data[i][2] = rest.getString("Father_Name");
                data[i][3] = rest.getString("Mobile_Number");
                data[i][4] = rest.getString("Date_Of_Birth");
                data[i][5] = rest.getString("Address");
                data[i][6] = rest.getString("Gender");
                data[i][7] = rest.getString("E_Mail");
                data[i][8] = rest.getString("Aadhar_Number");
                data[i][9] = rest.getString("Pan_Number");
                data[i][10] = rest.getString("Account_Type");
                data[i][11] = rest.getString("Branch_Name");
                data[i][12] = rest.getString("Nominee_Name");
            }
            String column[] = { "Account_No", "Holder_Name", "Father_Name", "Date_Of_Birth", "Mobile_No", "Address",
                    "Gender", "E_Mail", "Aadhar_Number", "Pan_Number", "Account_Type", "Branch_Name",
                    "Nominee_Name" };

            JTable jt = new JTable(data, column);
            JScrollPane sp = new JScrollPane(jt);
            fram7.add(sp);

            fram7.getContentPane().setBackground(Color.white);
            fram7.setSize(1520, 810);
            fram7.setLocation(10, 10);
            fram7.setVisible(true);
        } catch (

        Exception e) {
            JOptionPane.showMessageDialog(null, "array size full");
        }
    }

    public void actionPerformed(ActionEvent e) {
        fram7.setVisible(false);
    }

    public static void main(String[] args) {
        Getdata obj = new Getdata();
        obj.read();
    }
}
