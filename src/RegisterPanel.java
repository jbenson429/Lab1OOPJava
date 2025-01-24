import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterPanel extends JPanel {
    private final Register register = new Register();
    private final JTextField inputField = new JTextField(10);
    private final PursePanel changePanel = new PursePanel();

    public RegisterPanel() {
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Amount: "));
        inputPanel.add(inputField);
        JButton calculateButton = new JButton("Calculate");
        inputPanel.add(calculateButton);
        add(inputPanel, BorderLayout.NORTH);

        // Change Panel
        add(changePanel, BorderLayout.CENTER);

        // Input Listener
        calculateButton.addActionListener(new InputListener());
    }

    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(inputField.getText());
                Purse purse = register.makeChange(amount);
                changePanel.updatePurse(purse);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(RegisterPanel.this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
