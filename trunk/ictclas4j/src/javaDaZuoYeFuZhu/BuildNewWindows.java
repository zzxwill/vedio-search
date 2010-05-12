package javaDaZuoYeFuZhu;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.*;

public class BuildNewWindows extends Frame implements ActionListener{
		Label lab1=new Label("欢迎参观北京国际展览中心");
		Label lab2=new Label("请选择参观方式：");
		
		Button but1=new Button("按国家分类参观");
		Button but2=new Button("按物品种类参观");
		
		JFrame frame=new JFrame("北京国际展览中心全景");
		JPanel JPimage=new JPanel();
		ImageIcon gx1=new ImageIcon("gz2.jpg");
		ImageIcon gx2=new ImageIcon("gz1.jpg");
		JLabel JLgx1=new JLabel(gx1);
		JLabel JLgx2=new JLabel(gx2);
		
		
		
		
		
	
		public BuildNewWindows(){
			

			lab1.setBounds(50,100,300,20);
			lab2.setBounds(50,130,300,20);
			
			but1.setBounds(70,180,100,20);
			but2.setBounds(70,210,100,20);
			
//			JPimage.setBounds(10,10,100,100);
//			add(JPimage);
			
			JPimage.add(JLgx1);
			JPimage.add(JLgx2);
			frame.add(JPimage);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300,300);
			frame.setVisible(true);
			frame.add(lab1);
			frame.add(lab2);
		
			frame.add(but1);
			frame.add(but2);
			
			
			
			but1.addActionListener(this);
			but2.addActionListener(this);
			
//			tf3.addActionListener(this);
			
			//load pictures
			
			
//			show();
			addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e){
	                e.getWindow().dispose();}});
		}

		
		
		public static void main(String args[]){
			new BuildNewWindows();
			
		}
		
		
		
		public void actionPerformed(ActionEvent e) 
		{

//*********************************************************
			BuildANewFileFolder t1=new BuildANewFileFolder();
			t1.newFileFolder();
			new AddMoreInformationToFile();
					
			File f=new File("f:\\TheInfomationOfTheVistors\\VisitStyle.txt");
			BufferedWriter out=null;
			try{
				   if (!f.exists())
				   {
				    f.createNewFile();//如果out.txt不存在，则创建一个新文件
				   }
				   out = new BufferedWriter(new FileWriter(f,true));//参数true表示将输出追加到文件内容的末尾而不覆盖原来的内容
				   //out.newLine(); //换行
				  
			//***********************************************
//				   将文本框的数据写到文件中。
//				   out.newLine();
				
				  
					if(e.getSource()==but1){
						WindowsNations nation=new  WindowsNations();
						nation.setSize(400,400);
						pack();
						out.write("Nations");
						out.newLine();
						//   out.write(tf6.getText());
					}
					
					if(e.getSource()==but2){
						WindowsThings thing=new WindowsThings();
						thing.setSize(400,400);
						pack();
						out.write("Things");
						out.newLine();
					//	this.dispose();
					}
					 out.close();
			  }
			  catch (IOException ef)
			  {
			   ef.printStackTrace();
			  }
			  finally {
			   try
			   {
			    if (out!=null)
			    {
			     out.close();
			    }
			   }
			   catch (IOException ef)
			   {
			    ef.printStackTrace();
			   }
			  }
				
		
//***************************************************************************8
		try{
			RandomAccessFile myfile;
			myfile=new RandomAccessFile("f:\\TheInfomationOfTheVistors\\totalInformation.txt","rw");
			
			myfile.seek(myfile.length());
			if(e.getSource()==but1){
				myfile.writeBytes("Nations		");
				System.out.print("Nations  代表参观方式是按国家分类参观");
				
			}
			
			if(e.getSource()==but2){
				myfile.writeBytes("Things		");
				System.out.print("Things  代表参观方式是按物品种类参观");
			}
			myfile.close();
			}catch(IOException er){
				System.out.println("Error!");
			}
		
				
			
//			if(e.getSource()==but2){
//				WindowsThings NWN2=new  WindowsThings();
//				NWN2.setSize(400,400);
//				pack();
//			}
		
}

}		
				
			
		
		
		

