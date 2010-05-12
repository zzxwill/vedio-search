package graphicsInterface;

import java.applet.*;
import java.awt.*;
import java.awt.Image;

public class Te extends Applet{
 Toolkit tll=Toolkit.getDefaultToolkit();
 
 TextField input1=new TextField("ss",15);
 public void init(){
   setBackground(Color.LIGHT_GRAY);
 }
 public void paint(Graphics g)
 {
    Image f_imgae=tll.getImage("c:\\img\\1.jpg");
    Graphics g2=(Graphics) g;
    g2.drawImage(f_imgae, 40, 40, 100, 100, this);
  
  }
}


