package graphicsInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import keywords.GetKeywords;

public class OutputVedio2 extends JPanel {
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

	public OutputVedio2() {
		textInputFrame = new JFrame("面向视频场景内容检索的文本解析工具");
		textInputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		textInputFrame.add(this, BorderLayout.WEST);
		textInputFrame.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		textInputFrame.setLocation(x, y);

		JButton vedio1 = new JButton(new ImageIcon("C:\\img\\9.jpg"));
		JButton vedio2 = new JButton(new ImageIcon("C:\\img\\11.jpg"));
		JButton vedio3 = new JButton(new ImageIcon("C:\\img\\10.jpg"));

		JButton vedio4 = new JButton(new ImageIcon("C:\\img\\12.jpg"));
		JButton vedio5 = new JButton(new ImageIcon("C:\\img\\13.jpg"));
		JButton vedio6 = new JButton(new ImageIcon("C:\\img\\1.jpg"));
		
		JButton vedio7 = new JButton(new ImageIcon("C:\\img\\3.jpg"));
		JButton vedio8 = new JButton(new ImageIcon("C:\\img\\8.jpg"));
		// Icon icon=new Icon("C:\\img\\2.jpg");
		// JButton search = new JButton(new ImageIcon("C:\\img\\3.jpg"));

		JLabel note = new JLabel("视频检索结果，点击播放");
		
		
		/*
		 * 文本输入界面
		 */
//		JPanel contentPanel=new JPanel();
//		textInputFrame.setContentPane(contentPanel);



		JButton search = new JButton("搜索视频");
		JLabel note1 = new JLabel(" 请输入视频检索文本");
		JTextField text = new JTextField(30);
		JLabel nullNote = new JLabel(" ");
		
	

		
//		textInputFrame.setLayout(new BorderLayout(30,13));

		
		JPanel p1=new JPanel();
		
		/*
		 * 放置分词和关键词提取 显示结果
		 */
//		JPanel p2=new JPanel();
//		System.out.println();
		

		
		p1.setLayout(new BorderLayout(1,4));

		p1.setVisible(true);
	
		p1.add(note1,"North");
		p1.add(search,"East");
		p1.add(nullNote,"West");
		p1.add(text,"Center");
		

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.weightx = 3;
		constraints.weighty = 4;
//		add(note1, constraints, 0, 1, 1, 1);
//		add(text, constraints, 0, 2, 1, 1);
//		add(search, constraints, 1, 2, 1, 1);
		
		
		add(p1, constraints, 0, 0, 0, 1);
		
//		add(SegResult1,constraints, 0, 9, 1, 1);
//		add(SegResult2,constraints, 0, 10, 1, 1);
		
		add(note, constraints, 0, 2, 2, 4);
		add(vedio1, constraints, 0, 6, 1, 1);
		add(vedio2, constraints, 1, 6, 1, 1);
		add(vedio3, constraints, 3, 6, 1, 1);
		add(vedio4, constraints, 0, 7, 1, 1);
		add(vedio5, constraints, 1, 7, 1, 1);
//		add(vedio6, constraints, 4, 7, 1, 1);
//		add(vedio7, constraints, 0, 8, 1, 1);
//		add(vedio8, constraints, 2, 8, 1, 1);
		
		
		

		textInputFrame.setVisible(false);
		textInputFrame.setVisible(true);

		vedio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Runtime ru = Runtime.getRuntime();
				try {

					String url = "F:\\Movie\\Precious\\面包房里的谋杀案.花絮.avi";
					String cmd = "F:\\AAA Previous E\\Program Files\\Tencent\\QQPlayer\\QQPlayer.exe "
							+ url;

					ru.exec(cmd);

				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		});

		vedio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Runtime ru = Runtime.getRuntime();
				try {

					String url = "F:\\Movie\\Precious\\商标的世界.Logorama.2009.avi";
					String cmd = "F:\\AAA Previous E\\Program Files\\Tencent\\QQPlayer\\QQPlayer.exe "
							+ url;

					ru.exec(cmd);

				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		});

		vedio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Runtime ru = Runtime.getRuntime();
				try {

					String url = "F:\\Movie\\Precious\\面包房里的谋杀案.花絮.avi";
					String cmd = "F:\\AAA Previous E\\Program Files\\Tencent\\QQPlayer\\QQPlayer.exe "
							+ url;

					ru.exec(cmd);

				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		});
	}

}

//public class OutputVedio {
//	public static void main(String args[]) {
//		new ShowVedio();

//	}

//}
