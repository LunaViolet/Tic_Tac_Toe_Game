
package tictactoe;

import javax.swing.JFrame;

/**
 * Trying to just make a game
 */
public class TicTacToe {
    public static void main(String[] args)
    {
        JFrame ticTacToe = new tictactoe.TicTacToeFrame();
        ticTacToe.setTitle("Luna TicTacToe Game");
        ticTacToe.setSize(600, 600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);

    }
}
