package com.mycompany.snake_game;

import java.awt.*;
import javax.swing.*;

public class Board extends JPanel{
    private Image apple;
    private Image dot;
    private Image head;
    
    private final int DOT_SIZE=10; //300*300 =90000/ 100= 900
    private final int ALL_DOTS= 900;
    private final int x[]= new int[ALL_DOTS];
    private final int y[]= new int[ALL_DOTS];
    private int dots;
    Board(){
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300,300));
        loadImages();
    }

public void loadImages()
{
    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("com/mycompany/snake_game/icons/apple.png"));
    apple= i1.getImage();
    ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("com/mycompany/snake_game/icons/dot.png"));
    dot= i2.getImage();
    ImageIcon i3= new ImageIcon(ClassLoader.getSystemResource("com/mycompany/snake_game/icons/head.png"));
    head= i3.getImage();
}

public void initGame()
{
     dots=3;  
     for(int i=0; i<dots; i++)
     {
         x[i]=50 - i * DOT_SIZE;
         y[i]=50;
     }
 
}
}