/**
 * TF-IDF算法实现，用于确定主体、行为、场景和身体部位对于视频检索的作用
 */
package tfidf;

/**
 * @author Administrator
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import keywords.KeywordStruct;
import keywords.GetKeywords;
import org.ictclas4j.bean.SegResult;
import org.ictclas4j.segment.SegTag; 
public class WordFrequency {
	private static final int ITEMNO = 65535; 

	Item item[]=new Item[ITEMNO];
	/*
	 * 词j
	 */
	
	/*
	 * 句子总数--文档中总行数
	 */
	int allSentences=0;
	
	/*
	 * 
	 */
	
	/*
	 * 初始化
	 */
	public WordFrequency() {
		for (int i = 0; i < ITEMNO; i++) {
			item[i] = new Item();
		}

	}

	/**
	 * @param args
	 */
	
	
	public static void main(String args[]) throws IOException {
		WordFrequency frequency=new WordFrequency();
		GetKeywords keywords=new GetKeywords();
		/*
		 * 运行keywords.GetKeywords提供的分词和关键词提取模块
		 */
		keywords.getKeywordsMain();
	}

}





	

