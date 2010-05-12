package graphicsInterface;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;

public class ImageTest extends JFrame{
    ImageIcon icon=new ImageIcon("c:\\img\\1.jpg");
    Image image=icon.getImage();
    public ImageTest()
    {
        JMenuBar mb=new JMenuBar();
        this.setJMenuBar(mb);    
        JMenu menu=new JMenu("system");
        menu.setIcon(icon);
        //JMenuItem item=new JMenuItem("exit",icon);
        JMenuItem item=new JMenuItem(icon);
        item.setIcon(icon);
        JLabel label=new JLabel(icon);
        //label.setIcon(icon);
        menu.add(item);
        mb.add(menu);  
       
        

        DefaultMutableTreeNode root=new DefaultMutableTreeNode();
        DefaultMutableTreeNode node1=new DefaultMutableTreeNode();
        DefaultMutableTreeNode node11=new DefaultMutableTreeNode();
        DefaultMutableTreeNode node12=new DefaultMutableTreeNode();
        DefaultMutableTreeNode node2=new DefaultMutableTreeNode();
        DefaultMutableTreeNode node21=new DefaultMutableTreeNode();
        root.add(node1);
        root.add(node2);
        node1.add(node11);
        node1.add(node12);
        node2.add(node21);
       
       
//        JTree jTree1 = new javax.swing.JTree(root);
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setOpenIcon(new ImageIcon("C:\\img\\2.jpg"));    //展开时节点图标
            renderer.setOpenIcon(new ImageIcon("C:\\img\\3.jpg"));  //折叠时节点图标
        renderer.setOpenIcon(new ImageIcon("C:\\img\\4.jpg"));    //叶子节点图标
//        jTree1.setCellRenderer(renderer);
        this.add(label);
        this.setIconImage(image);
      
 //       this.add(jTree1);
        this.setDefaultCloseOperation(3);
        this.setLocation(300,400);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ImageTest();
    }

} 

