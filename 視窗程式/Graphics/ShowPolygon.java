
import java.awt.*;

public class ShowPolygon extends Frame {
   public void paint(Graphics g) {
      int[] x = { 74, 95, 250, 159, 88 };
      int[] y = { 84, 105, 90, 210, 177 };
      g.setColor(Color.yellow); // ø���C��]������
      g.fillPolygon(x, y, 5); // ø�X�h���
      g.setColor(Color.black); // ø���C��]���¦�
      g.drawPolygon(x, y, 5); // �ζ¦�ø�X�h���
   }
}

class Show {
   public static void main(String args[]) {
      ShowPolygon frm = new ShowPolygon();
      frm.setTitle("�h���");
      frm.setSize(300, 250);
      frm.setLocation(350, 250);
      frm.setVisible(true);
   }
}