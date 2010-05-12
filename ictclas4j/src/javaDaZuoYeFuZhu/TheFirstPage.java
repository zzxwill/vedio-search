package javaDaZuoYeFuZhu;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//登陆界面第一页

//若用户没有填入信息，点了“确定”也不起作用，给出提示“请输入您 的信息”。

public class TheFirstPage extends Frame  implements ActionListener{
	

	Label lab1=new Label("北京国际展览中心参观系统");
	Label lab2=new Label("请输入您的信息：");
	
	Label lab3=new Label("姓名(请使用英文名或拼音)：");
	Label lab4=new Label("性别（男A，女B）：");
	Label lab5=new Label("年龄：");
	Label lab6=new Label("职业（请使用英文名或拼音）：");
	Button but1=new Button("确定");
	
	Button but2=new Button("退出");
	
	TextField tf3=new TextField();
	TextField tf4=new TextField();
	TextField tf5=new TextField();
	TextField tf6=new TextField();
	
	
	
	public TheFirstPage(){
		
		setSize(400,500);
		setLayout(null);
		add(lab1);
		add(lab2);
		add(lab3);
		add(lab4);
		add(lab5);
		add(lab6);
		
		add(but1);
		add(but2);
		
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		
		lab1.setBounds(100,30,200,20);
		lab2.setBounds(120,80,200,20);
		lab3.setBounds(30,130,200,20);
		lab4.setBounds(30,180,200,20);
		lab5.setBounds(30,230,200,20);
		lab6.setBounds(30,280,200,20);
		
		tf3.setBounds(250,130,90,20);
		tf4.setBounds(250,180,90,20);
		tf5.setBounds(250,230,90,20);
		tf6.setBounds(250,280,90,20);
		
		but1.setBounds(100,330,100,20);
		but2.setBounds(100,380,100,20);
		
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		
		tf3.addActionListener(this);
		show();
		
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                e.getWindow().dispose();}});
		
	}
		
		//下面这个方法用法实现确定 "放弃的功能
		
		
	
	public static void main(String args[]) throws Exception{
		
		System.out.println();
		System.out.println("****************************************************************************************");
		System.out.println("****************************************************************************************");
		System.out.println("管理员欲查看后台数据，请查看以下报告或F盘文件TheInfomationOfTheVistors内其他分类信息文件！");
		System.out.println("****************************************************************************************");
		System.out.println("****************************************************************************************");
		new TheFirstPage();
		
		ReadFile.infor();
		ReadFile.sex();
		ReadFile.nation();
		
	
		
	
	}

	public void actionPerformed(ActionEvent e){
		BuildANewFileFolder.newFileFolder();
		new AddMoreInformationToFile();
		
		File f=new File("f:\\TheInfomationOfTheVistors\\login.txt");

	  BufferedWriter out=null;
	  try
	  {
	   if (!f.exists())
	   {
	    f.createNewFile();//如果out.txt不存在，则创建一个新文件
	   }
	   out = new BufferedWriter(new FileWriter(f,true));//参数true表示将输出追加到文件内容的末尾而不覆盖原来的内容
	   //out.newLine(); //换行
	  
//***********************************************
//	   将文本框的数据写到文件中。
	   //System.out.println(str);
//	   out.flush();
//	   out.write("姓名    性别    年龄   职业");
	   out.newLine();
	   out.write(tf3.getText());
	   out.newLine();
	   out.write(tf4.getText());
	   out.newLine();
	   out.write(tf5.getText());
	   out.newLine();
	   out.write(tf6.getText());
	   
	   //out.newLine();
	   out.close();
//****************************************************************8
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
			String s1=tf3.getText();
			String s="\t\t";
			String s2=tf4.getText();
		
			String s3=tf5.getText();
		
			String s4=tf6.getText();
		
			  
			myfile=new RandomAccessFile("f:\\TheInfomationOfTheVistors\\totalInformation.txt","rw");
			
			myfile.seek(myfile.length());
			myfile.writeBytes(s1+s+s2+s+s3+s+s4+s);
			myfile.close();
			}catch(IOException er){
				System.out.println("Error!");
			}


		if(e.getSource()==but1){
			BuildNewWindows bNewWin=new  BuildNewWindows();
			bNewWin.setSize(400,400);
			pack();
		}
		
		if(e.getSource()==but2){
			this.dispose();
		}
	}


		
}
	

 
