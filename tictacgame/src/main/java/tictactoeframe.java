
package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * @author LunaViolet
 */
public class tictactoeframe extends JFrame
{
    //Indicates whos turn
    public char whoseTurn = 'X';
    //Create cel grid
    public Cell[][] cells = new Cell [3][3];
    //create status label
    JLabel jlblStatus = new JLabel("X's turn to play");

    public tictactoeframe()
    {
        //Panel to hold cells
        JPanel panel = new JPanel(new GridLayout(3, 3, 0,0));
        for (int i = 0; i < 3; i++)
            for (int j = 0; j <3; j++)
                panel.add(cells=[i][j] = new Cell());
        panel.setBorder(new LineBorder(Color.MAGENTA,1));
        jlblStatus.setBorder(new LineBorder(Color.BLACK, 1));

        add(panel, BorderLayout.CENTER);
        add(jlblStatus, BorderLayout.SOUTH);
    }

    /**
     * Determine if game board is full
     * @return True, if the game board is full, otherwise false.
     */
    public boolean isFull()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (cells[i][j].getToken() == ' ')
                    return false;
        return true;
    }
    /**
     * Determine if given token has won
     * @param token
     * @return
     */
    public boolean isWon(char token)
    {
        //Check Rows
        for (int i = 0; i < 3; i++)
            if ((cells[i][0].getToken() == token)
                && (cells[i][1].getToken() == token)
                && (cells[i][2].getToken() == token))
        {
            return true;
        }
        //Check columns
       for (int j = 0; j < 3; j++)
           if ((cells[0][j].getToken() == token)
               && (cells[1][j].getToken() == token)
               && (cells[2][j].getToken() == token))
           {
             return true;
           }
       //Check diagonal
       if ((cells[0][0].getToken() == token)
               && (cells[1][1].getToken() == token)
               && (cells[2][2].getToken() == token))
            {
                return true;
            }
       if ((cells[0][2].getToken() == token)
               && (cells[1][1].getToken() == token)
               && (cells[2][0].getToken() == token))
            {
                return true;
            }
       return false;
    }
    /**
     * Constructor
     */
    public Cell()
    {
        setBorder(new LineBorder(Color.BLACK, 1));
        addMouseListener(new MyMouseListener());
    }
    /**
     * Gets the Token of the cell
     * @return The token value of the cell.
     */
    public char getToken()
    {
        return token;
    }

    /**
     * Sets the token of the cell
     * @param c Character to use as token value.
     */
    public void setToken(char c)
    {
        token = c;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g);

    if (token == 'X')
}//End tic tac toe game
