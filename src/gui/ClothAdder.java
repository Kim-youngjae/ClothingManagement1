package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClothAdder extends JPanel {
	
	WindowFrame frame;

	public ClothAdder(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelClothType = new JLabel("Cloth type:", JLabel.TRAILING);
		JTextField fieldClothType = new JTextField(10);
		labelClothType.setLabelFor(fieldClothType);

		panel.add(labelClothType);
		panel.add(fieldClothType);

		JLabel labelWhos = new JLabel("Who's Cloth:", JLabel.TRAILING);
		JTextField fieldWhos = new JTextField(10);
		labelWhos.setLabelFor(fieldWhos);

		panel.add(labelWhos);
		panel.add(fieldWhos);
		
		JLabel labelWeather = new JLabel("Which Weather:", JLabel.TRAILING);
		JTextField fieldWeather = new JTextField(10);
		labelWeather.setLabelFor(fieldWeather);

		panel.add(labelWeather);
		panel.add(fieldWeather);
		
		JLabel labelWarning = new JLabel("Warning:", JLabel.TRAILING);
		JTextField fieldWarning = new JTextField(10);
		labelWarning.setLabelFor(fieldWarning);

		panel.add(labelWarning);
		panel.add(fieldWarning);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6); // 그리드의 형태를 지정하여 주었습니다
		
		this.add(panel);
		this.setVisible(true);
		
		
		
		
	}

}
