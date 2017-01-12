import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{

	int x,y,d;
	Ellipse2D.Double circle1;

	public CircleComponent(int x, int y, int d)
	{
		this.x = x;
		this.y = y;
		this.d = d;
		circle1 = new Ellipse2D.Double(x,y,d,d);
	}

	public void paintComponent(Graphics g)
	{
			Graphics2D g2 = (Graphics2D) g;
			g2.draw(circle1);
	}

	public int getD()
	{
		return d;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}



}