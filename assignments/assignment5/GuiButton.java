import javax.swing.*;

public class GuiButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TESTING BUTTON!"); // This is the title.

        JLabel label = new JLabel("welcome to testing button"); // used to write content in the frame.

        JButton button = new JButton("END:)"); // Button name

        // frame.getContentPane().add(label); // this is to add things into the frame.

        frame.getContentPane().add(button);

        frame.setSize(500, 400); // setting size of the frame.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // helps in closing the frame after the input is done.

        frame.setVisible(true); // frame will be seen by the user.

    }
}
