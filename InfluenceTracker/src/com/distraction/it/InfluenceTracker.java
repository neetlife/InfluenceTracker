package com.distraction.it;

import javax.swing.JFrame;

import com.distraction.it.views.AtlasPanel;

public class InfluenceTracker {
	
	public static void main(String[] args) {
		new InfluenceTracker();
	}
	
	private AtlasPanel atlasPanel;
	
	public InfluenceTracker() {
		
		JFrame frame = new JFrame(Constants.TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		atlasPanel = new AtlasPanel();
		frame.add(atlasPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
