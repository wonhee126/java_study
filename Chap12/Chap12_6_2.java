import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Chap12_6_2 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_6_2() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	class Panel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int Y0 = 0, X1 = 0, Y2 = this.getHeight(), X3 = this.getWidth();
			int [] x = {this.getWidth()/2,0,this.getWidth()/2,this.getWidth()};
			int [] y = {0,this.getHeight()/2,this.getHeight(),this.getHeight()/2};
			g.drawPolygon(x,y,4);
			for(int i=1; i<=10; i++) {
				Y0 += 10;
				X1 += 10;
				Y2 -= 10;
				X3 -= 10;
				y[0] = Y0;
				x[1] = X1;
				y[2] = Y2;
				x[3] = X3;
				g.drawPolygon(x,y,4);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_6_2();
	}

}
