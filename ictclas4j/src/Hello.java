
public class Hello {
	public static void main(String args[]){
		String str[]={"∂¡ È/v"};
		
		System.out.println(str[0].charAt(str[0].length()-1));
		
		String str2="∂¡ È/v";
		System.out.println(str2.charAt(str2.length()-1));
		System.out.println(str2.substring(0,str2.length()-1));

		
		
	}
}
