import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;

class Chapter11_10 extends JFrame{
	JLabel num[]=new JLabel[10];
	int nowindex;
	public Chapter11_10() {
		Container c=getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<10;i++) {
			num[i]=new JLabel(Integer.toString(i));
			num[i].setSize(10,10);
			num[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel temp=(JLabel)e.getSource();
					int num=Integer.parseInt(temp.getText());
					if(num==nowindex) {
						temp.setVisible(false);
						nowindex++;
					}
					if(nowindex==10) {
						setting();
					}
				}
			});
			c.add(num[i]);
		}
		setting();
		
		setSize(300,300);
		setVisible(true);
	}
		public void setting() {
			nowindex=0;
			for(int i=0;i<10;i++) {
				int x=(int)(Math.random()*300);
				int y=(int)(Math.random()*300);
				
				num[i].setLocation(x,y);
				num[i].setVisible(true);
			}
		}
}
public class Chap11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_10();
	}

}
