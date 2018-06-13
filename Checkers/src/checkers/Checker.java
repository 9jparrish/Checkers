package checkers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Checker extends JFrame implements ActionListener {

private JPanel checkerBoard = new JPanel();
private JPanel play = new JPanel();
private JButton letsPlay = new JButton("Lets play");
private JButton[][] spots = new JButton[8][8];

public Checker() {
	super("Checker");
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	play.setLayout(new GridLayout(2,3));
	letsPlay.addActionListener(this);
	letsPlay.setActionCommand("letsplay");
	play.add(letsPlay);
	
	for(int i = 0; i < spots.length; i++ ) {
		for(int j = 0; j < spots[i].length; j++) {
			spots[i][j] = new JButton("hi");
			spots[i][j].setOpaque(true);
			checkerBoard.add(spots[i][j]);
		}
	}
	add(play);
	setVisible(true);
}


public void Checkerboard() {
	checkerBoard.setLayout(new GridLayout(8,8));
	add(checkerBoard);
	play.setVisible(false);
	setVisible(true);
}

public static void main(String[] args) {
	new Checker();
}


@Override
public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	
	if(command.equals("letsplay")) {
		Checkerboard();
	}
	
}

	
}
