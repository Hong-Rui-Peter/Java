
import java.awt.*;

class ShowOval extends Frame {
   public void paint(Graphics g) {
      g.setColor(Color.blue);
      g.fillOval(80, 60, 200, 120);
   }
}

class Show {
   public static void main(String args[]) {
      ShowOval frm = new ShowOval();
      frm.setTitle("����");
      frm.setSize(350, 200);
      frm.setLocation(300, 250);
      frm.setVisible(true);
   }
}