package javaDaZuoYeFuZhu;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
	
public class China  extends Frame  implements ActionListener{
	Label lab1c=new Label("欢迎来到中国展区参观！");
	Label lab2c=new Label("请选择您感兴趣的展品：");
	
	Label lab3c=new Label("                                IT区                                          ");
	Button but1c=new Button("Laptop");
	Button but2c=new Button("E-dictionary");
	Button but3c=new Button("MP4");
	Button but4c=new Button("Phone");
	
	
	Label lab5c=new Label("                                织物区                                            ");

	Button but5c=new Button("Silk");
	Button but6c=new Button("Cheong-sam");
	Button but7c=new Button("Minority costum");

	
	
		
		public China(){
			
			setSize(300,280);
			setLayout(new FlowLayout());
			add(lab1c);
			add(lab2c);
			add(lab3c);

			add(but1c);
			add(but2c);
			add(but3c);
			add(but4c);
			
			add(lab5c);

					
			
			add(but5c);
			add(but6c);
			add(but7c);

			
			lab1c.setBounds(30,30,300,180);
			lab2c.setBounds(20,80,300,50);
			lab3c.setBounds(140,130,60,50);

			lab5c.setBounds(140,230,60,50);
//			lab6c.setBounds(30,230,60,50);
			
	
			
			but1c.setBounds(30,300,60,20);
			but2c.setBounds(30,350,60,20);
			but3c.setBounds(30,400,60,20);
			but4c.setBounds(30,450,60,20);
			but5c.setBounds(30,500,60,20);
			but6c.setBounds(30,550,60,20);
			but7c.setBounds(30,600,80,20);

			
			
			
			but1c.addActionListener(this);
			but2c.addActionListener(this);
			but3c.addActionListener(this);
			but4c.addActionListener(this);
			but5c.addActionListener(this);
			but6c.addActionListener(this);
			but7c.addActionListener(this);

			
			show();
			
			addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e){
	                e.getWindow().dispose();}});
			
		}
			
			//下面这个方法用法实现确定 "放弃的功能
	
			
		
		public static void main(String args[]){
	
			
			
			new China();
		
		}

		public void actionPerformed(ActionEvent e){
			BuildANewFileFolder t1=new BuildANewFileFolder();
			t1.newFileFolder();
			new AddMoreInformationToFile();
			
			File f=new File("f:\\TheInfomationOfTheVistors\\China.txt");
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
				
				  
					if(e.getSource()==but1c){
						out.write("Laptop  \n    		");
					}
					
					if(e.getSource()==but2c){
						out.write("E-dictionary	\n 	");
			
					}
					if(e.getSource()==but3c){
						out.write("MP4			\n 	");
			
					}
					if(e.getSource()==but4c){
						out.write("Phone		\n 	");
			
					}
					if(e.getSource()==but5c){
						out.write("Silk				\n ");
			
					}
					if(e.getSource()==but6c){
						out.write("Cheong-sam		\n ");
			
					}
					if(e.getSource()==but7c){
						out.write("Minority costum\n 	");
			
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

		try{
			RandomAccessFile myfile;
			myfile=new RandomAccessFile("f:\\TheInfomationOfTheVistors\\totalInformation.txt","rw");
			
			myfile.seek(myfile.length());
			if(e.getSource()==but1c){
				myfile.writeBytes("Laptop				");
				
			}
			
			if(e.getSource()==but3c){
				myfile.writeBytes("MP4					");
				
			}
			if(e.getSource()==but4c){	
				myfile.writeBytes("Phone				");
				
			}
		
			if(e.getSource()==but5c){
				myfile.writeBytes("Silk					");
				
			}
			if(e.getSource()==but6c){
				myfile.writeBytes("Cheong-sam			");
				
			}
			if(e.getSource()==but7c){
				myfile.writeBytes("Minority costum		");
				
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
		

	 



