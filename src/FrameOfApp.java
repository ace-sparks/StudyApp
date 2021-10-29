import javax.swing.*;

public class FrameOfApp extends JFrame {
    public FrameOfApp() {
        this.setSize(1400, 900);
        
        this.setTitle("StudyApp"); // title of frame
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close button on frame
        ImageIcon iconMain = new ImageIcon("C:/Users/naliv/Desktop/Desktop APP Study project/src/logo.png"); //add object icon
        this.setIconImage(iconMain.getImage());
        //this.getContentPane().setBackground(new Color(0,0,0)); //back ground color
        setLocationRelativeTo(null); // center of frame
        this.setLayout(null);
        this.setVisible(true);

    }
}
