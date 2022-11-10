package chap11;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Chapter11_9 extends JFrame{
	JButton btn[]=new JButton[3];
	ImageIcon img[]= {new ImageIcon("image/sissor.jpeg"),new ImageIcon("image/rock.jpeg"),new ImageIcon("image/paper.png")};
	int mySelect,comSelect;
	JLabel me=new JLabel("me");
	JLabel com=new JLabel("com");
	JLabel result=new JLabel();
	public Chapter11_9() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel top=new JPanel();
		top.setLayout(new FlowLayout());
		for(int i=0;i<3;i++) {
			btn[i]=new JButton(img[i]);
			btn[i].addActionListener(new action(i));
			top.add(btn[i]);
		}
		top.setBackground(Color.DARK_GRAY);
		c.add(top,BorderLayout.NORTH);
		
		JPanel center=new JPanel();
		center.setLayout(new FlowLayout());
		center.add(me);
		center.add(com);
		center.add(result);
		center.setBackground(Color.YELLOW);
		c.add(center);
		
		setSize(1000,700);
		setVisible(true);
	}
	
	class action implements ActionListener{
		int index;
		action(int i){
			index=i;
		}
		public void actionPerformed(ActionEvent e) {
			mySelect=index;
			comSelect=(int)(Math.random()*3);
			me.setIcon(img[mySelect]);
			com.setIcon(img[comSelect]);
			if(mySelect-comSelect==0) {
				result.setText("Same !!!");
			}
			else if(mySelect-comSelect==-2||mySelect-comSelect==1) {
				result.setText("Me !!!");
			}
			else {
				result.setText("Com !!!");
			}
		}
}
}
public class Chap11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_9();
	}

}
