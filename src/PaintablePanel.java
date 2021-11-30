import com.Antonio.util.ShowInFrame;
import com.Antonio.JavaWillSpielen.SizedPanel;
import com.Antonio.JavaWillSpielen.Paintable;
import com.Antonio.JavaWillSpielen.PaintableOval;
import com.Antonio.JavaWillSpielen.SizedPanel;

import java.util.List;
import java.util.ArrayList;

public class PaintablePanel {

	List<Paintable> pas;
	
	public PaintablePanel(List<Paintable> pas)
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
		
		ShowInFrame.show("Ovale", new PaintablePanel(ps));
		
	}
	
	
}
