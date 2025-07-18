import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 700;
        int boardHeight = 800;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        FlappyBird flappyBird = new FlappyBird(boardWidth, boardHeight); // pass new size
        frame.add(flappyBird);
        frame.pack(); // size frame to match preferred size of FlappyBird panel

        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
