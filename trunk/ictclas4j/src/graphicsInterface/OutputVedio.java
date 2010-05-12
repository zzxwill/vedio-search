package graphicsInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import keywords.GetKeywords;

public class OutputVedio extends JPanel {
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

	public OutputVedio() {
		textInputFrame = new JFrame("视频检索结果");
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

		JButton vedio1 = new JButton(new ImageIcon("C:\\img\\1.jpg"));
		JButton vedio2 = new JButton(new ImageIcon("C:\\img\\2.jpg"));
		JButton vedio3 = new JButton(new ImageIcon("C:\\img\\3.jpg"));
		// Icon icon=new Icon("C:\\img\\2.jpg");
		// JButton search = new JButton(new ImageIcon("C:\\img\\3.jpg"));

		JLabel note = new JLabel("视频检索结果，点击播放");

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		add(note, constraints, 0, 0, 2, 1);
		add(vedio1, constraints, 0, 1, 1, 1);
		add(vedio2, constraints, 2, 1, 1, 1);
		add(vedio3, constraints, 4, 1, 1, 1);

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
