/**
 * 主体、行为、场景和身体部位四个要素的个数表示
 */
package tfidf;

/**
 * @author Administrator
 * 
 */
public class Item {
	public int subjectNo = 0;
	public int actionNo = 0;
	public int sceneNo = 0;
	public int bodyPartNo = 0;
	/*
	 * 一个句子中，这四个成分的总个数
	 */
	public int sub_act_sce_bod_No = 0;
	
	/*
	 * 总的句子数
	 */
	public int allSentencesNo = 0;
	
	

	public int getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(int subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getActionNo() {
		return actionNo;
	}

	public void setActionNo(int actionNo) {
		this.actionNo = actionNo;
	}

	public int getSceneNo() {
		return sceneNo;
	}

	public void setSceneNo(int sceneNo) {
		this.sceneNo = sceneNo;
	}

	public int getBodyPartNo() {
		return bodyPartNo;
	}

	public void setBodyPartNo(int bodyPartNo) {
		this.bodyPartNo = bodyPartNo;
	}

	public int getSub_act_sce_bod_No() {
		return sub_act_sce_bod_No;
	}

	public void setSub_act_sce_bod_No(int sub_act_sce_bod_No) {
		this.sub_act_sce_bod_No = sub_act_sce_bod_No;
	}

}
