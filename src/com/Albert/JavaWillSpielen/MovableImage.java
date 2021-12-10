package com.Albert.JavaWillSpielen;

import java.awt.Image;

import javax.swing.ImageIcon;

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
 public void move() 
 {
	 pos.addMod(deltaPos);
 } 
 
public void turn() 
{
	deltaPos.skalarMultMod(-1);
}
public boolean isLeftOf(GameObjects that) 
{
	return this.getPos() .x+this.getWidth()<that.getPos() .x;	 
}

 public boolean isAbove(GameObjects that) 
 {
 return this.getPos() .y+this.getHeight()<that.getPos() .y;
 }
	 
 public boolean touches(GameObjects that) {
	  if (this.isLeftOf(that)) return false;
	  if (that.isLeftOf(this)) return false;
	 if (this.isAbove(that)) return false;
	  if (that.isAbove(this)) return false;
	 return true;
 }
@Override
public boolean isLargerThan(GameObjects that) {
	// TODO Auto-generated method stub
	return false;
}

}

