package day22_io;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class myCanvas_3 extends Canvas implements KeyListener {
   private int index;
   private int x,y;
   Color colors[] = { Color.red, Color.green, Color.blue,Color.yellow,Color.pink};
   Image im;

   public void init() {
      im=this.createImage(getSize().width, getSize().height);
      Graphics offImg = im.getGraphics();
      offImg.setColor(Color.white);
      offImg.fillRect(0,0,im.getWidth(this),im.getHeight(this));
   }

   public static void main(String[] args) {
       Frame f = new Frame("canvas");
       myCanvas_3 mc = new myCanvas_3();
       mc.setSize(150,150);
       
       f.add(mc,BorderLayout.CENTER);
       mc.requestFocus();
       mc.addKeyListener(mc);
       f.pack();
       mc.init();
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

   public void paint(Graphics g) {
      Graphics offG =im.getGraphics();
      offG.setColor(colors[index]);
      offG.fillRect(x,y,40,40); 

      g.drawImage(im,0,0,this);
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
} 
