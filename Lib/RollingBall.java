package Lib;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel {
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 90, 80, 80);
        g.fillArc(100, 90, 80, 80, 0, 180);

    }
    
    
}
