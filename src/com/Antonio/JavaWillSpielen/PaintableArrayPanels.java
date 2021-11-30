package com.Antonio.JavaWillSpielen;
public class PaintableArrayPanels {

	Paintable[] ps;
	
	public PaintableArrayPanels(Paintable[] pa)
	{
		ps=pa;
	}
	
	
	public void paintComponent(java.awt.Graphics g) {
		
		for(Paintable p:ps)
		{
			p.paintTo(g);
		}
		
		
		
		
		
	}
	
	
	
	
}
