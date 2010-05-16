/**
 * TF-IDF算法实现，用于确定主体、行为、场景和身体部位对于视频检索的作用
 */
package tfidf;

import java.io.FileNotFoundException;
import java.io.IOException;

import keywords.GetKeywords;

public class WordFrequency {

	private static final int ITEMNO = 65535;
	/*
	 * 四类词
	 */
	//
	// int allSpecificWord[] = new int[4];
	double tf[] = new double[4];
	double idf[] = new double[4];
	int frequency[] = new int[4];

	/*
	 * 包含词i的句子数
	 */
	int sentenceWithWord[] = new int[4];
	//	
	/*
	 * 词j
	 */

	/*
	 * 句子总数--文档中总行数
	 */
	int allSentences = 0;

	/*
	 * 
	 */

	/*
	 * 初始化
	 */
	public WordFrequency() {
		for (int i = 0; i < 4; i++) {

			sentenceWithWord[i] = 0;
		}
	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws FileNotFoundException 
	 */
	
	public void countWordFrequency() throws FileNotFoundException{
		GetKeywords keywords = new GetKeywords();
		/*
		 * 运行keywords.GetKeywords提供的分词和关键词提取模块
		 */
		Item item[]=keywords.getKeywordsMain4IFIDF();

//		System.out.print("item[0].getSubjectNo()"+item[0].getSubjectNo());
		for (int i = 0; i < item[0].allSentencesNo; i++) {
			if (item[i].getSubjectNo() != 0) {
				sentenceWithWord[0] ++;
			}
			
			if (item[i].getActionNo() != 0) {
				sentenceWithWord[1] ++;
			}
			if (item[i].getSceneNo() != 0) {
				sentenceWithWord[2] ++;
			}
			if (item[i].getBodyPartNo() != 0) {
				sentenceWithWord[3] ++;
			}
			
		}
		/*
		 * 计算idf
		 */
		for (int j = 0; j < 4; j++) {
			idf[j] = Math.log((item[0].allSentencesNo) / sentenceWithWord[j]);
		}
	

	}
	
	
	/*
	 * 用于主算权重
	 * 
	 * keywordsNo
	 * 1--subject的权重
	 * 2--action的权重
	 * 3--
	 * 4--
	 * 
	 * 范尼斯特鲁伊禁区内射门
	 * 
	 * wordInSentence
	 * 词i（射门）在句子j中出现的次数------------------1
	 * 
	 * allWordInSentence
	 * 句子j中所有词的个数-----------------------------4
	 */
	public double countWordFrequency(int keywordsNo,int wordInSentence, int allWordInSentence) throws FileNotFoundException{
		GetKeywords keywords = new GetKeywords();
		/*
		 * 运行keywords.GetKeywords提供的分词和关键词提取模块
		 */
		Item item[]=keywords.getKeywordsMain4IFIDF();

//		System.out.print("item[0].getSubjectNo()"+item[0].getSubjectNo());
		for (int i = 0; i < item[0].allSentencesNo; i++) {
			if (item[i].getSubjectNo() != 0) {
				sentenceWithWord[0] ++;
			}
			
			if (item[i].getActionNo() != 0) {
				sentenceWithWord[1] ++;
			}
			if (item[i].getSceneNo() != 0) {
				sentenceWithWord[2] ++;
			}
			if (item[i].getBodyPartNo() != 0) {
				sentenceWithWord[3] ++;
			}
			
		}
		/*
		 * 计算idf
		 */
		for (int j = 0; j < 4; j++) {
			idf[j] = Math.log((item[0].allSentencesNo) / sentenceWithWord[j]);
		}
		/*
		 * w=tf*idf;
		 */
		return (wordInSentence/allWordInSentence)*idf[keywordsNo];

	}

	public static void main(String args[]) throws IOException {
		WordFrequency wordFrequency = new WordFrequency();

		wordFrequency.countWordFrequency();
		

		for (int k = 0; k < 4; k++) {
			System.out.println("sentenceWithWord[]:"+wordFrequency.sentenceWithWord[k]);
			
			System.out.println("idf[]:"+wordFrequency.idf[k]);
		}

	}

}
