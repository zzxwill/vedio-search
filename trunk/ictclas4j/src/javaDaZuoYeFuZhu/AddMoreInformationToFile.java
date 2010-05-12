package javaDaZuoYeFuZhu;

//输出字符串到一个文件而不覆盖原文件的内容（追加）
import java.io.*;
class AddMoreInformationToFile 
{
//	AddMoreInformationToFile amitf=new AddMoreInformationToFile();
 public static void main(String[] args) 
 {
	 AddMoreInformationToFile.dataToFile();
 }
 
 static void dataToFile(){
	 File f=new File("f:\\TheInfomationOfTheVistors\\login.txt");
	  BufferedWriter out=null;
	  try
	  {
	   if (!f.exists())
	   {
	    f.createNewFile();//如果out.txt不存在，则创建一个新文件
	   }
	   out = new BufferedWriter(new FileWriter(f,true));//参数true表示将输出追加到文件内容的末尾而不覆盖原来的内容
	   out.newLine(); //换行
	   out.write("这是第一行");
	   out.newLine(); //换行
	   out.write("这是第二行");
	   out.newLine();
	  }
	  catch (IOException e)
	  {
	   e.printStackTrace();
	  }
	  finally {
	   try
	   {
	    if (out!=null)
	    {
	     out.close();
	    }
	   }
	   catch (IOException e)
	   {
	    e.printStackTrace();
	   }
	  }
 }
}

