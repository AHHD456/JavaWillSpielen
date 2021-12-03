package com.Antonio.JavaWillSpielen;
import java.util.*;


class MovablePanel extends SizedPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<GameObjects> gos = new ArrayList<GameObjects>();

    public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    for (GameObjects go:gos) go.paintTo(g);
    }


    public void move() {
    	for (GameObjects go:gos) go.move();
    	}
    public void doOnTick() {
    	 move () ;
    	 repaint () ;
    }

}