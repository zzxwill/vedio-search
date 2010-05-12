package javaDaZuoYeFuZhu;
import java.io.*;
public class BuildANewFileFolder {
	
	public static void main(String args[]){
		BuildANewFileFolder.newFileFolder();
	}
		
		
	
	static  void newFileFolder(){
	String filePath="F:\\TheInfomationOfTheVistors\\";
	//新建指定路径的文件夹
	File myFilePath=new File(filePath);
	
	if(!myFilePath.exists()){
		myFilePath.mkdirs();
		System.out.println("Successful in Build a new file folder!");
	}
	}


}
