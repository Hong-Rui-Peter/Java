
import java.awt.*;
 
public class ShowLine extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.red); 		
      g.drawLine(50,70,220,200);
      g.setColor(Color.blue);     
      g.drawLine(240,90,70,220);
   }
}

class Show
{
   public static void main(String args[])
   {
      ShowLine frm=new ShowLine();
      frm.setTitle("½u¬q");
      frm.setSize(300,250);
      frm.setLocation(350,250); 
      frm.setVisible(true); 
   }
}