package com.distraction.it.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.distraction.it.Constants;
import com.distraction.it.Utils;

@SuppressWarnings("serial")
public class AtlasPanel extends JPanel {
	
	private static final int MAX_WHEEL_SCROLL_INDEX = 1;
	private static final int MIN_WHEEL_SCROLL_INDEX = -2;
	
	private BufferedImage image;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private boolean dragging;
	
	private float zoomFactor;
	private int wheelScrollIndex = -2;
	
	public AtlasPanel() {
		setPreferredSize(new Dimension(600, 600));
		
		image = null;
		try {
			image = ImageIO.read(getClass().getResourceAsStream(Constants.PATH_ATLAS));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		addMouseListener(mouseAdapter);
		addMouseMotionListener(mouseAdapter);
		addMouseWheelListener(mouseAdapter);
		
		zoomFactor = (float) Math.pow(2, wheelScrollIndex - 1);
	}
	
	@Override
	protected void paintComponent(Graphics gg) {
		super.paintComponent(gg);
		
		Graphics2D g = (Graphics2D) gg;
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.translate(x, y);
		g.scale(zoomFactor, zoomFactor);
		g.drawImage(image, 0, 0, null);
		g.scale(1, 1);
		g.translate(-x, -y);
	}
	
	private void clampPosition() {
		x = Utils.clamp(x, (int) (-image.getWidth() * zoomFactor + getWidth()), 0);
		y = Utils.clamp(y, (int) (-image.getHeight() * zoomFactor + getHeight()), 0);
		System.out.println("zoom factor: " + zoomFactor);
		System.out.println("image height: " + image.getHeight() + ", height: " + getHeight());
		System.out.println("image height scaled: " + (image.getHeight() * zoomFactor));
		System.out.println("min y: " + (-image.getHeight() * zoomFactor + getHeight()));
		System.out.println("current y: " + y);
		System.out.println("========================");
	}
	
	private MouseAdapter mouseAdapter = new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			if (contains(e.getPoint())) {
				dx = e.getLocationOnScreen().x - x;
				dy = e.getLocationOnScreen().y - y;
				dragging = true;
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			if (dragging) {
				x = e.getLocationOnScreen().x - dx;
				y = e.getLocationOnScreen().y - dy;
				dx = e.getLocationOnScreen().x - x;
				dy = e.getLocationOnScreen().y - y;
				clampPosition();
				repaint();
			}
		}
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			wheelScrollIndex += -e.getWheelRotation();
			wheelScrollIndex = Utils.clamp(wheelScrollIndex, MIN_WHEEL_SCROLL_INDEX, MAX_WHEEL_SCROLL_INDEX);
			zoomFactor = (float) Math.pow(2, wheelScrollIndex - 1);
			clampPosition();
			repaint();
		}
	};
	
}
