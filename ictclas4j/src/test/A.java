package test;

public class A {
	public String subject;
	public String action[]=new String[3];
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getAction(int i) {
		return action[i];
	}
	
	public void setAction(int i, String action) {
		this.action[i] = action;
	}
	
	
	

}
