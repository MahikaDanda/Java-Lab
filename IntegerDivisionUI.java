import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionUI extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public IntegerDivisionUI() {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField();
        add(num1Label);
        add(num1Field);

        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField();
        add(num2Label);
        add(num2Field);

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new DivideButtonListener());
        add(divideButton);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultLabel);
        add(resultField);
    }

    private class DivideButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }

                int result = num1 / num2;
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(IntegerDivisionUI.this, "Please enter valid integers for Num1 and Num2.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(IntegerDivisionUI.this, "Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                IntegerDivisionUI divisionUI = new IntegerDivisionUI();
                divisionUI.setVisible(true);
            }
        });
    }
}

