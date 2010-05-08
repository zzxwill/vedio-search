package keywords;

public class KeywordStruct {
	public String subject;
	public String action[]=new String[127];
	public String scene;
	/*
	 * 增加身体部位
	 *
	 */
	public String bodyPart;
	
	
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
	
	public String getScene() {
		return scene;
	}
	
	public void setScene(String scene) {
		this.scene = scene;
	}
	
	public String getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	
	

}
