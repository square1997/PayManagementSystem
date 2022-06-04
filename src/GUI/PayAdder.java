package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PayAdder extends JPanel{
	
	WindowFrame frame;
	
	public PayAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelId = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldId = new JTextField(10);
		labelId.setLabelFor(fieldId);
		panel.add(labelId);
		panel.add(fieldId);
		
		JLabel labelPlaceKind = new JLabel("업종 : ", JLabel.TRAILING);
		JTextField fieldPlaceKind = new JTextField(10);
		labelId.setLabelFor(fieldPlaceKind);
		panel.add(labelPlaceKind);
		panel.add(fieldPlaceKind);
		
		JLabel labelplace = new JLabel("일한장소 : ", JLabel.TRAILING);
		JTextField fieldPlace = new JTextField(10);
		labelId.setLabelFor(fieldPlace);
		panel.add(labelplace);
		panel.add(fieldPlace);
		
		JLabel labelstoreAddress = new JLabel("점포명 : ", JLabel.TRAILING);
		JTextField fieldstoreAddress = new JTextField(10);
		labelId.setLabelFor(fieldstoreAddress);
		panel.add(labelstoreAddress);
		panel.add(fieldstoreAddress);
		
		JLabel labelWorkDay = new JLabel("일한 날짜 : ", JLabel.TRAILING);
		JTextField fieldWorkDay = new JTextField(10);
		labelId.setLabelFor(fieldWorkDay);
		panel.add(labelWorkDay);
		panel.add(fieldWorkDay);
		
		JLabel labelHourlyWage = new JLabel("시급 : ", JLabel.TRAILING);
		JTextField fieldHourlyWage = new JTextField(10);
		labelId.setLabelFor(fieldHourlyWage);
		panel.add(labelHourlyWage);
		panel.add(fieldHourlyWage);
		
		JLabel labelTime = new JLabel("일한 시간 : ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelId.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		JLabel labelDateOfPayment = new JLabel("급여 수령 날짜 : ", JLabel.TRAILING);
		JTextField fieldDateOfPayment = new JTextField(10);
		labelId.setLabelFor(fieldDateOfPayment);
		panel.add(labelDateOfPayment);
		panel.add(fieldDateOfPayment);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cacel"));
		
		SpringUtilities.makeCompactGrid(panel, 9, 2, 6, 6, 6, 6);
		
	
		this.add(panel);
		this.setVisible(true);
		
		
	}
}
