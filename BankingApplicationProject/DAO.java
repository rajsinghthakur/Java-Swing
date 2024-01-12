import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DAO {
    JFrame f = new JFrame();

    public DAO(String fname, String lname, String father, String mobile, String address, String date, String gender,
            String email, String account, String branch, String aadhar, String pan, String amount, String nominee,
            String password) {
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
                String q1 = "insert into account values (null,'" + fname + "','" + lname + "','" + father + "','"
                        + mobile + "','" + address + "','" + gender + "','" + email + "','" + aadhar + "','" + pan
                        + "','" + account + "','" + branch + "'," + amount + ",'" + nominee + "','" + password + "','"
                        + date + "',default)";
                obj.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(f, "Account Created Successfully", "Alert", JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(f, "Somthing Want Wrong", "Alert", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    DAO() {
    }
}
