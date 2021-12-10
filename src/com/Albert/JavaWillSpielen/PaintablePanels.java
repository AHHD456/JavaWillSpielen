package com.Albert.JavaWillSpielen;


import java.util.List;

import com.Albert.util.ShowInFrame;

import java.util.ArrayList;

public class PaintablePanels extends SizedPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Paintable> pas;
	
	public PaintablePanels(List<Paintable> pas)
	{
		this.pas =pas;
	}
	
	
	public void paintComponent(java.awt.Graphics g)
	{
		for(Paintable pa:pas)
		{
			pa.paintTo(g);
		}
	}
	
	public static void Main(String[] args )
	{
		List<Paintable> ps =new ArrayList<Paintable>();
		
		ps.add(new PaintableOval(100,50,30,50, null));
		ps.add(new PaintableOval(100,50,130,150, null));
		
		ShowInFrame.show("Ovale", new PaintablePanels(ps));
		
	}
	
	
}
