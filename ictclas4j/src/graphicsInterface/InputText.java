package graphicsInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.*;

import keywords.GetKeywords;

class Interface extends JPanel {
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
		add(c,constraints);

	}

	public String interfaceSet() {
		setMyLookAndFeel();
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

		JButton search = new JButton("搜索视频");
//		Icon icon=new Icon("C:\\img\\2.jpg");
//		JButton search = new JButton(new ImageIcon("C:\\img\\3.jpg"));
		
		JLabel note = new JLabel("请输入视频检索文本");
		final JTextField text = new JTextField(30);

		GridBagConstraints constraints = new GridBagConstraints();
		/*
		 * 用于放检索的结果的
		 */
		JPanel vedioPanel = new JPanel();
		
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST;
		constraints.weightx=3;
		constraints.weighty=4;
		add(note, constraints, 0, 0, 1, 1);
		add(text, constraints, 0, 1, 1, 1);
		add(search, constraints, 3, 1, 1, 1);
		add(vedioPanel, constraints, 0, 3, 40, 3);

		textInputFrame.setVisible(false);
		textInputFrame.setVisible(true);

		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				inputText = text.getText();
				System.out.println("用户输入的视频检索文本是：" + inputText);
				GetKeywords key=new GetKeywords();
				try {
					key.getKeywordsMain4GUI(inputText);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				/*
				 * 显示输出的结果
				 */
//				JOptionPane.showMessageDialog(null, "OK");
				new OutputVedio();
			

			}
		});
		return inputText;
	}
	
	private void setMyLookAndFeel() {
	      try {
	          

	     //设置windows风格的look and feel
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	         

	          Font font = new Font("宋体", Font.PLAIN, 24);//字体为宋体，样式为常规，字号12
	          UIManager.put("MenuBar.font", font);
	          UIManager.put("MenuItem.font", font);
	          UIManager.put("Menu.font", font);
	          UIManager.put("PopupMenu.font", font);
	          UIManager.put("ToolBar.font", font);
	          UIManager.put("ToolTip.font", font);
	          UIManager.put("TabbedPane.font", font);
	          UIManager.put("Label.font", font);
	          UIManager.put("List.font", font);
	          UIManager.put("ComboBox.font", font);
	          UIManager.put("Button.font", font);
	          UIManager.put("Table.font", font);
	          UIManager.put("TableHeader.font", font);
	          UIManager.put("Tree.font", font);
	          UIManager.put("TextField.font", font);
	          UIManager.put("TextArea.font", font);
	          UIManager.put("TitledBorder.font", font);
	          UIManager.put("OptionPane.font", font);
	          UIManager.put("RadioButton.font", font);
	          UIManager.put("CheckBox.font", font);
	          UIManager.put("ToggleButton.font", font);
	          UIManager.put("Dialog.font", font);
	          UIManager.put("Panel.font", font);
	      }catch (Exception e) {
	          e.printStackTrace();
	      }
	  }


}

public class InputText {
	public static void main(String args[]){
		
		Interface face=new Interface();
		
		face.interfaceSet();

	}

}
