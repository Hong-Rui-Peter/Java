
import java.awt.*;

public class ShowImage1 extends Frame 
{ 
   public ShowImage1() 
   {    
      super("�v����j�P�Y�p");    
   }
   
   public void paint(Graphics g)
   {
      Image image;
      image=Toolkit.getDefaultToolkit().getImage("mountain.jpg");
      g.drawImage(image,10,50,this);  	     //��ܭ�Ϥؤo300*200
      g.drawImage(image,10,280,150,100,this);  //����Y�p��
      g.drawImage(image,180,280,400,300,this);  //��ܩ�j��
   }
}

class Show
{
   public static void main(String[] args)
   {   
      ShowImage1 frm = new ShowImage1();
      frm.setSize(600,600); 
      frm.setVisible(true);   
   }
}   