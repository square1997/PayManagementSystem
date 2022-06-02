package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PayViewer extends JFrame{
	
	public PayViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("업종");
		model.addColumn("일한 장소");
		model.addColumn("점포명");
		model.addColumn("일한 날짜");
		model.addColumn("시급");
		model.addColumn("일한 시간");
		model.addColumn("급여 수령 날짜");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(1000, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
