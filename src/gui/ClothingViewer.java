package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clothing.ClothInput;
import manager.ClothingManager;

public class ClothingViewer extends JPanel {
	
	WindowFrame frame;
	
	ClothingManager clothingManager;

	public ClothingViewer(WindowFrame frame, ClothingManager clothingManager) {
		
		this.frame = frame;
		this.clothingManager = clothingManager;
		
		System.out.println("***" + clothingManager.size() + "***");
		DefaultTableModel model =  new DefaultTableModel();
		model.addColumn("ClothType");
		model.addColumn("Who's Cloth");
		model.addColumn("Weather to wear");
		model.addColumn("Warning");
		
		for(int i = 0; i < clothingManager.size(); i++) {
			Vector row = new Vector();
			ClothInput cl = clothingManager.get(i);
			row.add(cl.getName());
			row.add(cl.getWhos());
			row.add(cl.getWeather());
			row.add(cl.getWarning());
			
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
