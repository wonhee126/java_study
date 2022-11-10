package chap11;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Chapter11_8 extends JFrame{
	JRadioButton [] jrb = new JRadioButton[2];
	ImageIcon [] image = {new ImageIcon("images/red.png"), new ImageIcon("images/blue.png"), new ImageIcon("images/green.png")};
	int index = 0;
	JLabel jl = new JLabel(image[0]);//그림 넣기
	public Chapter11_8() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout());

		jrb[0] = new JRadioButton("left");
		jrb[0].setSelected(true);//선택
		jrb[1] = new JRadioButton("right");
		n.add(jrb[0]);
		n.add(jrb[1]);
		
		ButtonGroup g = new ButtonGroup();//그룹 내에서 하나만 선택 가능
		g.add(jrb[0]);
		g.add(jrb[1]);
		
		c.add(n,BorderLayout.NORTH);
		c.add(jl,BorderLayout.CENTER);
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(jrb[0].isSelected() == true) {
					if(index==0) index=image.length-1;
					else index--;
				}
				else {
					if(index==image.length-1) index = 0;
					else index++;
				}
			jl.setIcon(image[index]);
		}
		});
		setSize(300,300);
		setVisible(true);
	}
}
public class Chap11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_8();
	}

}
