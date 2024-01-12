import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Loan implements ActionListener {
    public void applyloan() {
        JFrame fram12 = new JFrame();
        fram12.setTitle("BANKING_APPLICATION");
        fram12.setLayout(null);

        JLabel l1 = new JLabel("Applay For Loan");
        l1.setFont(new Font("Osward", Font.BOLD, 36));
        l1.setBounds(200, 25, 400, 40);
        fram12.add(l1);

        fram12.setSize(800, 480);
        fram12.setLocation(350, 200);
        fram12.setVisible(true);
        fram12.dispose();
    }

    public void loanstatement() {

    }

    public void actionPerformed(ActionEvent action12) {

    }
    // public static void main(String[] args) {
    // Loan obj = new Loan();
    // obj.applyloan();
    // }
}