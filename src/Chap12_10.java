import javax.swing.*;
import java.awt.*;
public class Chap12_10 extends JFrame{
	private Panel panel = new Panel();
	public Chap12_10() {
		setTitle("그래픽 이미지 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
	}
	class Panel extends JPanel{
		private ImageIcon icon = new ImageIcon("image/b.jpeg");//지정된 url에서 imageIcon을 만든다.
        private Image img = icon.getImage();//이미지를 가져와서 img객체에 넣어주기
        public void paintComponent(Graphics g){//컴포넌트가 자신의 모양을 그리는 함수
            super.paintComponent(g);
            int halfWidth = this.getWidth()/2; //이미지 가로 길이의 반
            int halfHeight = this.getHeight()/2;//이미지 세로 길이의 반
            
            //void setClip(int x, int y, int w, int h) : 그래픽 대상 컴포넌트의 x,y위치에서 wxh 부분을 클리핑 영역으로 지정
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
