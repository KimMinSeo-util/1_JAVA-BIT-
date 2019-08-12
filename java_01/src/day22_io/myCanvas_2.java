package day22_io;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class myCanvas_2 extends Canvas implements KeyListener {
   private int index;
   private int x,y;
   Color colors[] = { Color.red, Color.green, Color.blue,Color.yellow,Color.pink};
  
   public void paint(Graphics g) {
  
      g.setColor(colors[index]);
      //g.fillRect(0,0,getSize().width,getSize().height); 
      g.fillRect(x,y,40,40); 
   }

    public void keyTyped(KeyEvent e) {
       index++;
       x=10*index;
       y=10*index;
       if (index == colors.length) { index=0 ;}
       repaint();
    }

   public void keyPressed(KeyEvent e) { }
   public void keyReleased(KeyEvent e) { }

   public static void main(String[] args) {
       Frame f = new Frame("canvas");
       myCanvas_2 mc = new myCanvas_2();
       mc.setSize(150,150);
       
       f.add(mc,BorderLayout.CENTER);
       mc.requestFocus();
       mc.addKeyListener(mc);
       f.pack();
      
       f.setVisible(true); 
    
           f.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                  Window w = (Window) e.getSource(); 
                  w.setVisible(false);
                  w.dispose();
                  System.exit(0);
             }
         } ) ;

   }
   public void update(Graphics g) {
      paint(g); 
   }
} 
