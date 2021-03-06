import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.Color;

public class RectangleComponent extends JComponent{

	int x,y,w,h;
	Rectangle box;
	Color c;

	public RectangleComponent() {
		this.x = 5;
		this.y = 10;
		this.w = 15;
		this.h = 20;
		box = new Rectangle(x,y,w,h);
	}

	public RectangleComponent(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		box = new Rectangle(x,y,w,h);
	}

	public void paintComponent(Graphics g)
	   {
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
		  g2.setColor(c);
	      // Construct a rectangle and draw it
	      //Rectangle box = new Rectangle(5, 10, 20, 30);
	      g2.fill(box);

	      // Move rectangle 15 units to the right and 25 units down
	      box.translate(x + 10,y + 10);

	      // Draw moved rectangle
	      g2.fill(box);
	   }

	 public void nextFrame(int seconds)
	 {
		 if(seconds % 2 == 0)
		 {
			 c = Color.BLACK;
	 	 }
	 	 else
	 	 	 c = Color.YELLOW;

		 box.translate(10, 10);

		 repaint();

	 }

}
