package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PayViewer extends JFrame{
	
	public PayViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("����");
		model.addColumn("���� ���");
		model.addColumn("������");
		model.addColumn("���� ��¥");
		model.addColumn("�ñ�");
		model.addColumn("���� �ð�");
		model.addColumn("�޿� ���� ��¥");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(1000, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
