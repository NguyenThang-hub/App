import javax.swing.*;
import java.awt.*;

public class Application {
    private static  JFrame frame = new JFrame("Login");

    private JPanelCus Container_right = new JPanelCus(new BorderLayout());
    private JPanelCus JPanel_right = new JPanelCus(new GridLayout(9,1));


    public JPanelCus CreatePanel(JComponent component) {
        JPanelCus panel = new JPanelCus();
        panel.add(component, BorderLayout.CENTER);
        return panel;
    }
    public JPanelCus CreateBlank(int width, int height, Color color){
        JPanelCus blank = new JPanelCus();
        blank.setPreferredSize(new Dimension(width, height));

        return blank;
    }

    public void run() {
        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension( 1000,600));
        frame.setLocation(300,200);
        JPanelCus Panelcus = CreatePanel(new JLabel("Username"));
//        blank.setPreferredSize(new Dimension(100, 100));
        frame.add(Panelcus, BorderLayout.EAST);
        JPanelCus PanelCus1 = CreatePanel(new JLabel("Password"));
        frame.add(PanelCus1, BorderLayout.EAST);
        JPanel panel = new JPanel(new GridLayout(9,1));
        for (int i = 0; i < 9; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
