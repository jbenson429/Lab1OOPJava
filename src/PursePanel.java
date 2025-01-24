import javax.swing.*;
import java.awt.*;
import java.util.Map;

class PursePanel extends JPanel {
    private Purse purse = new Purse();

    public void updatePurse(Purse newPurse) {
        this.purse = newPurse;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        int x = 10;
        int y = 20;
        for (Map.Entry<Denomination, Integer> entry : purse.getCash().entrySet()) { // Use getter here
            String text = entry.getValue() + " " + entry.getKey().name();
            g.drawString(text, x, y);
            y += 20;
        }
    }
}

