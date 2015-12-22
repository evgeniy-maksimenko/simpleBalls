package gontsov;

import javax.swing.*;

public class Content extends JFrame{
    public Content(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 640, 480);

        add(new WorkedPanel());

        setVisible(true);
    }


}
