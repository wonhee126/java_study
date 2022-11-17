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
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//panel을 contentpane으로 설정
		setVisible(true);
		setSize(500, 500);
	}
	class Panel extends JPanel{
		private ImageIcon image = new ImageIcon("image/b.jpeg");
		private Image img = image.getImage();
		int x=10,y=10;//초기 x,y좌표 설정
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, 50,50, this);
			addMouseMotionListener(new MouseMotionAdapter() {//마우스 움직임과 관련된 행위를 처리하는 Event
				public void mouseDragged(MouseEvent e) {//마우스의 키를 누른상태에서 드래그할 때 발생하는 이벤트
					x=e.getX();
					y=e.getY();
					repaint();//현재 마우스의 좌표로 repaint
				}
			});
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_4();
	}

}
