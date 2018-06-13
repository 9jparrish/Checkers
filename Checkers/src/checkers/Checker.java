package checkers;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Checker extends JFrame implements ActionListener {

private JPanel checkerBoard = new JPanel();
private JPanel play = new JPanel();
private JButton letsPlay = new JButton("Lets play");
private JButton[][] spots = new JButton[8][8];
private boolean black = false;
private boolean black2 = true;
private boolean row = true;

public Checker() {
	super("Checker");
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	play.setLayout(new GridLayout(2,3));
	letsPlay.setBackground(Color.BLUE);
	letsPlay.setForeground(Color.BLUE);
	letsPlay.setOpaque(true);
	letsPlay.addActionListener(this);
	letsPlay.setActionCommand("letsplay");
	play.setAlignmentX(CENTER_ALIGNMENT);
	play.setAlignmentY(CENTER_ALIGNMENT);
	play.add(letsPlay);
	
	for(int i = 0; i < spots.length; i++ ) {
		if(i % 2 == 0) {
			row = true;
		} else {row = false;}
		for(int j = 0; j < spots[i].length; j++) {
			spots[i][j] = new JButton();
			
			if(row) {
			if(black) {
				spots[i][j].setBackground(Color.BLACK);
				black = false;
			} else {
				spots[i][j].setBackground(Color.WHITE);
				black = true;
			}
			} else {
				if(black2) {
					spots[i][j].setBackground(Color.BLACK);
					black2 = false;
				} else {
					spots[i][j].setBackground(Color.WHITE);
					black2 = true;
				}
			}
		
			spots[i][j].setBorderPainted(false);
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
