package graphicsInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import keywords.GetKeywords;

public class SegAndKeywords extends JPanel {
	static final int WIDTH = 500;
	static final int HEIGHT = 300;
	JFrame textInputFrame;
	String inputText;

	public void add(Component c, GridBagConstraints constraints, int x, int y,
			int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);

	}

	public SegAndKeywords() throws FileNotFoundException {
		textInputFrame = new JFrame("面向视频场景内容检索的文本解析工具");
		textInputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		textInputFrame.add(this, BorderLayout.NORTH);
		textInputFrame.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		textInputFrame.setLocation(x, y);

		JButton search = new JButton("继续");
		JLabel note1 = new JLabel("请输入视频检索文本");
		JTextField text = new JTextField(36);
		JLabel nullNote = new JLabel("");

		// textInputFrame.setLayout(new BorderLayout(30,13));

		JPanel p1 = new JPanel();

		/*
		 * 放置分词和关键词提取 显示结果
		 */
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		// System.out.println();

		p1.setLayout(new BorderLayout(1, 1));
		p2.setLayout(new BorderLayout(0, 0));
		p3.setLayout(new BorderLayout(0, 0));
		p1.setVisible(true);
		p2.setVisible(true);
		p3.setVisible(true);
		p1.add(note1, "North");
		p1.add(search, "East");
//		p1.add(nullNote, "West");
		p1.add(text, "Center");
		p1.add(nullNote, "South");


		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		// add(note1, constraints, 0, 1, 1, 1);
		// add(text, constraints, 0, 2, 1, 1);
		// add(search, constraints, 1, 2, 1, 1);

		/*
		 * System.out.println("获取分词的最终结果:\n" +wordSegResult + "\n");
		 */
		// System.out.println("获取分词的最终结果:\n" +wordSegResult + "\n");
		GetKeywords key = new GetKeywords();
		key.getKeywordsMain4GUI("马克思威尔禁区内右脚射门");
		String str1 =null;
		JLabel none = new JLabel(str1);
		JLabel segResult1 = new JLabel("分词结果:");
		JLabel segResult2 = new JLabel("马克思威尔/nr 禁区/n 内/f 右/f 射门/v ");

		JLabel keyResult1 = new JLabel("关键词分析结果:\n");
		JLabel keyResult2 = new JLabel("运动员：马克思威尔");
		JLabel keyResult3 = new JLabel("球场区域-禁区：禁区内");
		JLabel keyResult5 = new JLabel("身体部位-右脚：右脚");

		JLabel keyResult4 = new JLabel("动作-其他球员动作-射门：射门");

		p2.add(segResult1, "North");
		p2.add(segResult2, "West");

		p3.add(keyResult1, "North");
		p3.add(keyResult2, "West");
		p3.add(keyResult3, "Center");
		p3.add(keyResult4, "East");

		add(p1, constraints, 0, 0, 1, 1);
	
		

//		add(note1, constraints, 1, 1, 1, 1);
//		add(text, constraints, 1, 2, 1, 1);
//		add(search,constraints, 2, 2, 1, 1);
		
		
		

		
//		add(none, constraints, 1, 9, 1, 1);

		add(segResult1, constraints, 1, 10, 1, 1);
		

		add(segResult2, constraints, 1, 11, 1, 1);


//		add(p2, constraints, 1, 6, 1, 1);
	

		add(keyResult1, constraints, 1, 20, 1, 1);
		add(keyResult2, constraints, 1, 21, 1, 1);

		add(keyResult3, constraints, 1, 22, 1, 1);

		add(keyResult4, constraints, 1, 23, 1, 1);
		add(keyResult5, constraints, 1, 24, 1, 1);

		// add(p3, constraints, 0, 3, 0, 1);

		// add(segResult1,constraints, 0, 1, 0, 1);
		// add(segResult2,constraints, 0, 2, 0, 1);

		// textInputFrame.setVisible(false);
		textInputFrame.setVisible(true);

		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// inputText = text.getText();
				// System.out.println("用户输入的视频检索文本是：" + inputText);

				// try {
				// key.getKeywordsMain4GUI(inputText);
				// } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				// }

				/*
				 * 显示输出的结果
				 */
				// JOptionPane.showMessageDialog(null, "OK");
				new OutputVedio2();
				// new OutputVedio2();

			}
		});

	}
}

// public class OutputVedio {
// public static void main(String args[]) {
// new ShowVedio();

// }

// }
