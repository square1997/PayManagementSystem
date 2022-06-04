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
		model.addColumn("���� ���");
		model.addColumn("������");
		model.addColumn("���� ��¥");
		model.addColumn("�ñ�");
		model.addColumn("���� �ð�");
		model.addColumn("�޿� ���� ��¥");
		
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
