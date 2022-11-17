import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Chap12_2 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_2(){
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//생성한 panel을 컨텐트팬으로 사용
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}

	class Panel extends JPanel{
		private ImageIcon image = new ImageIcon("image/b.jpeg");
		private Image img = image.getImage();
		int x = 10, y = 10;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.green);
			g.fillOval(x, y, 20, 20);//초기 위치는 100,100
			
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					// x와 y의 좌표를 드래그 된 위치로 바꾸고 repaint()
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new Chap12_2();
	}
}