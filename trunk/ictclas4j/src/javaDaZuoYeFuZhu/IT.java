package javaDaZuoYeFuZhu;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
	
public class IT  extends Frame  implements ActionListener{
	Label lab1ci=new Label("欢迎来到IT展区参观！");
	Label lab2ci=new Label("请选择您感兴趣的展品：");
	
	Label lab3ci=new Label("                                笔记本                                          ");
	Button but1ci=new Button("IBM made in USA          ");
	Button but2ci=new Button("Lenovo made in China     ");
	Button but3ci=new Button("Acer made in Japan       ");

	
	
	Label lab5ci=new Label("                                手机                                           ");

	Button but5ci=new Button("Motorala made in UsA     ");
	Button but6ci=new Button("Konka made in China      ");
	Button but7ci=new Button("Fushikung in Japan       ");

	
	
		
		public IT(){
			
			setSize(300,280);
			setLayout(new FlowLayout());
			add(lab1ci);
			add(lab2ci);
			add(lab3ci);

			add(but1ci);
			add(but2ci);
			add(but3ci);

			
			add(lab5ci);

					
			
			add(but5ci);
			add(but6ci);
			add(but7ci);

			
			lab1ci.setBounds(30,30,300,180);
			lab2ci.setBounds(30,80,300,50);
			lab3ci.setBounds(140,130,60,50);

			lab5ci.setBounds(140,230,60,50);
//			lab6c.setBounds(30,230,60,50);
			
	
			
			but1ci.setBounds(30,300,60,20);
			but2ci.setBounds(30,350,60,20);
			but3ci.setBounds(30,400,60,20);
		
			but5ci.setBounds(30,500,60,20);
			but6ci.setBounds(30,550,60,20);
			but7ci.setBounds(30,600,80,20);

			
			
			
			but1ci.addActionListener(this);
			but2ci.addActionListener(this);
			but3ci.addActionListener(this);
		
			but5ci.addActionListener(this);
			but6ci.addActionListener(this);
			but7ci.addActionListener(this);

			
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
			File f=new File("f:\\TheInfomationOfTheVistors\\IT.txt");
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
				
				  
					if(e.getSource()==but1ci){
						out.write("IBM made in USA   \n   ");
					}
					
					if(e.getSource()==but2ci){
						out.write("Lenovo made in China \n   ");
			
					}
					if(e.getSource()==but3ci){
						out.write("Acer made in Japan      \n ");
			
					}
				
					if(e.getSource()==but5ci){
						out.write("Motorala made in UsA   \n   ");
			
					}
					if(e.getSource()==but6ci){
						out.write("Konka made in China     \n   ");
			
					}
					if(e.getSource()==but7ci){
						out.write("Fushikung in Japan     \n    ");
			
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
			if(e.getSource()==but1ci){
				myfile.writeBytes("IBM made in USA		");
				
			}
			
			if(e.getSource()==but2ci){
				myfile.writeBytes("Lenovo made in China");
	
			}
			if(e.getSource()==but3ci){
				myfile.writeBytes("Acer made in Japan");
	
			}
		
			if(e.getSource()==but5ci){
				myfile.writeBytes("Motorala made in UsA");
	
			}
			if(e.getSource()==but6ci){
				myfile.writeBytes("Konka made in China");
	
			}
			if(e.getSource()==but7ci){
				myfile.writeBytes("Fushikung in Japan");
	
			}
			myfile.close();
			}catch(IOException er){
				System.out.println("Error!");
			}
		
				
			

		}


			
	}
		

	 



