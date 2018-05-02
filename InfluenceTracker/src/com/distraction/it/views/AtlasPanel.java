package com.distraction.it.views;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.distraction.it.Constants;

public class AtlasPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private BufferedImage image;
	
	public AtlasPanel() {
		setPreferredSize(new Dimension(600, 600));
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream(Constants.PATH_ATLAS));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(image, 0, 0, null);
	}
	
}
