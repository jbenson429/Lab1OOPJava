import javax.swing.*;
import java.awt.*;

public class MakingChange {
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        RegisterPanel registerPanel = new RegisterPanel();
        frame.add(registerPanel);

        frame.setVisible(true);
    }
}
