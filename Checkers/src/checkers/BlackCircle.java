package checkers;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BlackCircle extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.drawOval(0, 0, 20, 20);
		g.fillOval(0, 0, 20, 20);
	}
}
