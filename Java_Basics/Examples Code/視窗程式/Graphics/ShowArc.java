
import java.awt.*;  
public class ShowArc extends Frame
{
   public void paint(Graphics g)
   {
      g.setColor(Color.blue);           //�]�wø���C�⬰�Ŧ�
      g.fillArc(20,50,150,150,30,300);  //�񺡶꩷
      g.setColor(Color.red);            //�]�wø���C�⬰����
      for(int x=120;x<=360;x=x+60) 
      { 
         g.fillOval(x,100,50,50);       //ø�X5�Ӥp��
      }  
   }
}

class Show
{
   public static void main(String args[])
   {
      ShowArc frm=new ShowArc();
      frm.setTitle("�꩷�P��");
      frm.setSize(450,300);
      frm.setLocation(300,250);       
      frm.setVisible(true);  
   }
}