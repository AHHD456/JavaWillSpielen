package com.Albert.JavaWillSpielen;
import java.awt.event.*;

import com.Albert.util.*;



public class MouseControlledAnimation extends RemoveAnimation{

	GameObjects controlled;
	
	 MouseControlledAnimation(final GameObjects contr){
		
		 controlled=contr;
		 gos.add(controlled);
		
	
	
	 addMouseListener(
		 new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				final Vertex delta = new Vertex(e.getX(),e.getY());
				delta.addMod(controlled.getPos().skalarMult(-1));
				
				delta.addMod(new Vertex(-controlled.getWidth()/2,-controlled.getHeight()/2));
				
				final double factor = controlled.getDeltaPos().length()/delta.length();
				delta.skalarMult(factor);
				 
				controlled.setDeltaPos(delta);
			 }
			 
		 }
	 
	);
	
}
	 
	 public static void main(String[] args) {
			MovablePanel p = new MouseControlledAnimation(new MovableImage("antonio.png", -200, -200, 1, 1));
			p.gos.add(new MovableImage("biene.png", 400, 400, -1, -1));
			ShowInFrame.show(p);

		} 
	 
	 
}

