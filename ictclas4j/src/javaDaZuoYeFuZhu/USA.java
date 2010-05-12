package javaDaZuoYeFuZhu;

import java.awt.*;import java.awt.event.*;
import java.io.*;
	
public class USA  extends Frame  implements ActionListener{

	Label lab1a=new Label("欢迎来到美国展区参观！");
	Label lab2a=new Label("请选择您感兴趣的展品：");
	
	Label lab3a=new Label("                                IT区                                          ");
	Button but1a=new Button("Laptop");
	Button but2a=new Button("E-dictionary");
	Button but3a=new Button("MP4");
	Button but4a=new Button("Phone");
	
	
	Label lab5a=new Label("                                织物区                                            ");

	Button but5a=new Button("WashingMachine");
	Button but6a=new Button("MicrowaveOven");
	Button but7a=new Button("FolderBicycle");

	
	
		
	public USA(){
			
			setSize(300,280);
			setLayout(new FlowLayout());
			add(lab1a);
			add(lab2a);
			add(lab3a);

			add(but1a);
			add(but2a);
			add(but3a);
			add(but4a);
			
			add(lab5a);

					
			
			add(but5a);
			add(but6a);
			add(but7a);
	
			
			lab1a.setBounds(30,30,300,180);
			lab2a.setBounds(20,80,300,50);
			lab3a.setBounds(140,130,60,50);

			lab5a.setBounds(140,230,60,50);
//			lab6c.setBounds(30,230,60,50);
			
	
			
			but1a.setBounds(30,300,60,20);
			but2a.setBounds(30,350,60,20);
			but3a.setBounds(30,400,60,20);
			but4a.setBounds(30,450,60,20);
			but5a.setBounds(30,500,60,20);
			but6a.setBounds(30,550,60,20);
			but7a.setBounds(30,600,80,20);
			
			
			
			but1a.addActionListener(this);
			but2a.addActionListener(this);
			but3a.addActionListener(this);
			but4a.addActionListener(this);
			but5a.addActionListener(this);
			but6a.addActionListener(this);
			but7a.addActionListener(this);
		
			
			show();
			
			addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e){
	                e.getWindow().dispose();}});
			
		}
			
			//下面这个方法用法实现确定 "放弃的功能
	
			
		
		public static void main(String args[]){
	
			
			
			new USA();
		
		}


		public void actionPerformed(ActionEvent e){
			BuildANewFileFolder t1=new BuildANewFileFolder();
			t1.newFileFolder();
			new AddMoreInformationToFile();
			
			File f=new File("f:\\TheInfomationOfTheVistors\\USA.txt");
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
				
				  
					if(e.getSource()==but1a){
						out.write("Laptop\n");
					}
					
					if(e.getSource()==but2a){
						out.write("E-dictionary\n");
			
					}
					if(e.getSource()==but3a){
						out.write("MP4\n");
			
					}
					if(e.getSource()==but4a){
						out.write("Phone\n");
			
					}
					if(e.getSource()==but5a){
						out.write("Silk\n");
			
					}
					if(e.getSource()==but6a){
						out.write("Cheong-sam\n");
			
					}
					if(e.getSource()==but7a){
						out.write("Minority costum\n");
			
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
			if(e.getSource()==but1a){
				myfile.writeBytes("Laptop		");
				
			}
			
			if(e.getSource()==but3a){
				myfile.writeBytes("MP4		");
				
			}
			if(e.getSource()==but4a){
				myfile.writeBytes("Phone		");
				
			}
		
			if(e.getSource()==but5a){
				myfile.writeBytes("Silk		");
				
			}
			if(e.getSource()==but6a){
				myfile.writeBytes("Cheong-sam		");
				
			}
			if(e.getSource()==but7a){
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
		

	 



		

	 



