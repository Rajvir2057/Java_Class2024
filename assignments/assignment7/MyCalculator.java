import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator{
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame(" Basic Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

        // Creating the components..
        
        JLabel numLabel1 = new JLabel("Number 1:");
        numLabel1.setBounds(20, 20, 80, 25);//
        JTextField numField1 = new JTextField();
        numField1.setBounds(100, 20, 150, 25);
        JLabel numLabel2 = new JLabel("Number 2:");
        numLabel2.setBounds(20, 50, 80, 25);
        JTextField numField2 = new JTextField();
        numField2.setBounds(100, 50, 150, 25);

        // creating buttons..
        JButton addButton = new JButton("Add");
        addButton.setBounds(100, 80, 80, 25);

        JButton SubButton = new JButton("Sub");
        SubButton.setBounds(100, 80, 80, 25);

        JButton multButton = new JButton("mult");
        multButton.setBounds(100, 80, 80, 25);

        JButton divButton = new JButton("div");
        divButton.setBounds(100, 80, 80, 25);

        JButton modButton = new JButton("Modulus");
        modButton.setBounds(100, 80, 80, 25);

        // result label (to bring output...)
        JLabel addLabel = new JLabel();
        addLabel.setBounds(20, 110, 250, 25);

        JLabel SubLabel = new JLabel();
        SubLabel.setBounds(20, 110, 250, 25);

        JLabel multLabel = new JLabel();
        multLabel.setBounds(20, 110, 250, 25);

        JLabel divLabel = new JLabel();
        divLabel.setBounds(20, 110, 250, 25);

        JLabel modLabel = new JLabel();
        modLabel.setBounds(20, 110, 250, 25);

        // Add components to the frame
        frame.add(numLabel1);
        frame.add(numField1);
        frame.add(numLabel2);
        frame.add(numField2);
        frame.add(addButton);
        frame.add(addLabel);
        frame.add(SubButton);
        frame.add(SubLabel);
        frame.add(multButton);
        frame.add(multLabel);
        frame.add(divButton);
        frame.add(divLabel);
        frame.add(modButton);
        frame.add(modLabel);    

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());

                    // Perform addition
                    double result = num1 + num2;

                    // Display result
                    addLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    addLabel.setText("Invalid input");
                }
            }
        });

        // sub action listener to the button
        SubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());

                    // Perform subtruction
                    double result = num1 - num2;

                    // Display result
                    SubLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    SubLabel.setText("Invalid input");
                }
            }
        });

        // mult action listener to the button
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());

                     // Perform multiplication
                    double result = num1 * num2;

                     // Display result
                    multLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    multLabel.setText("Invalid input");
                }
            }
        });

        // div action listener to the button
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    
                    // Perform division
                    double result = num1 / num2;
                    
                    // Display result
                    divLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    divLabel.setText("Invalid input");
                }
            }
        });
        
        // mod action listener to the button
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    
                    // Perform modulus
                    double result = num1 % num2;
                    
                    // Display result
                    modLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    modLabel.setText("Invalid input");
                }
            }
        });

        
        // Make the frame visible
        frame.setVisible(true);
    }
}
