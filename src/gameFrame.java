//This code represents the definition of a JFrame class (gameFrame) for a Snake Game GUI.
// It sets up the frame, adds a game panel (gamePanel), and configures various properties for
// the appearance and behavior of the GUI.

import javax.swing.*;

public class gameFrame extends JFrame {
    gameFrame(){
        this.setTitle("Sanke Snake");
        this.add(new gamePanel());
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}