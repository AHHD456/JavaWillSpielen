package com.Albert.JavaWillSpielen;

public interface GameObjects extends Movable, Paintable {
	
	
	
	double getWidth();
	double getHeight();
	Vertex getPos();
	 Vertex getDeltaPos();
	 void setDeltaPos(Vertex v);
	 boolean isLargerThan(GameObjects that);
	boolean isLeftOf(GameObjects that);
	 boolean isAbove(GameObjects that);
	 boolean touches(GameObjects that);
	

}
