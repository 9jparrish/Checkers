package checkers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Checker extends JFrame implements ActionListener {
private JPanel a = new JPanel();
private JButton[][] spots = new JButton[8][8];

public Checker() {
	super("Checker");
	a.setLayout(new GridLayout(8,8));
	a.setVisible(true);
	add(a);
	setVisible(true);
	
	
	for(int i = 0; i < spots.length; i++ ) {
		for(int j = 0; j < spots[i].length; j++) {
			spots[i][j] = new JButton("hi");
		}
	}
	
}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
