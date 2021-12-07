import javax.swing.*;
import java.awt.*;
import java.util.*;

public class HelloSwingWorldTest {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        System.out.println(Thread.currentThread().getName());
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println(Thread.currentThread().getName());
        //Create and set up the window.
        JFrame frame = new SearchPlayerView();
        frame.setTitle("HelloSwingWorldView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Display the window.
        frame.setVisible(true);
    }
}


//=====================

public class TextFieldView extends JPanel implements ActionListener {
    public TextFieldView() {
        List<String> temp = new ArrayList<>();
        temp.add("name"); temp.add("club"); temp.add("position"); temp.add("nationality");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for(String i : temp){
            textField = new JTextField(20);
            textField.setName(i);
            textField.addActionListener(this);

            add(new JLabel(i));
            add(textField);
        }


        add(textField);
        add(scrollPane);
    }
    public void actionPerformed(ActionEvent evt) {

    }
}
