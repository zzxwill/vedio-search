import org.ictclas4j.bean.SegResult;
import org.ictclas4j.segment.SegTag;

public class OneMain{

	public static void main(String[] args) {

		System.out.println("This is OneMain");

		SegTag st = new SegTag(1);

		SegResult sr = st.split("经过一上午的摸索和测试，我终于配好了开发环境。");

		System.out.println(sr.getFinalResult());

	}

}

