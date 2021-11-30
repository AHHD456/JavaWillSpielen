package com.Antonio.JavaWillSpielen;

import java.awt.Image;

public class MovableImage extends GeometricImage implements GameObjects
{
	Vertex deltaPos = new Vertex(0,0);
	 public Vertex getDeltaPos() {return deltaPos;}
	 public void setDeltaPos(Vertex v) {deltaPos=v;}
	 
	 public MovableImage(String name,double x,double y)
	 {
		  super(name,x,y);
		  }
     
public MovableImage(String name, double x,double y,double dX,double dY)
{
       super(name,x,y);
 
       deltaPos= new Vertex(dX,dY);
}
 public MovableImage(ImageIcon icon,double x,double y,double dX,double dY)
 {
     super(icon,x,y);
     deltaPos=new Vertex(dX,dY);
}
 public void move() {pos.addMod(deltaPos);} 
public void turn() {deltaPos.skalarMultMod(-1);}
	 
	 
	 
	 
	 
}

