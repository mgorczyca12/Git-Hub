import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class CircleViewer
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Circle Frame");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)(screenSize.getHeight()/2);
		int width = (int)(screenSize.getWidth()/2);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		CircleComponent component = new CircleComponent();
		frame.add(component);
		frame.setVisible(true);


	}

}