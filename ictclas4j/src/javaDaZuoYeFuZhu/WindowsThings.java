package javaDaZuoYeFuZhu;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
public class WindowsThings  extends Frame  implements ActionListener{
//				out.write("IT"); out.write("textile"); out.write("DailyThings");out.write("GreenProducts");		

		
		Label lab1=new Label("请选择您想参观的物品展区（只能选择一个）");
		
		Label lab2=new Label("A    IT");
		Label lab3=new Label("B    textile");
		Label lab4=new Label("C    DailyThings");
		Label lab5=new Label("D    GreenProducts");
		
		TextField tf=new TextField(12);
		Button but1=new Button("确定");
		
		Button but2=new Button("退出");
	
	
		
		
		public WindowsThings(){
			
			setSize(300,500);
			setLayout(null);
			add(lab1);
			add(lab2);
			add(lab3);
			add(lab4);
			add(lab5);
		
			add(tf);
			
			add(but1);
			add(but2);
			
		
			
			lab1.setBounds(30,30,300,20);
			
			lab2.setBounds(30,130,90,20);
			lab3.setBounds(30,180,90,20);
			lab4.setBounds(30,230,90,20);
			lab5.setBounds(30,280,90,20);
			
			tf.setBounds(30,300,60,20);
			
			but1.setBounds(30,330,60,20);
			but2.setBounds(30,380,60,20);
			
			but1.addActionListener(this);
			but2.addActionListener(this);
		
		
			show();
			
			addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e){
	                System.exit(0);}});
			
		}
			
			//下面这个方法用法实现确定 "放弃的功能
			
			
		
		public static void main(String args[]){
			new WindowsThings();
			
			
			
		}
//**********************************************************************
		public void actionPerformed(ActionEvent e) {
		
			File f=new File("f:\\TheInfomationOfTheVistors\\things.txt");
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
				   if(e.getActionCommand().equals("确定")&&tf.getText().equals("A")){
						out.write("IT\n"); 
						
					}
					if(e.getActionCommand().equals("确定")&&tf.getText().equals("B")){
						out.write("textile\n"); 
					
						}
					if(e.getActionCommand().equals("确定")&&tf.getText().equals("C")){
						out.write("DailyThings\n");
						}
					if(e.getActionCommand().equals("确定")&&tf.getText().equals("D")){
						out.write("GreenProducts\n");
						}
				  
					
					
					
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
				
		
		
			  
			  
		try{
			RandomAccessFile myfile;
			myfile=new RandomAccessFile("f:\\TheInfomationOfTheVistors\\totalInformation.txt","rw");
			
			myfile.seek(myfile.length());
			if(e.getActionCommand().equals("确定")&&tf.getText().equals("A")){
				
				IT it=new IT();
				it.setSize(400,400);
				pack();
				out.write("IT");
				}
			if(e.getActionCommand().equals("确定")&&tf.getText().equals("B")){
				myfile.writeBytes("textile");
			
				}
			if(e.getActionCommand().equals("确定")&&tf.getText().equals("C")){
				myfile.writeBytes("DailyThings");
				}
			if(e.getActionCommand().equals("确定")&&tf.getText().equals("D")){
				myfile.writeBytes("GreenProducts");
				}
			
//*******************************************************************************
			
		
			if(e.getActionCommand().equals("退出")){
				this.dispose();
			}
			myfile.close();
			}catch(IOException er){
				System.out.println("Error!");
			}
//*******************************************************************************
			
		
		
		}

			
	}
