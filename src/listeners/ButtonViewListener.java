package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.PayViewer;
import GUI.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PayViewer viewer = frame.getPayViewer();
		frame.setupPanel(viewer);
	}

}
