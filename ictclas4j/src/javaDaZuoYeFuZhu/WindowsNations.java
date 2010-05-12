package javaDaZuoYeFuZhu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WindowsNations extends Frame implements ItemListener{
	Label lab1=new Label("按选择你想参观的国家");
	
	Checkbox chk1=new Checkbox("中    国");
	Checkbox chk2=new Checkbox("美    国");
	Checkbox chk3=new Checkbox("日    本");
	Checkbox chk4=new Checkbox("法    国");
	Checkbox chk5=new Checkbox("澳大利亚");
	Checkbox chk6=new Checkbox("德    国");
	Checkbox chk7=new Checkbox("意 大 利");
	Checkbox chk8=new Checkbox("荷    兰");
	Checkbox chk9=new Checkbox("比 利 时");
	Checkbox chk10=new Checkbox("加 拿 大");
			

			
			
	public WindowsNations(){
		
		CheckboxGroup c=new CheckboxGroup();
		
		chk1.setCheckboxGroup(c);
		chk2.setCheckboxGroup(c);
		chk3.setCheckboxGroup(c);
		chk4.setCheckboxGroup(c);
		chk5.setCheckboxGroup(c);
		chk6.setCheckboxGroup(c);
		chk7.setCheckboxGroup(c);
		chk8.setCheckboxGroup(c);
		chk9.setCheckboxGroup(c);
		chk10.setCheckboxGroup(c);
	
				
		
		this.add(lab1);
		
		this.add(chk1);
		this.add(chk2);
		this.add(chk3);
		this.add(chk4);
		this.add(chk5);
		this.add(chk6);
		this.add(chk7);
		this.add(chk8);
		this.add(chk9);
		this.add(chk10);
		

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(180,250);
		show();
		
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);
		chk5.addItemListener(this);
		chk6.addItemListener(this);
		chk7.addItemListener(this);
		chk8.addItemListener(this);
		chk9.addItemListener(this);
		chk10.addItemListener(this);
		
		
				
//		but1.setBounds(30,130,100,20);
//		but2.setBounds(30,180,100,20);	
	
		
				
				
	
	}

			
			
	public static void main(String args[]){
		System.out.println("****************************************\n"+
				"为了避免过多重复代码，故有些按钮不起作用！\n"
				+"***********************************\n");
		WindowsNations nation =new WindowsNations();
		nation.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);}});
		
	}
	
	public void itemStateChanged(ItemEvent itemEvent){
		
		File f=new File("f:\\TheInfomationOfTheVistors\\Nations.txt");
		BufferedWriter out=null;
		try{
			   if (!f.exists())
			   {
			    f.createNewFile();//如果out.txt不存在，则创建一个新文件
			   }
			   out = new BufferedWriter(new FileWriter(f,true));//参数true表示将输出追加到文件内容的末尾而不覆盖原来的内容
			   //out.newLine(); //换行
			  
		//***********************************************
//			   将文本框的数据写到文件中。
//			   out.newLine();
			
			   if(chk1.getState()==true){
					China china=new China();
					china.setSize(400,400);
					pack();
					out.write("China\n");
				}
				if(chk2.getState()==true){
					USA usa=new USA();
					usa.setSize(400,400);

					pack();
					out.write("USA\n");
				}
				if(chk3.getState()==true){
					
					out.write("Japan\n");
				}
				if(chk4.getState()==true){
					
					out.write("France\n");
				}
				
				if(chk6.getState()==true){
					
					out.write("German\n");
				}
				if(chk7.getState()==true){
					
					out.write("Italy\n");
				}
				if(chk8.getState()==true){
	
					out.write("Holand\n");
				}
				if(chk9.getState()==true){
	
					out.write("Belgium\n");
				}
				if(chk10.getState()==true){
	
					out.write("Candan\n");
				}
				if(chk5.getState()==true){
					
					out.write("Australia\n");
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
		if(chk1.getState()==true){
			myfile.writeBytes("China		");
			
		}
		
		if(chk2.getState()==true){
			myfile.writeBytes("USA		");
			
		}
		if(chk3.getState()==true){
			myfile.writeBytes("Japan		");
			
		}
		
		
		if(chk4.getState()==true){
			myfile.writeBytes("France	");
			
		}
		if(chk5.getState()==true){
			myfile.writeBytes("Australis		");
			
		}
		if(chk6.getState()==true){
			myfile.writeBytes("German		");
			
		}
		if(chk7.getState()==true){
			myfile.writeBytes("Italy		");
			
		}
		if(chk8.getState()==true){
			myfile.writeBytes("Holand		");
			
		}
		if(chk9.getState()==true){
			myfile.writeBytes("Belgium		");
			
		}
		if(chk10.getState()==true){
			myfile.writeBytes("Canda		");
			
		}
		
		myfile.close();
		}catch(IOException er){
			System.out.println("Error!");
		}
		if(chk1.getState()==true){
			China china=new China();
			china.setSize(400,400);
			pack();
		}
		if(chk2.getState()==true){
			USA usa=new USA();
			usa.setSize(400,400);

			pack();
		}
	}
		
}
			
			
	
