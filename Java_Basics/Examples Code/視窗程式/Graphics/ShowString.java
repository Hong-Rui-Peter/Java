
import java.awt.*;
import java.awt.event.*;

public class ShowString extends Frame {
	public ShowString(String title) {
		setTitle(title);
		// setLayout(new FlowLayout());
	}

	public void paint(Graphics g) {
		String message = "�ɫe������A�æ��a�W���C�|�Y�����A�C�Y��G�m�C";
		Font font = new Font("�з���", Font.BOLD, 28); // �إ߿�X�r�����з���;
		g.setFont(font); // �]�w��X�r��
		g.setColor(Color.red);
		g.drawString(message, 25, 100);
	}
}

class Show {
	public static void main(String[] args) {
		ShowString frm = new ShowString("��ܦr��");
		frm.setSize(800, 200);
		frm.setLocation(200, 250);
		frm.show();
	}
}