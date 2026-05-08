import javax.swing.*;
import java.awt.*;

public class Calculator {
    JPanel windowContent;
    JFormattedTextField displayField;

    JButton[] numButtons = new JButton[10];

    JButton buttonPoint, buttonEqual;
    JPanel p1;

    JButton buttonPlus, buttonMinus, buttonDivide, buttonMultiply;
    JPanel p2;

    Calculator() {
        windowContent = new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayField = new JFormattedTextField();
        displayField.setColumns(30);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);

        windowContent.add("North", displayField);

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
        }

        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        for (JButton btn : numButtons) {
            btn.setBackground(Color.BLUE);
            btn.setForeground(Color.WHITE);
            btn.setOpaque(true);
            btn.setFocusPainted(false);
        }

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        p1.add(numButtons[7]);
        p1.add(numButtons[8]);
        p1.add(numButtons[9]);
        p1.add(numButtons[4]);
        p1.add(numButtons[5]);
        p1.add(numButtons[6]);
        p1.add(numButtons[1]);
        p1.add(numButtons[2]);
        p1.add(numButtons[3]);
        p1.add(numButtons[0]);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        windowContent.add("Center", p1);

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");

        JButton[] opButtons = {buttonPlus, buttonMinus, buttonDivide, buttonMultiply};
        for (JButton x : opButtons) {
            x.setBackground(Color.MAGENTA);
            x.setForeground(Color.WHITE);
            x.setOpaque(true);
            x.setFocusPainted(false);
        }

        p2 = new JPanel();
        GridLayout gl1 = new GridLayout(4, 1);
        p2.setLayout(gl1);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiply);
        windowContent.add("East", p2);

        buttonEqual.setBackground(Color.GREEN);
        buttonEqual.setForeground(Color.WHITE);
        buttonEqual.setOpaque(true);
        buttonEqual.setFocusPainted(false);

        buttonPoint.setBackground(Color.YELLOW);
        buttonPoint.setForeground(Color.BLACK);
        buttonPoint.setOpaque(true);
        buttonPoint.setFocusPainted(false);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
