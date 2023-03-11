
package com.mycompany.snake_game;
import javax.swing.*;

public class Snake extends JFrame{
    Snake(){
   
        add(new Board());
        //pack() fuction is use for defining frame size
        pack();
        
        setLocationRelativeTo(null);
        setTitle("Snake Game");
        setResizable(false);
    }
     
    public static void main(String args[])
    {
        new Snake().setVisible(true);
    }
}
