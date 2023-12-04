
import java.awt.*;

class ShowRect extends Frame {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(80, 60, 200, 110);
        // g.drawRoundRect(80,60,200,110,30,30);
    }
}

class Show {
    public static void main(String args[]) {
        ShowRect frm = new ShowRect();
        frm.setTitle("�x��");
        frm.setSize(350, 200);
        frm.setLocation(300, 250);
        frm.setVisible(true);
    }
}