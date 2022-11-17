import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Chap12_4 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_4() {
		setTitle("�̹��� ���̺� �巡�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//panel�� contentpane���� ����
		setVisible(true);
		setSize(500, 500);
	}
	class Panel extends JPanel{
		private ImageIcon image = new ImageIcon("image/b.jpeg");
		private Image img = image.getImage();
		int x=10,y=10;//�ʱ� x,y��ǥ ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, 50,50, this);
			addMouseMotionListener(new MouseMotionAdapter() {//���콺 �����Ӱ� ���õ� ������ ó���ϴ� Event
				public void mouseDragged(MouseEvent e) {//���콺�� Ű�� �������¿��� �巡���� �� �߻��ϴ� �̺�Ʈ
					x=e.getX();
					y=e.getY();
					repaint();//���� ���콺�� ��ǥ�� repaint
				}
			});
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_4();
	}

}
