package lesson02.sample4;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleYen extends JFrame
{
    private SamplePanel sp;

    public static void main(String args[])
    {
	SampleYen sm = new SampleYen();
    }
    public SampleYen()
    {
	super("サンプル");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(300, 300);
	sp = new SamplePanel();
	add(sp, BorderLayout.CENTER);
	setVisible(true);
    }
    public class SamplePanel extends JPanel
    {
	private ArrayList<Circle> circlelist
	    = new ArrayList<Circle>();

	public SamplePanel()
	{
	    addMouseListener(new SampleMouseListener());
	}
	public void paint(Graphics g)
	{
	    super.paint(g);
	    Iterator<Circle> it = circlelist.iterator();
	    while(it.hasNext()) {
		Circle c = it.next();
		c.draw(g);
	    }
	}
	public class SampleMouseListener extends MouseAdapter
	{
	    public void mousePressed(MouseEvent e)
	    {
		circlelist.add(new Circle(e.getX(), e.getY()));
		repaint();
	    }
	}
    }
}
