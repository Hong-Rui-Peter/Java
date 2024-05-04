
import java.awt.*;

public class ShowPolyline extends Frame {
    public void paint(Graphics g) {
        int[] x = { 38, 95, 127, 250, 238 };
        int[] y = { 44, 105, 90, 129, 190 };
        g.setColor(Color.blue);
        g.drawPolyline(x, y, 5);
    }
}

class Show {
    public static void main(String args[]) {
        ShowPolyline frm = new ShowPolyline();
        frm.setTitle("�s��u��");
        frm.setSize(300, 250);
        frm.setLocation(350, 250);
        frm.setVisible(true);
    }
}