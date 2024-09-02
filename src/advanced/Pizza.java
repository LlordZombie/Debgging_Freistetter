package advanced;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pizza extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JComboBox<String> pizzaBox = new JComboBox<>();
    JLabel toppingList = new JLabel("Topping List");
    JLabel aLabel = new JLabel("Paulos's American Pie");
    JTextField totPrice = new JTextField(10);
    int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};
    String output;

    public Pizza() {
        super("Pizza List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        pizzaBox.addItemListener(this);
        add(toppingList);
        pizzaBox.addItem("cheese");
        pizzaBox.addItem("sausage");
        pizzaBox.addItem("pepperoni");
        pizzaBox.addItem("onion");
        pizzaBox.addItem("green pepper");
        pizzaBox.addItem("green olive");
        pizzaBox.addItem("black olive");
        add(pizzaBox);
        add(aLabel);
        add(totPrice);
    }

    public static void main(String[] arguments) {
        JFrame frame = new Pizza();
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == pizzaBox) {
            output = "Pizza Price $" + pizzaPrice[pizzaBox.getSelectedIndex()];
            totPrice.setText(output);
        }
    }
}
