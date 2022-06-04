package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PayManager;

public class WindowFrame extends JFrame{
	
	PayManager payManager;
	MenuSelection menuSelection;
	PayAdder payAdder;
	PayViewer payViewer; 
	
	
	public WindowFrame(PayManager payManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.payManager = payManager;	
		menuSelection = new MenuSelection(this);
		payAdder = new PayAdder(this);
		payViewer = new PayViewer(this, this.payManager); 
			
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public PayAdder getPayAdder() {
		return payAdder;
	}

	public void setPayAdder(PayAdder payAdder) {
		this.payAdder = payAdder;
	}

	public PayViewer getPayViewer() {
		return payViewer;
	}

	public void setPayViewer(PayViewer payViewer) {
		this.payViewer = payViewer;
	}

}
