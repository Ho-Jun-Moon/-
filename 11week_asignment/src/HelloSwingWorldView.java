import javax.swing.*;

public class HelloSwingWorldView extends JFrame{
    public HelloSwingWorldView() {
        // get screen dimensions
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
        // the child will be added to the contentPane (Java 5)
        add(new JLabel("Hello World"), BorderLayout.CENTER);
    }
}