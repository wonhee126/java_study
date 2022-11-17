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
	
	private ImageIcon image = new ImageIcon("image/b.jpeg");//이미지 경로
	private Image img = image.getImage();
	
	int count = 0;
	
	public Chap12_1(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//생성한 panel을 컨텐트팬으로 사용
		add(btn);//Hide/Show 버튼 달기
		
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				count++;
				if(count % 2 == 1) {//이미 이미지가 출력되어 있으면 이미지 제거
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
			super.paintComponent(g);//JPanel에 구현된 paintComponent() 호출 //오버라이딩
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);//바탕 크기와 이미지 크기 일치
		}
	}
	
	public static void main(String[] args) {
		new Chap12_1();
	}
}