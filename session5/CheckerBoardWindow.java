import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class CheckerBoardWindow {
    private static final int screenSize = 600;

    public static void main(String[] args) {
        JFrame window = new JFrame("CheckerBoard");
        window.setLocationRelativeTo(null);
        @SuppressWarnings("serial")
        final JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g3) {
                Graphics2D g = (Graphics2D) g3;
                int width = getWidth(), height = getHeight();
                g.clearRect(0, 0, width, height);
                g.setBackground(Color.black);
                g.setColor(Color.white);
                CheckerBoard.draw(g, width, height);
            }
        };
        window.setSize(screenSize, screenSize);
        window.setBackground(Color.black);
        panel.setBackground(Color.black);
        window.setContentPane(panel);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
