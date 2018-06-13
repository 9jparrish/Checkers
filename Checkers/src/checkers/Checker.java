package checkers;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


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
	checkerboardUI();
}
//end of constructor

public void checkerboardUI() {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	setSize(screenSize.width,screenSize.height);
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
				BlackCircle blackChecker = new BlackCircle();
				add(blackChecker);
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
	paint(null);
	add(play);
	setVisible(true);
}

public void paintComponent(Graphics g) {
	super.paint(g);
	for(int i = 0; i < spots.length; i++) {
		for(int j = 0; j < spots[i].length; j++) {
			//top 3 rows
			if(i < 3) {
				if(spots[i][j].getBackground().equals(Color.BLACK)) {
					BlackCircle blackChecker = new BlackCircle();
				}
			}	
		}
	}
}

public void Checkerboard() {
	checkerBoard.setLayout(new GridLayout(8,8));
	add(checkerBoard);
	play.setVisible(false);
	setVisible(true);
	JOptionPane messageToStart = new JOptionPane("Red goes first");
	messageToStart.showMessageDialog(null, "Red goes first");
}




@Override
public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	
	if(command.equals("letsplay")) {
		Checkerboard();
	}
	
}

//check if won
public void didWin() {
	
}

//see if it is a legal move
public void legalMove(JButton[][] spots) {
	
}



public static void main(String[] args) {
	new Checker();
}
	
}


