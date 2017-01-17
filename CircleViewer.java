import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class CircleViewer
{

	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		int h = 0;

		JFrame frame = new JFrame("Circle Frame");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)(screenSize.getHeight()/2);
		int width = (int)(screenSize.getWidth()/2);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		CircleComponent component = new CircleComponent(x, y, h);

		for(int i = 0; i < 4; i++)
		{
			x = (int)(Math.random()*10);
			y = (int)(Math.random()*10);
			h = (int)(Math.random()*50);


			//CircleComponent component = new CircleComponent(x, y, h);
		}



		frame.add(component);
		frame.setVisible(true);



	}

}