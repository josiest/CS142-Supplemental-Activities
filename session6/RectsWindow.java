import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectsWindow {
    private static final int width = 640, height = 480;

    // This method has been adapted from Martin Hock's CS 142 Course Material
    public static void main(String[] args) {
        JFrame window = new JFrame("Rects");
        window.setLocationRelativeTo(null);

        @SuppressWarnings("serial")
        final JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g3) {
                Graphics2D g = (Graphics2D) g3;
                g.clearRect(0, 0, width, height);
                g.setBackground(Color.white);
                g.setColor(Color.black);
                Rects.draw(g, width, height);
            }
        };
        window.setSize(width, height);
        window.setContentPane(panel);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
