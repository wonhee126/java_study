import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Chap12_6 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_6() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	class Panel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x = this.getWidth() /10;
			int y =this.getHeight()/10;
			for(int i=1; i<10; i++) {
					g.drawLine(i*x, 0, i*y, this.getHeight());
					g.drawLine(0,i*x,this.getWidth(),i*y);
				
			}
			repaint();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_6();
	}

}
