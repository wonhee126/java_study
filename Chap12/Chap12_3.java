import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Chap12_3 extends JFrame{
	JLabel label = new JLabel();
	ImageIcon image = new ImageIcon("image/b.jpeg");
	public Chap12_3() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setIcon(image);
		label.setSize(100,100);
		c.add(label);
		
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				Component c = (Component)e.getSource();
				c.setLocation(e.getX(), e.getY());
			}
		});
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_3();
	}

}
