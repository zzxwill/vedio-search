package graphicsInterface;

import org.ictclas4j.bean.SegResult;

public class TextAnalyse {
	
	SegResult seg_res = segTag.split(line);
	/*
	 * 获取分词的最终结果。
	 */
	// key.wordSegResult=seg_res.getFinalResult();
	// System.out.println(seg_res.getFinalResult());
	wordSegResult = seg_res.getFinalResult();
	System.out.println("获取分词的最终结果:\n" +wordSegResult + "\n");

	deleteSymbols();

	plusDictionary();
	
	System.out
			.println("**********************************************************************\n**********************************************************************");
	insertSubject();
	insertAction();
	insertScene();
	insertBodyPart();
	for (int i = 0; i < subjectNo; i++) {
		System.out.println("主体" + i + ":" + keyword[i].getSubject());
		for (int j = 0; j < actionNo; j++) {
			System.out.println("行为" + i + "-" + j + ":"
					+ keyword[i].getAction(j));
		}
		System.out.println("场景" + i + ":" + keyword[i].getScene());
		System.out.println("身体部位" + i + ":" + keyword[i].getBodyPart());
		System.out.println();

	}

}
