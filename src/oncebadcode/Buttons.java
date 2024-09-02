package oncebadcode;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JFrame {
    JButton button1 = new JButton("Red");
    JButton button2 = new JButton("Pink");
    JButton button3 = new JButton("Orange");
    JButton button4 = new JButton("Yellow");
    JButton button5 = new JButton("Black");

    JPanel panel1 = new JPanel(new FlowLayout());
    JPanel panel2 = new JPanel();

    public Buttons() {
        setLayout(new GridLayout(1, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        add(panel2);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);

        button1.addActionListener(_ -> panel2.setBackground(Color.RED));
        button2.addActionListener(_ -> panel2.setBackground(Color.PINK));
        button3.addActionListener(_ -> panel2.setBackground(Color.ORANGE));
        button4.addActionListener(_ -> panel2.setBackground(Color.YELLOW));
        button5.addActionListener(_ -> panel2.setBackground(Color.BLACK));
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Buttons();
    }

}
