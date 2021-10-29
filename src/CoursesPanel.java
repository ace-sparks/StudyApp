import javax.swing.*;
import java.awt.*;

public class CoursesPanel extends JPanel {
    public CoursesPanel(){
        this.setBounds(250,100,1150,800);

        this.setBackground(new Color(29, 37, 56));

        JPanel panel_list_courses = new JPanel();
        panel_list_courses.setBounds(0 ,0,200,800);
        panel_list_courses.setBackground(Color.WHITE);
        this.add(panel_list_courses);
        this.setLayout(null);
        this.setVisible(false);
    }
}
