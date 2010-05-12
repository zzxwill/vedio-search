package javaDaZuoYeFuZhu;
import java.io.*;
public class WriteInfomationToFile {
	public static void main(String args[])throws Exception{
		
		
		
		String filePath="f:\\TheInfomationOfTheVistors\\login.txt";
		//新建指定路径的文件夹
		File myFile;
		
//		FileWriter myFileWriter;
//		PrintWriter myPrintWriter;
		
		myFile=new File(filePath);
		
		if(!myFile.exists()){
			try{
				myFile.createNewFile();
			}catch(IOException e){
				System.out.println("Creat new file failed!");
			}
			
			
		
		String strContent="Test ...OK!";
		
		byte buf[]=strContent.getBytes();
		FileOutputStream fos=new FileOutputStream
		("f:\\TheInfomationOfTheVistors\\login.txt");
		
		fos.write(buf);
		fos.close();
		
/*		try{
			myFileWriter=new FileWriter(myFile);
			myPrintWriter=new PrintWriter(myFileWriter);
			myPrintWriter=new PrintWriter(strContent);
			
			myPrintWriter.println(strContent);
			myFileWriter.close();
			
			
		}catch(IOException e){
			System.out.println("Creat new file writer or printer failed!");
		}
*/					
	}

}


}
