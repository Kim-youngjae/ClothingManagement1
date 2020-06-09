package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {

	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); // 기본이 flowlayout으로 되있음
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("add cloth");
		JButton button2 = new JButton("view clothes");
		JButton button3 = new JButton("edit cloth");
		JButton button4 = new JButton("delete cloth");
		JButton button5 = new JButton("exit");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		
		
//		this.setContentPane(panel); // 패널을 프레임에 넣어주면 전체frame이 panel로 설정된다

		
	}

}
