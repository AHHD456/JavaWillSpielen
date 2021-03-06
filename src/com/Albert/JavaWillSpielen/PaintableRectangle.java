package com.Albert.JavaWillSpielen;

import java.awt.Color;
import java.awt.Graphics;

public class PaintableRectangle extends SimpleRectangle implements Paintable{

	public PaintableRectangle (double width, double height, double x, double y, Color color) {
		super (width, height, x,y, color);
	}

	public void paintTo(Graphics g) {
		g.setColor(color);
		g.fillRect((int) pos.x, (int) pos.y, (int) width, (int) height);
	} 
}
