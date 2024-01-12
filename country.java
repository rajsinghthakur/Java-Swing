import javax.swing.*;

class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
        f = new JFrame("ComboBox Example");
        String state[] = { "Indore", "Bhopal", "Devas", "Ujjain", "Sagar" };
        JComboBox cb = new JComboBox(state);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}