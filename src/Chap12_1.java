import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Chap12_1 extends JFrame{
	private Panel panel = new Panel();
	private JButton btn = new JButton("Hide/Show");
	
	private ImageIcon image = new ImageIcon("image/b.jpeg");//�̹��� ���
	private Image img = image.getImage();
	
	int count = 0;
	
	public Chap12_1(){
		setTitle("�̹��� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//������ panel�� ����Ʈ������ ���
		add(btn);//Hide/Show ��ư �ޱ�
		
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				count++;
				if(count % 2 == 1) {//�̹� �̹����� ��µǾ� ������ �̹��� ����
					img = null;
					repaint();
				}
				else {
					img = image.getImage();
					repaint();
				}
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	

	class Panel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//JPanel�� ������ paintComponent() ȣ�� //�������̵�
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);//���� ũ��� �̹��� ũ�� ��ġ
		}
	}
	
	public static void main(String[] args) {
		new Chap12_1();
	}
}