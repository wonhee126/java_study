import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
 //이해x
public class Chap12_8 extends JFrame{
    public Panel panel = new Panel();
    public Chap12_8(){
        setTitle("마우스로 원 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }
    class Circle{
        private Point centerPos;
        private Point radiusPos;
        private Point startPos = new Point();
        private Point endPos = new Point();
        private int radius;
        public Circle(Point center){
            this.centerPos = center;
        }
        public void calcCirclePosition(){
            int dx, dy;
            dx = (radiusPos.x - centerPos.x) * (radiusPos.x - centerPos.x);
            dy = (radiusPos.y - centerPos.y) * (radiusPos.y - centerPos.y);
            this.radius = (int)Math.sqrt((double)dx+dy);
        }
    }
    class Panel extends JPanel{
        private Vector<Circle> v = new Vector<Circle>();
        private Circle circle;
 
        public Panel(){
            addMouseListener(new MyMouseListener());
            addMouseMotionListener(new MyMouseListener());
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
 
            for(int i=0; i<v.size(); i++){
                Circle c = v.elementAt(i);
                g.setColor(Color.MAGENTA);
                g.drawOval(c.radiusPos.x-c.radius/2,c.radiusPos.y-c.radius/2, c.radius, c.radius);
            }
        }
        class MyMouseListener extends MouseAdapter {

            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Point p = e.getPoint();
                circle = new Circle(p);
            }

            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                circle.radiusPos = e.getPoint();
                circle.calcCirclePosition();
                v.add(circle);
                repaint();
            }
        }
    }
    public static void main(String[] args){
        new Chap12_8();
    }
}

