package gontsov;

import javax.swing.*;
import java.awt.*;

public class Balls {
    int x = 0;
    int y = 0;

    int dx = 10;
    int dy = 10;

    JPanel parent;

    public Balls(JPanel parent, int x, int y) {
        this.parent = parent;
        this.x = x;
        this.y = y;
    }

    void move() {
        if(x<= 0 || x+50 >= parent.getWidth())
            dx = -dx;
        if(y<= 0 || y+50 >= parent.getHeight())
            dy = -dy;

        x = dx + x;
        y = dy + y;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, 50, 50);
    }
}
