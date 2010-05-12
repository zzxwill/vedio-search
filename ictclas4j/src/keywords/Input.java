/**
 * 
 */
package keywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.ictclas4j.bean.SegResult;
import org.ictclas4j.segment.SegTag;

/**
 * @author Administrator
 *
 */
public class Input {

	public String getWordSegResult() {

		SegTag segTag = new SegTag(1);

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				try {
					SegResult seg_res = segTag.split(line);
					/*
					 * 获取分词的最终结果。
					 */
					// key.wordSegResult=seg_res.getFinalResult();
					// System.out.println(seg_res.getFinalResult());
//					wordSegResult = seg_res.getFinalResult();
//					return wordSegResult;

				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return line;
	}

}
