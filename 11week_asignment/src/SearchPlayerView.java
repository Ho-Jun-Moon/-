import javax.swing.*;
import java.util.*;
import java.awt.*;

public class SearchPlayerView  extends JFrame {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(new TextFieldView());
    pack();
    setVisible(true);
        Toolkit kit = Toolkit.getDefaultToolkit(); // java.awt.Toolkit
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // center frame in screen
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        // set frame icon
        Image img = kit.getImage("icon.gif");
        setIconImage(img);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
public class TextFieldView extends JPanel implements ActionListener {
    public TextFieldView() {
        List<String> temp = ArrayList<>();
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
