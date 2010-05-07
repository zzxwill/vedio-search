package test;
public class B {
	A[] a=new A[2];
	public B(){
		a[0] = new A();
	}

	public void operate(){
		a[0].setSubject("subject-0");
		a[0].setAction(0, "action-0");
		a[0].setAction(1, "action-1");

		
	}
	
	public static void main(String args[]){
		B b=new B();
		b.operate();
		System.out.println(b.a[0].getSubject());
		System.out.println(b.a[0].getAction(0));
		System.out.println(b.a[0].getAction(1));

	}
	
	
//	equ[] Equ = new equ[1024];
}
