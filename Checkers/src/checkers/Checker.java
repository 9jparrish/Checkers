package checkers;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


import javax.swing.*;


public class Checker extends JFrame implements ActionListener {


JPanel play = new JPanel();
private JButton letsPlay = new JButton("Lets play");
private JButton[][] spots = new JButton[8][8];
private boolean black = false;
private boolean black2 = true;
private boolean row = true;
private int checkerSquareHeight;
private int checkerSquareWidth;

public Checker() {
	super("Checker");
	checkerboardUI();
}
//end of constructor

public void checkerboardUI() {
	add(new Checkerboard());
	add(new Checker());
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
				getContentPane().add(blackChecker);
				setVisible(true);
			} else {
				spots[i][j].setBackground(Color.WHITE);
				black = true;
			}
			} else {
				if(black2) {
					spots[i][j].setBackground(Color.BLACK);
					black2 = false;
					BlackCircle blackChecker = new BlackCircle();
					getContentPane().add(blackChecker);
					setVisible(true);
				} else {
					spots[i][j].setBackground(Color.WHITE);
					black2 = true;
				}
			}
		
			spots[i][j].setBorderPainted(false);
			spots[i][j].setOpaque(true);
			checkerSquareHeight = spots[i][j].getHeight();
			checkerSquareWidth = spots[i][j].getWidth();
			System.out.println(spots[i][j].getLocation());
			Checkerboard.add(spots[i][j]);
		}
	}
	add(play);
	setVisible(true);
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


