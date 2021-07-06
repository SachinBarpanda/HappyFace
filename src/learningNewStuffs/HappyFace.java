package learningNewStuffs;

import javax.swing.*;

public class HappyFace extends JFrame {
    public static void main(String[] args) {
        JFrame window = new JFrame("Happy Face");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

}
