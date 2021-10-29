package Panels;

import javax.swing.*;
import java.awt.*;

public class MainPanelTop extends JPanel{
    public JButton english;
    public JButton dead_lines;
    public JButton lo_fi;
    public JButton courses;
    public MainPanelTop(){
        this.setBounds(250,0,1150, 100);
        this.setBackground(new Color(75, 27, 65));
        this.setLayout(null);
        ///////////
        english = new JButton();
        english.setBounds(30, 20, 250, 60);
        english.setBackground(new Color(48, 2, 47));
        english.setBorderPainted(false);
        //text
        english.setText("English");
        english.setFont(new Font("David",Font.BOLD,25));
        english.setForeground(new Color(165, 170, 107));
        english.setFocusable(false);
        this.add(english);
        //////////////////
        lo_fi = new JButton();
        lo_fi.setBounds(310,20,250,60);
        lo_fi.setBackground(new Color(48, 2, 47));
        lo_fi.setBorderPainted(false);
        //text
        lo_fi.setText("Lo-Fi");
        lo_fi.setFont(new Font("David",Font.BOLD,25));
        lo_fi.setForeground(new Color(165, 170, 107));
        lo_fi.setFocusable(false);
        this.add(lo_fi);
        //////////////////
        dead_lines = new JButton();
        dead_lines.setBounds(590,20,250,60);
        dead_lines.setBackground(new Color(48, 2, 47));
        dead_lines.setBorderPainted(false);
        //text
        dead_lines.setText("Dead Lines");
        dead_lines.setFont(new Font("David",Font.BOLD,25));
        dead_lines.setForeground(new Color(165, 170, 107));
        dead_lines.setFocusable(false);
        this.add(dead_lines);
        /////////////////
        courses = new JButton();
        courses.setBounds(870,20,250,60);
        courses.setBackground(new Color(48, 2, 47));
        courses.setBorderPainted(false);
        //text
        courses.setText("Courses");
        courses.setFont(new Font("David",Font.BOLD,25));
        courses.setForeground(new Color(165, 170, 107));
        courses.setFocusable(false);
        this.add(courses);
        ////////////////////
        this.setVisible(true);
    }
}
