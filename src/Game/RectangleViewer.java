import javax.swing.JFrame;

public class RectangleViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);
      frame.setVisible(true);

   	  RectangleComponent component2 = new RectangleComponent();
   	  frame.add(component2);

   	  frame.setVisible(true);

   	  FaceComponent component3 = new FaceComponent();
   	  frame.add(component3);

   }
}
