package com.Albert.JavaWillSpielen;

import java.awt.Color;

public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;
	public Color color;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}

	public GeometricObject(double width, double height, Vertex pos, Color color) {
		this.height = height;
		this.pos = pos;
		this.width = width;
		this.color = color;

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}

		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}
	}

	

	
	public GeometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0), Color.red);
	}

	public GeometricObject(double w) {
		this(w, w);
	}
	
	public GeometricObject() {
		this(10);
	}
	
	public GeometricObject(Vertex pos) {
		this(0,0,pos, new Color(0,0,0));
	}

	public String toString() {
		return "width " + width + " | " + "Height " + height + " | " + "pos " + pos;
	}

	public double circumference() {
		return 2 * (width + height);
	}

	public double area() {
		return width * height;
	}

	public boolean contains(Vertex v) {
		return v.x >= pos.x 
				&& v.x <= pos.x + width 
				&& v.y >= pos.y 
				&& v.y <= pos.y + height;
	}

	public boolean isLargerThan(GeometricObject that) {
		return this.area() > that.area();
	}

	public void moveTo(Vertex pos) {
		this.pos = pos;
	}

	public void moveTo(double x, double y) {
		moveTo(new Vertex(x, y));
	}

	public void move(Vertex v) {
		moveTo(pos.add(v));
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof GeometricObject) {
			GeometricObject that = (GeometricObject) thatObject;
			return that.width == this.width
					&& this.height == that.height 
					&& this.pos.equals(that.pos);
		}
		return false;
	}

	
}
