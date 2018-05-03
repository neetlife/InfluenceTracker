package com.distraction.it;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

import com.distraction.it.models.WaveModel;
import com.distraction.it.views.AtlasPanel;
import com.distraction.it.views.WavePanel;

public class InfluenceTracker {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new InfluenceTracker();
			}
		});
	}
	
	private AtlasPanel atlasPanel;
	private WavePanel wavePanel;
	
	public InfluenceTracker() {
		
		JFrame frame = new JFrame(Constants.TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpringLayout layout = new SpringLayout();
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(layout);
		
		atlasPanel = new AtlasPanel();
		contentPane.add(atlasPanel);
		
		
		DefaultListModel<WaveModel> listModel = new DefaultListModel<>();
		listModel.addElement(new WaveModel("wave 1"));
		listModel.addElement(new WaveModel("wave 2"));
		listModel.addElement(new WaveModel("wave 3"));
		wavePanel = new WavePanel(listModel);
		JScrollPane scroller = new JScrollPane(wavePanel);
		scroller.setPreferredSize(new Dimension(300, 300));
		contentPane.add(scroller);
		
		layout.putConstraint(SpringLayout.WEST, atlasPanel, 0, SpringLayout.WEST, frame);
		layout.putConstraint(SpringLayout.NORTH, atlasPanel, 0, SpringLayout.NORTH, frame);
		
		layout.putConstraint(SpringLayout.WEST, scroller, 0, SpringLayout.EAST, atlasPanel);
		layout.putConstraint(SpringLayout.NORTH, scroller, 0, SpringLayout.NORTH, frame);
		
		layout.putConstraint(SpringLayout.EAST, contentPane, 0, SpringLayout.EAST, scroller);
		layout.putConstraint(SpringLayout.SOUTH, contentPane, 0, SpringLayout.SOUTH, atlasPanel);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
