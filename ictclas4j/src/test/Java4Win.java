package test;

import java.io.*;
public class Java4Win {

private void run(){
   Runtime ru=Runtime.getRuntime();
     try {
         // 调用播放器文件播放指定MP3
        // Process p1 = ru.exec("C:\\Program Files\\Windows Media Player\\wmplayer D:\\rascal\\music\\mp3\\想太多.mp3");
        // 调用批处理文件
         //Process p2 = ru.exec("d:\\a.bat");

     //调用windows图片和传真查看器
  //     String cmd="rundll32.exe C:\\WINDOWS\\system32\\shimgvw.dll,ImageView_Fullscreen e:\\a.tif";

       /*
        * 
        */
    	 String url="F:\\Movie\\Precious\\面包房里的谋杀案.花絮.avi";
    	 String cmd="F:\\AAA Previous E\\Program Files\\Tencent\\QQPlayer\\QQPlayer.exe "+url;
       
     Process p2=ru.exec(cmd);

     } catch (IOException ex) {ex.printStackTrace();}
}
public static void main(String [] arg){
   Java4Win jw=new Java4Win();
   jw.run();
}

}

