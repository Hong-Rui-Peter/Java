
import java.awt.*;

class ShowCircle extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.blue);           
      for(int x=40;x<=250;x=x+70)
      {  
          g.fillOval(x,80,60,60);   //ø�X4�Ӥp��
      }    
   }
}

class Show
{
   public static void main(String args[])
   {
      ShowCircle frm=new ShowCircle();
      frm.setTitle("����");
      frm.setSize(350,200);
      frm.setLocation(300,250);       
      frm.setVisible(true);  
   }
}