import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Chap12_5 extends JFrame{
	private Panel panel = new Panel();
	int x=10,y=10;
	int SizeX = 50, SizeY = 50;
	
	public Chap12_5() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);		// panel을 CONTENTPANE으로 설정
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					SizeX +=10;
					SizeY += 10;
					repaint();
				}
				else if(e.getKeyChar() == '-') {
					SizeX -= 10;
					SizeY -= 10;
				}
				repaint();
			}
		});
		
		setVisible(true);
		setSize(500, 500);
	}
	class Panel extends JPanel{
		private ImageIcon image = new ImageIcon("image/b.jpeg");
		private Image img = image.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,x,y,SizeX,SizeY,this);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_5();
	}

}
