package lesson02.sample4;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample4 extends JFrame
{
    private SamplePanel sp;

    public static void main(String args[])
    {
	Sample4 sm = new Sample4();
    }
    public Sample4()
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
	    for(Circle C: circlelist){
	    	C.draw(g);
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
