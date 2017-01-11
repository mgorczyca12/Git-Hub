//package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.*;

public class RectangleComponent extends JComponent{

	int x,y,w,h;
	Rectangle box;

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

	      // Construct a rectangle and draw it
	      //Rectangle box = new Rectangle(5, 10, 20, 30);
	      g2.draw(box);

	      // Move rectangle 15 units to the right and 25 units down
	      box.translate(x + 10,y + 10);

	      // Draw moved rectangle
	      g2.draw(box);
	   }

	 public void nextFrame()
	 {
		 for(i = 50; i <= 100; i++)
	 	 {

		 }

	 }

}
