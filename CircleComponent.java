import java.awt.geom.Ecllipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{

	int x,y,d;

	public CircleComponent()
	{

	}

	public void paintComponent(Graphics g)
	{
			Graphics2D g2 = (Graphics2D) g;
			Ellipse2D.Double circle1 = new Ellipse2D.Double(x,y,d,d);

			g2.fill(circle1);
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