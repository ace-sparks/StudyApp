package Panels;

import javax.swing.*;
import java.awt.*;

public class MainLeftPanel extends JPanel {
    public JButton pic_button;
    public MainLeftPanel(){
        this.setBounds(0,0,250,900);
        
        this.setBackground(new Color(52, 58, 94));
        ImageIcon icon1 = new ImageIcon("C:/Users/naliv/Desktop/Desktop APP Study project/src/logo-removebg.png");

        pic_button = new JButton(icon1);
        pic_button.setFocusable(false);
        pic_button.setBorderPainted(false);
        pic_button.setBackground(new Color(52, 58, 94));


        this.add(pic_button);
        this.setVisible(true);
    }
}
