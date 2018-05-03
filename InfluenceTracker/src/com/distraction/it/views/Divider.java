package com.distraction.it.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Divider extends JPanel {
	
	public Divider() {
		setPreferredSize(new Dimension(0, 1));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
}
