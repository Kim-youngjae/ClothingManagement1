package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClothingViewer extends JFrame {

	public ClothingViewer() {
		DefaultTableModel model =  new DefaultTableModel();
		model.addColumn("ClothType");
		model.addColumn("Who's Cloth");
		model.addColumn("Weather to wear");
		model.addColumn("Warning");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
