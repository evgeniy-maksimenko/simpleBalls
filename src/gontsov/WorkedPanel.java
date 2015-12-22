package gontsov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WorkedPanel extends JPanel implements MouseListener {
    int x = 0;
    int y = 0;
    ArrayList<Balls> balls = new ArrayList<Balls>();


    public WorkedPanel() {
        addMouseListener(this);
        Timer timer = new Timer(100, new ActionTimer());
        timer.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        balls.add(new Balls(this, e.getX(), e.getY()));
        x = e.getX();
        y = e.getY();
    }



    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(Balls ball: balls){
            ball.paint(g);
        }
    }



    private class ActionTimer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(Balls ball: balls){
                ball.move();
            }
            repaint();
        }
    }
}

