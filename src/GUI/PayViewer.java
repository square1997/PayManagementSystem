package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PayManager;
import pay.PayInput;

public class PayViewer extends JPanel{
	
	WindowFrame frame;
	PayManager payManager;
	
	public PayViewer(WindowFrame frame, PayManager payManager) {
		this.frame = frame;
		this. payManager =  payManager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("일한 장소");
		model.addColumn("점포명");
		model.addColumn("일한 날짜");
		model.addColumn("시급");
		model.addColumn("일한 시간");
		model.addColumn("급여 수령 날짜");
		
		for(int i = 0; i < payManager.size(); i++) {
			Vector row = new Vector();
			PayInput pi = payManager.get(i);
			row.add(pi.getPayId());
			row.add(pi.getPlace());
			row.add(pi.getStoreAddress());
			row.add(pi.getWorkDay());
			row.add(pi.getT_pay());
			row.add(pi.getTime());
			row.add(pi.getDateOfPayment());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
