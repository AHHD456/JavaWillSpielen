package com.Antonio.JavaWillSpielen;

import com.Antonio.util.*;

public class AnimationPanel extends SimpleAnimation {

	
	

	@Override
	public void doOnTick() {
		move();
		doChecks();
		repaint();
	}

	public void doChecks() {
		for (GameObjects g1 : gos) {
			for (GameObjects g2 : gos) {

				if (g1 != g2 && g1.touches(g2)) {
					reactWhenTouching(g1, g2);
					
				}
			}
		}
	}

	void reactWhenTouching(GameObjects g1, GameObjects g2) {
		g1.turn();
		g1.move();
		
		g2.turn();
		g2.move();
	}

	public static void main(String[] args) {
		MovablePanel p = new AnimationPanel();
		p.gos.add(new MovableImage("antonio.png", -200, -200, 1, 1));
		p.gos.add(new MovableImage("biene.png", 400, 400, -1, -1));
		ShowInFrame.show(p);

	}

}
