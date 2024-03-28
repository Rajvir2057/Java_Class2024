import javax.swing.JOptionPane;

public class Gui{
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your Name: ");

        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));

        JOptionPane.showMessageDialog(null, "Hello "+ name + "\n \t Your are "+ age + " years and \n your Height is " + height);
    }
}