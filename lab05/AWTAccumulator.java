package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Hoang Hai Phong 20210670
public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0; // Accumulated sum, init to 0

  //Hoang Hai Phong 20210670

    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));
        add(new Label("Hoang Hai Phong. Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        // Add WindowListener to handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Exit the application when the window is closed
                System.exit(0);
            }
        });

        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }
  //Hoang Hai Phong 20210670

    public static void main(String[] args) {
        new AWTAccumulator();
    }
  //Hoang Hai Phong 20210670

    private class TFInputListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
