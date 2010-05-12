package javaDaZuoYeFuZhu;
import java.io.*; 
public class ReadFile {
	public static void main(String args[])throws Exception{
		ReadFile.sex();
		ReadFile.infor();
		ReadFile.nation();
		
	}

public static void sex() throws Exception{
		BufferedReader readStream=new BufferedReader(new  FileReader("F:\\TheInfomationOfTheVistors\\login.txt"));
		int  nMan=0;
		int  nWoman=0;
		String age1;
		while((age1=readStream.readLine())!=null){
			if(age1.equals("A")){
				nMan++;
			}
			if(age1.equals("B")){
				nWoman++;
			}	
		}
		System.out.println("参观者中男人占总数比例为："+nMan*100/(nMan+nWoman)+"%");
		System.out.println("参观者中女人占总数比例为："+nWoman*100/(nMan+nWoman)+"%");
		
		if(nMan/nWoman>=3){
			System.out.println("此次展品比较受女性喜欢，可将产品的主要消费者定为女性");
			
		}
		else if(nWoman/nMan>=3){
			System.out.println("此次展品比较受男性喜欢，可将产品的主要消费者定为男性");
		}
		System.out.println("*************************************************************************************");
		
}	
	
public static void infor() throws Exception{
		BufferedReader readStream=new BufferedReader(new  FileReader("F:\\TheInfomationOfTheVistors\\VisitStyle.txt"));
		int  NumNations=0;
		int  NumThings=0;
		String inVisitStyle;
		while((inVisitStyle=readStream.readLine())!=null){
			if(inVisitStyle.equals("Nations")){
				NumNations++;
			}
			if(inVisitStyle.equals("Things")){
				NumThings++;
			}	
		}
		System.out.println("选择按国家分类方式参观的人数占总数比例为："+NumNations*100/(NumNations+NumThings)+"%");
		System.out.println("选择按物品种类参观的人数占总数比例为："+NumThings*100/(NumNations+NumThings)+"%");
		
		if(NumNations/NumThings>=3){
			System.out.println("北京国际展览中心应该选择以国家分类方式摆设展品较好！\t因为它符合大多数人的意愿");
			
		}
		else if(NumThings/NumNations>=3){
			System.out.println("北京国际展览中心应该选择以物品分类方式摆设展品较好！\t因为它符合大多数人的意愿");
		}
		System.out.println("*************************************************************************************");

	}
	
	






public static void nation() throws Exception{
	BufferedReader readStream=new BufferedReader(new  FileReader("F:\\TheInfomationOfTheVistors\\Nations.txt"));
	int nc=0;
	int nu=0;
	int ng=0;
	int nf=0;
	int na=0;
	int nh=0;
	int nca=0;
	int ni=0;
	int nb=0;
	int nj=0;
	
	String inVisitStyle;
	while((inVisitStyle=readStream.readLine())!=null){
		if(inVisitStyle.equals("China")){
			na++;
		}
		if(inVisitStyle.equals("USA")){
			nu++;
		}
		
		if(inVisitStyle.equals("Japan")){
			nj++;
		}
		if(inVisitStyle.equals("France")){
			nf++;
		}
		if(inVisitStyle.equals("Australia")){
			na++;
		}
		if(inVisitStyle.equals("German")){
			ng++;
		}
		if(inVisitStyle.equals("Candan")){
			nca++;
		}
		if(inVisitStyle.equals("Holand")){
			nh++;
		}
		if(inVisitStyle.equals("Belgium")){
			nb++;
		}
		if(inVisitStyle.equals("Italy")){
			ni++;
		}
		
		
	}
	System.out.println("参观者中的中国人占参观的人数占总数比例为："+nc*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的美国人占参观的人数占总数比例为："+nu*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的日本国人占参观的人数占总数比例为："+nj*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的法国人占参观的人数占总数比例为："+nf*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的德国人占参观的人数占总数比例为："+ng*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的荷兰国人占参观的人数占总数比例为："+nh*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的澳大利亚国人占参观的人数占总数比例为："+na*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的意大利人占参观的人数占总数比例为："+ni*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的加拿大人占参观的人数占总数比例为："+nca*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");
	System.out.println("参观者中的比利时人占参观的人数占总数比例为："+nb*100/(nc+na+nu+ni+nf+ng+nj+nca+nh+nb)+"%");

		

	System.out.println("*************************************************************************************");

}



}
