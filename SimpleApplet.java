
import javax.swing.*;
import java.awt.*;

public class SimpleApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Welcome to Java Applet", 50, 50);
        g.drawString("This is a Simple Applet", 50, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Applet Demo");
        frame.add(new SimpleApplet());
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
