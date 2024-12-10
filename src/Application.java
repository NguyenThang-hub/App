import javax.swing.*;
import java.awt.*;

public class Application {
    private static  JFrame frame = new JFrame("Login");
    public static void main(String args[]) {
        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension( 1000,600));
        frame.setLocation(300,200);
        JPanel panel = new JPanel(new GridLayout(9,1));
        for (int i = 0; i < 9; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }
//        JPanelCus title
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

}
