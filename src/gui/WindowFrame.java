package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	MenuSelection menuselection;
	ClothAdder clothadder;
	ClothingViewer clothingviewer;

	public WindowFrame() {
		
		this.menuselection = new MenuSelection(this);
		this.clothadder = new ClothAdder(this);
		this.clothingviewer = new ClothingViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);
		
	}

	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public ClothAdder getClothadder() {
		return clothadder;
	}


	public void setClothadder(ClothAdder clothadder) {
		this.clothadder = clothadder;
	}


	public ClothingViewer getClothingviewer() {
		return clothingviewer;
	}


	public void setClothingviewer(ClothingViewer clothingviewer) {
		this.clothingviewer = clothingviewer;
	}

}
