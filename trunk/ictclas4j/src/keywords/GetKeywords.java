package keywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.ictclas4j.bean.SegResult;
import org.ictclas4j.segment.*;

public class GetKeywords {
	/*
	 * 用于存入主体、行为、场景的数据结构。
	 */
	KeywordStruct keyword[] = new KeywordStruct[3];

	/*
	 * 初始化keyword
	 */
	public GetKeywords() {
		for (int i = 0; i < 3; i++) {
			keyword[i] = new KeywordStruct();
		}

	}

	/*
	 * 分词的最终结果,只允许同一个类调用。
	 */
	private String wordSegResult = null;
	/*
	 * 删除了标点符号后的字符数组。 并且，以二维数组存储了。 即 [][0]词 [][1]词性 [][2]标注是否为主体、行为、场景词
	 */

	/*
	 * 此处若写成： new String[65535][] 刚报错： Exception in thread "main"
	 * java.lang.NullPointerException at
	 * keywords.GetKeywords.deleteSymbols(GetKeywords.java:117) at
	 * keywords.GetKeywords.main(GetKeywords.java:136)
	 * 
	 * 
	 * 117： deletedSymbolResult[k][0]=temp[k].substring(0,temp[k].length()-1);
	 */
	private String deletedSymbolResult[][] = new String[65535][3];

	/*
	 * 文本的长度。
	 */
	int length = 0;

	/*
	 * 用于存放主体、行为、场景 keywords[0][0]:他 keywords[0][1]:看书-写代码 keywords[0][2]:教室
	 * 
	 * keywords[0][0]:他 keywords[0][1]:问问题-测试 keywords[0][2]:
	 */

	public String keywords[][] = new String[3][128];

	// private String
	/*
	 * 得到分词的最终结果。
	 */

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
					wordSegResult = seg_res.getFinalResult();
					return wordSegResult;

				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return line;
	}

	/*
	 * 过滤掉标点符号。 并且，用二维数组存储 词和词性。
	 */
	public void deleteSymbols() {
		/*
		 * 以空格切分
		 */
		String temp[] = new String[65535];
		/*
		 * 以斜杠切分
		 */
		// String slashSeg[]=new String[2];
		int j = 0;

		// GetKeywords key1=new GetKeywords();

		// Seperator type
		/*
		 * public static final String SEPERATOR_C_SENTENCE = "。！？：；…";
		 * 
		 * public static final String SEPERATOR_C_SUB_SENTENCE = "、，（）“”‘’";
		 * 
		 * public static final String SEPERATOR_E_SENTENCE = "!?:;";
		 * 
		 * public static final String SEPERATOR_E_SUB_SENTENCE = ",()\"'";
		 * 
		 * public static final String SEPERATOR_LINK = "\n\r 　";
		 */

		// System.out.println(wordSegResult);
		// String str1=getWordSegResult();
		// System.out.println(wordSegResult);
		String str1Array[] = wordSegResult.split("\\s");

		System.out.println("以空格为标准并去标点符号切分的结果：");

		for (int i = 0; i < str1Array.length; i++) {
			// System.out.println(str1Array[i]);
			// System.out.println(str1Array[i].charAt(0));

			if (str1Array[i].charAt(0) != '。') {
				temp[j] = str1Array[i];
				System.out.println(temp[j]);
				j++;

			}
			length = j;

		}
		System.out.println("\n以'/'为标准切分的结果：");
		for (int k = 0; k < length; k++) {
			// System.out.println(temp[k]);

			// System.out.println(temp[k].length());
			// String tempStr="我/r";
			// System.out.println(tempStr.subSequence(0, tempStr.length()-2));
			// System.out.println(tempStr.substring(tempStr.length()-1));
			// System.out.println(tempStr.substring(0,tempStr.length()-2));
			// System.out.println("temp[k].substring(0,temp[k].length()-2)"+temp[k].substring(0,temp[k].length()-2));
			// String a=temp[k].substring(0,temp[k].length()-2);
			// System.out.println("a"+a);
			// deletedSymbolResult[k][0]=a;
			// System.out.println("deletedSymbolResult[k][0]"+deletedSymbolResult[k][0]);

			String slashSeg[] = temp[k].split("/");
			deletedSymbolResult[k][0] = slashSeg[0];
			deletedSymbolResult[k][1] = slashSeg[1];
			// deletedSymbolResult2[k]=temp[k].split("\\");
			/*
			 * 取字/词
			 */
			System.out.print(k + deletedSymbolResult[k][0] + "	");
			/*
			 * 取字的词性
			 */
			System.out.println(deletedSymbolResult[k][1]);

			// deletedSymbolResult[k][0]=temp[k].substring(0,temp[k].length()-2);

			// deletedSymbolResult[k][1]=temp[k].charAt(temp[k].length()-1)+"";
			// deletedSymbolResult[k][1]=temp[k].substring(beginIndex)charAt(length-1)+"";
			// System.out.print(k+"0:"+deletedSymbolResult[k][0]+"		");
			// System.out.println(k+"1:"+deletedSymbolResult[k][1]);
		}

	}

	/*
	 * 由于类似"守门员/n"之类的主体，被简单地处理为了名词，不便于主体的提取，因此，下面的类，作为
	 * 词典的补充部分，在”关键词“提取处理之前，对分词作进一步的处理
	 * 
	 * 后期优化，可以考虑将这部分做在一个词典
	 */
	public void plusDictionary() {
		for (int i = 0; i < length; i++) {
			/*
			 * 守门员 /n
			 */
			if (deletedSymbolResult[i][0].equals("守门员")||deletedSymbolResult[i][0].equals("门将")) {
				deletedSymbolResult[i][1] = "nr";
			} else if (deletedSymbolResult[i][0].equals("抱")) {
				deletedSymbolResult[i][1] = "v";
			} else if (deletedSymbolResult[i][0].equals("黄牌警告")) {
				deletedSymbolResult[i][1] = "v";
			}
			/*
			 * 攻/v 门/j
			 */
			else if (deletedSymbolResult[i][1].equals("j")) {
				deletedSymbolResult[i][1] = "v";
			}
			/*
			 * Football中的身体部位
			 * 
			 * 可以简化程序，deletedSymbolResult[i][0]含有"脚"、"头"的，处理为一类特别的词性
			 */
			else if ((deletedSymbolResult[i][0].equals("左脚"))
					|| (deletedSymbolResult[i][0].equals("右脚"))
					|| (deletedSymbolResult[i][0].equals("头球"))
					/*
					 * 1任意球 n 把这放在身体部位里
					 */
					|| (deletedSymbolResult[i][1].equals("任意球"))) {
				/*
				 * bp--bodypart
				 */
				deletedSymbolResult[i][1] = "bp";
			}

			/*
			 * 得/u 分/v
			 */
			else if (deletedSymbolResult[i][1].equals("u")
					&& ((i + 1 < length) && (deletedSymbolResult[i + 1][1]
							.equals("v")))) {
				deletedSymbolResult[i][1] = "v";
			}
			/*
			 * pbei 介词“被” ictclas4j没有表现出来
			 */
			else if (deletedSymbolResult[i][0].equals("被")) {
				deletedSymbolResult[i][1] = "pbei";
			}
			/*
			 * 用/p 脚/n  用：pyong 防止被识别为scene
			 */
			else if (deletedSymbolResult[i][0].equals("用")) {
				deletedSymbolResult[i][1] = "pyong";
			}
			/*
			 * 双/m 拳击/n 出/v 
			 * 
			 * 既然是"双"，就只有可能是"手"了。
			 */
			else if (deletedSymbolResult[i][1].equals("m")&&(i+1<length)) {
				deletedSymbolResult[i+1][0] = deletedSymbolResult[i][0]+"手";
				deletedSymbolResult[i+1][1] = "bp";
			}
			/*
			 * 禁区/n 边缘/n 右/f 脚/n
			 * 
			 * 将边缘"方位化"
			 */
			else if (deletedSymbolResult[i][0].equals("边缘")) {
				deletedSymbolResult[i][1] = "f";
			}
			
		}

	}

	public String subject = "NO SUBJECT";
	/*
	 * 主体的个数
	 */
	public int subjectNo = 0;

	/*
	 * public void getSubject() {
	 * 
	 * System.out.println("\n主体：");
	 * 
	 * for (int i = 0; i < length; i++) { // if
	 * (deletedSymbolResult[i][1].equals("n") // 姚明/nr ||
	 * deletedSymbolResult[i][1].equals("nr") // 我/r ||
	 * deletedSymbolResult[i][1].equals("r")) { deletedSymbolResult[i][2] =
	 * "SUBJECT";
	 * 
	 * subject = deletedSymbolResult[i][0]; if (subjectNo == 0) {
	 * keywords[subjectNo++][0] = subject; } else { keywords[subjectNo++][0] +=
	 * '-' + subject; } System.out.println(subject); break; }
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * 将获取的主体插入到数据结构中
	 */
	public void insertSubject() {
		// System.out.println("\n主体：");

		for (int i = 0; i < length; i++) {
			//
			if (// deletedSymbolResult[i][1].equals("n")
			// 姚明/nr
			//
			deletedSymbolResult[i][1].equals("nr")
			// 我/r
					|| deletedSymbolResult[i][1].equals("r")
			/*
			 * 守门员/n 这个处理起来有点麻烦，暂时考虑出出一个补一个
			 */
			) {

				/*
				 * 获取主体
				 */
				keyword[subjectNo].setSubject(deletedSymbolResult[i][0]);

				subjectNo++;
				// deletedSymbolResult[i][2] = "SUBJECT";

				// subject = deletedSymbolResult[i][0];

				/*
				 * if(subjectNo==0){
				 * 
				 * keywords[subjectNo++][0]=subject; } else{
				 * keywords[subjectNo++][0]+='-'+subject; }
				 */
				// System.out.println(subject);
				// break;
			}

		}

	}

	/*
	 * 
	 * 
	 * 
	 * /* 某个主体的行为个数
	 */

	public int actionNo = 0;

	/*
	 * k是主体个数的游标
	 */
	public int k = -1;

	public void insertAction() {

		// System.out.println("\n行为：");
		/*
		 * 遍历以查找动词
		 */

		// for (int i = 0; i < length; i++) {
		int i = 0;
		/*********************************************************************
		 * k 不能多于主体的个数
		 * 
		 * 当遇到另外一个主体时，k++,表示切换主体
		 * *******************************************************************
		 */
		while ((i < length) && (k < subjectNo)) {
			if (deletedSymbolResult[i][1].equals("nr")
					|| deletedSymbolResult[i][1].equals("r")) {
				k++;
			}
			/*
			 * 吃饭/v
			 */
			// if(deletedSymbolResult[i][1].equals("vi")){
			/*
			 * ACTION表示[][3]是表示行为的词语。
			 */
			// deletedSymbolResult[i][2]="ACTION";
			// action=deletedSymbolResult[i][0];
			// System.out.println(action);
			// break;
			// }
			/*
			 * 奥尼尔投篮被他盖帽。
			 * 
			 * 主体不止一个，所以要区分主语和所属的行为
			 */

			/*
			 * 吃/v 苹果/n
			 */
			// else
			if (deletedSymbolResult[i][1].equals("v")
			/*
			 * 击/vg 地/n
			 */
			|| deletedSymbolResult[i][1].equals("vg")
			/*
			 * 传球/vn
			 */
			|| deletedSymbolResult[i][1].equals("vn")
			/*
			 * 抢/vd 到/v 篮板球/n
			 */
			|| deletedSymbolResult[i][1].equals("vd")) {

				// deletedSymbolResult[i][2] = "ACTION";
				/*
				 * ********************************************
				 * ********************************************** 这个地方可能有问题。
				 * 因为名词不一定只是n *******************************************
				 * ******************************************
				 */
				/*
				 * 当i=1时，为什么还会执行&&后面的语句？ 因为，deletedSymbolResult.length=65535！
				 */
				if (((i + 1) < length)
						&& ((deletedSymbolResult[i + 1][1].equals("n")
						/*
						 * 抢/vd 到/v 篮板球/n
						 */
						|| deletedSymbolResult[i + 1][1].equals("v")))) {
					if (((i + 2) < length)
							/*
							 * 射门/v 得/u 分/v -----------射门/v 得/v 分/v
							 */
							&& ((deletedSymbolResult[i + 2][1].equals("n")) || (deletedSymbolResult[i + 2][1]
									.equals("v")))) {

						keyword[k].setAction(actionNo,
								deletedSymbolResult[i][0]
										+ deletedSymbolResult[i + 1][0]
										+ deletedSymbolResult[i + 2][0]);

						i = i + 3;
						actionNo++;
					} else {
						// deletedSymbolResult[i + 1][2] = "ACTION";
						keyword[k].setAction(actionNo,
								deletedSymbolResult[i][0]
										+ deletedSymbolResult[i + 1][0]);
						i = i + 2;
						actionNo++;
					}
					// System.out.println(action);
					// break;
					// i=i+2;

				} else {
					keyword[k].setAction(actionNo, deletedSymbolResult[i][0]);
					// System.out.println(action);
					// break;

					/*
					 * 怎么写？
					 */
					i++;
					actionNo++;
				}
			} else {
				i++;
			}

		}

	}

	/*
	 * 获取主体行为发生的场景。
	 */

	/*
	 * 场景个数
	 */
	int sceneNo = 0;

	public void insertScene() {
		// System.out.println("\n场景：");

		for (int i = 0; i < length; i++) {
			/*
			 * 姚明在体育馆打篮球。 在 体育馆 n
			 */
			if ((i + 1 < length)
					/*
					 * 被/p 门将/n 得到/v   
					 * 
					 * 此时，不能误识
					 */
					&& (deletedSymbolResult[i][1].equals("p")) &&(!(deletedSymbolResult[i][1].equals("pbei"))&& (deletedSymbolResult[i + 1][1]
							.equals("n")
					// 在/p 中场/s
					// s 处所词
					|| (deletedSymbolResult[i + 1][1].equals("s"))))) {
				// deletedSymbolResult[i + 1][2] = "SCENE";
				keyword[sceneNo].setScene(deletedSymbolResult[i + 1][0]);
				sceneNo++;
				// System.out.println(scene);
				// break;

			}
			/*
			 * 
			 * 
			 * 小/a 禁区/n 内/f
			 */
			else if (deletedSymbolResult[i][1].equals("n")
					&& ((i + 1 < length) && (deletedSymbolResult[i + 1][1]
							.equals("f")
						
							
							))) {
				if ((i - 1 >= 0) && (deletedSymbolResult[i - 1][1].equals("a"))) {
					keyword[sceneNo].setScene(deletedSymbolResult[i - 1][0]
							+ deletedSymbolResult[i][0]
							+ deletedSymbolResult[i + 1][0]);
				}
				/*
				 * 禁区/n 内/f f 方位词
				 */
				else {
					keyword[sceneNo].setScene(deletedSymbolResult[i][0]
							+ deletedSymbolResult[i + 1][0]);
				}

			}
			/*
			 * 中/f 场/q
			 */
			else if (deletedSymbolResult[i][1].equals("f")
					&& ((i + 1 < length) && deletedSymbolResult[i + 1][1]
							.equals("q"))) {
				keyword[sceneNo].setScene(deletedSymbolResult[i][0]
						+ deletedSymbolResult[i + 1][0]);

			}
			

		}
		// System.out.println(scene);

	}

	/*
	 * 获取主体行为发生时所用的身体部位。
	 */

	/*
	 * 场景个数
	 */
	int bodyPartNo = 0;

	/*
	 * 主体个数的游标
	 */
	
	public void insertBodyPart() {
		k=-1;
		for (int i = 0; (i < length)&&(k<subjectNo); i++) {
			/*
			 * 禁区/n 内/f 左脚/n
			 */
			/*
			 * if (deletedSymbolResult[i][0].equals("左脚")) {
			 * keyword[bodyPartNo].setBodyPart(deletedSymbolResult[i][0]);
			 * 
			 * }
			 */
			if (deletedSymbolResult[i][1].equals("nr")
					|| deletedSymbolResult[i][1].equals("r")) {
				k++;
			}
			
			if (deletedSymbolResult[i][1].equals("bp")) {
				keyword[k].setBodyPart(deletedSymbolResult[i][0]);

			}
			/*
			 * 右/f 脚/n
			 */
			else if (deletedSymbolResult[i][1].equals("f")
					&& ((i + 1 < length) && deletedSymbolResult[i + 1][1]
							.equals("n"))) {
				keyword[k].setBodyPart(deletedSymbolResult[i][0]
						+ deletedSymbolResult[i + 1][0]);

			}
			/*
			 * 中场/n 右/f 脚/n
			 */
			else if (deletedSymbolResult[i][1].equals("pyong")) {
				keyword[k].setBodyPart(deletedSymbolResult[i+1][0]);

			}

		}
		// System.out.println(scene);

	}

	public static void main(String args[]) {
		System.out.println("文本输入样例：");
		System.out.println("1.姚明在体育馆打篮球");
		System.out.println("2.我踢足球");
		System.out.println("3.他在中场传球射门。");
		System.out.println("4.范尼斯特鲁伊禁区内右脚射门");
		System.out.println("5.何塞·保罗·格雷罗替换下托马斯·吕康");
		/*
		 * 在"关键词到知识表达集的映射"时，可以将"抱住"映射为"抱球"
		 */
		System.out.println("5.守门员将球死死抱住");
		System.out.println("5.何塞·保罗·格雷罗经过连续传球精密配合，丹尼·墨菲助攻西蒙·戴维斯破门得分");
		System.out.println("4.范尼斯特鲁伊小禁区内右脚射门");

		GetKeywords key = new GetKeywords();
		key.getWordSegResult();

		System.out.println("获取分词的最终结果:\n" + key.wordSegResult + "\n");

		key.deleteSymbols();

		key.plusDictionary();

		// key.getSubject();

		// key.getAction();

		// key.getScene();

		System.out
				.println("**********************************************************************\n**********************************************************************");
		key.insertSubject();
		key.insertAction();
		key.insertScene();
		key.insertBodyPart();
		/*
		 * 本来应该是每个主体对对应其自己的行为、场景和身体部位，这是不恰当的！
		 * 
		 * 但是
		 * 
		 * 突然发现，这样写，恰恰表现了动作的时间性
		 * 
		 * 如 主体0:何塞·保罗·格雷罗 行为0-0:传球 行为0-1:配合 行为0-2:null 行为0-3:null 场景0:null
		 * 身体部位0:null
		 * 
		 * 主体1:丹尼·墨菲 行为1-0:null 行为1-1:null 行为1-2:助攻 行为1-3:null 场景1:null
		 * 身体部位1:null
		 * 
		 * 主体2:西蒙·戴维斯 行为2-0:null 行为2-1:null 行为2-2:null 行为2-3:破门得分 场景2:null
		 * 身体部位2:null
		 * 
		 * 0-0:传球 0-1:配合 1-2:助攻 2-3:破门得分
		 */
		for (int i = 0; i < key.subjectNo; i++) {
			System.out.println("主体" + i + ":" + key.keyword[i].getSubject());
			for (int j = 0; j < key.actionNo; j++) {
				System.out.println("行为" + i + "-" + j + ":"
						+ key.keyword[i].getAction(j));
			}
			System.out.println("场景" + i + ":" + key.keyword[i].getScene());
			System.out.println("身体部位" + i + ":" + key.keyword[i].getBodyPart());
			System.out.println();

		}

	}

}
