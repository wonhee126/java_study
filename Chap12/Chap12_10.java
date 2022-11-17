import javax.swing.*;
import java.awt.*;
public class Chap12_10 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_10() {
		setTitle("�׷��� �̹��� ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
	}
	class Panel extends JPanel{
		private ImageIcon icon = new ImageIcon("image/b.jpeg");//������ url���� imageIcon�� �����.
        private Image img = icon.getImage();//�̹����� �����ͼ� img��ü�� �־��ֱ�
        public void paintComponent(Graphics g){//������Ʈ�� �ڽ��� ����� �׸��� �Լ�
            super.paintComponent(g);
            int halfWidth = this.getWidth()/2; //�̹��� ���� ������ ��
            int halfHeight = this.getHeight()/2;//�̹��� ���� ������ ��
            
            //void setClip(int x, int y, int w, int h) : �׷��� ��� ������Ʈ�� x,y��ġ���� wxh �κ��� Ŭ���� �������� ����
            //1
            g.setClip(0, 0, halfWidth-5, halfHeight-5);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            //2
            g.setClip(this.getWidth()/2+5, 0, halfWidth-5, halfHeight-5);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            //3
            g.setClip(0, this.getHeight()/2+5, halfWidth-5, halfHeight-5);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            //4
            g.setClip(this.getWidth()/2+5, this.getHeight()/2+5, halfWidth-5, halfHeight-5);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap12_10();
	}

}
