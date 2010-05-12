package graphicsInterface;


import java.awt.Frame;
import java.applet.*;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
public class ShowImage extends Frame{
    String filename;
  
   public ShowImage(String filename) {
        setSize(470, 350);
        setVisible(true);
        this.filename = filename;
    }
    public void paint(Graphics g) {
        //取得图片对象
        Image image = getToolkit().getImage(filename);
        //画图
        g.drawImage(image, 0, 0, this);
    }
  public static void main(String args[]) {
        new ShowImage("c:\\img\\1.jpg");
    }
  public boolean handleEvent(Event evt){
 if(evt.id==Event.WINDOW_DESTROY)
  System.exit(0);
 return super.handleEvent(evt);
}

}
