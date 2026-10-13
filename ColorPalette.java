
import javax.swing.*;
import java.awt.*;

public class ColorPalette extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(20, 30, 80, 50);

        g.setColor(Color.GREEN);
        g.fillRect(120, 30, 80, 50);

        g.setColor(Color.BLUE);
        g.fillRect(220, 30, 80, 50);

        g.setColor(Color.YELLOW);
        g.fillRect(20, 100, 80, 50);

        g.setColor(Color.ORANGE);
        g.fillRect(120, 100, 80, 50);

        g.setColor(Color.MAGENTA);
        g.fillRect(220, 100, 80, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Palette");
        frame.add(new ColorPalette());
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
