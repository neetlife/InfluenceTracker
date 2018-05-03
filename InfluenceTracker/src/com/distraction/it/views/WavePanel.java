package com.distraction.it.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import com.distraction.it.Constants;
import com.distraction.it.models.WaveModel;

@SuppressWarnings("serial")
public class WavePanel extends JList<WaveModel> {
	
	private Point point = new Point();
	private int highlightedIndex = -1;
	
	public WavePanel(DefaultListModel<WaveModel> listModel) {
		super(listModel);
		
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setLayoutOrientation(JList.VERTICAL);
		setCellRenderer(new WaveItem(""));
		setFocusable(true);
		
		addMouseListener(mouseAdapter);
		addMouseMotionListener(mouseAdapter);
	}
	
	@Override
	public int locationToIndex(Point location) {
		int index = super.locationToIndex(location);
		if (index != -1 && !getCellBounds(index, index).contains(location)) {
			return -1;
		}
		return index;
	}
	
	private MouseAdapter mouseAdapter = new MouseAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			point.setLocation(e.getX(), e.getY());
			if (contains(point)) {
				highlightedIndex = locationToIndex(point);
			} else {
				highlightedIndex = -1;
			}
			repaint();
		}
		@Override
		public void mouseExited(MouseEvent e) {
			highlightedIndex = -1;
			System.out.println("out");
			repaint();
		}
	};
	
	class WaveItem extends JPanel implements ListCellRenderer<WaveModel> {
		
		private JTextArea textArea;
		private Divider divider;
		
		public WaveItem(String text) {
			textArea = new JTextArea(text);
			textArea.setEditable(false);
			textArea.setBorder(new EmptyBorder(10, 10, 10, 10));
			
			setLayout(new BorderLayout());
			add(textArea, BorderLayout.CENTER);
			
			divider = new Divider();
			add(divider, BorderLayout.PAGE_END);
		}
		
		@Override
		public Component getListCellRendererComponent(
				JList<? extends WaveModel> list,
				WaveModel value,
				int index,
				boolean isSelected,
				boolean cellHasFocus) {
			
			textArea.setText(value.getTitle());
			
			if (isSelected) {
				textArea.setBackground(Constants.Colors.BG_ITEM_SELECTED);
				textArea.setForeground(Color.WHITE);
			} else if (highlightedIndex == index) {
				textArea.setBackground(Constants.Colors.BG_ITEM_HIGHLIGHTED);
				textArea.setForeground(Color.BLACK);
			} else {
				textArea.setBackground(Color.WHITE);
				textArea.setForeground(Color.BLACK);
			}
			
			return this;
		}
		
	}
	
}
