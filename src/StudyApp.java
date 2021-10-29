import java.awt.EventQueue;

import org.w3c.dom.events.Event;

import Panels.MainLeftPanel;
import Panels.MainPanel;
import Panels.MainPanelTop;

public class StudyApp {
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameOfApp frame = new FrameOfApp();
                MainLeftPanel panel_left = new MainLeftPanel();
                frame.add(panel_left);
                MainPanelTop panel_top = new MainPanelTop();
                frame.add(panel_top);
                MainPanel panel_main = new MainPanel();
                frame.add(panel_main);
                CoursesPanel coursesPanel = new CoursesPanel();
                frame.add(coursesPanel);
                panel_top.courses.addActionListener(e -> {panel_main.setVisible(false);coursesPanel.setVisible(true);});
                panel_left.pic_button.addActionListener(e -> {coursesPanel.setVisible(false);panel_main.setVisible(true);});
            }
        });
    }
}
