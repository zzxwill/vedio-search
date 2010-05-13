package graphicsInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import keywords.GetKeywords;

public class OutputVedio3{
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	
	


	public void layout() {
		
//		setMyLookAndFeel();
		JFrame jf = new JFrame("面向视频场景内容检索的文本解析工具");
		jf.setSize(WIDTH, HEIGHT);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPanel=new JPanel();
		jf.setContentPane(contentPanel);



		JButton search = new JButton("搜索视频");
		JLabel note = new JLabel(" 请输入视频检索文本");
		JTextField text = new JTextField(25);
		JLabel nullNote = new JLabel(" ");
		
		JButton search1 = new JButton("搜索视频");
		JButton search2 = new JButton("搜索视频");
		JButton search3 = new JButton("搜索视频");

		
		jf.setLayout(new BorderLayout(30,13));

		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
	p1.setVisible(true);
		p2.setVisible(true);
		p1.setLayout(new BorderLayout(1,4));
		p2.setLayout(new BorderLayout(1,1));
		
		
		contentPanel.add(p1,"North");
		contentPanel.add(p2,"South");

		p1.add(note,"North");
		p1.add(search,"East");
		p1.add(nullNote,"West");
		p1.add(text,"Center");
		
		
		p2.add(search1,"North");
		p2.add(search2,"East");
		p2.add(search3,"South");
		
		jf.show();
		
//	jf.pack();
		

		

		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
//				inputText = text.getText();
//				System.out.println("用户输入的视频检索文本是：" + inputText);
				GetKeywords key=new GetKeywords();
			//	try {
//					key.getKeywordsMain4GUI(inputText);
		//		} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
				
				/*
				 * 显示输出的结果
				 */
//				JOptionPane.showMessageDialog(null, "OK");
				new OutputVedio2();
			

			}
		});
//		return inputText;
	}
	
	private void setMyLookAndFeel() {
	      try {
	          

	     //设置windows风格的look and feel
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	         

	          Font font = new Font("宋体", Font.PLAIN, 18);//字体为宋体，样式为常规，字号12
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

	public static void main(String args[]){
		OutputVedio3 l=new OutputVedio3();
		l.layout();
	}
}

