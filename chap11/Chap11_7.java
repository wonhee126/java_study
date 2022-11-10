package chap11;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Chapter11_7 extends JFrame{
	JSlider js = new JSlider(1,100,56);
	JLabel jl = new JLabel("I Love Java");
	
	public Chapter11_7() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		js.setMajorTickSpacing(20);//큰 눈금 간격 20
		js.setMinorTickSpacing(5);//작은 눈금 간격 5
		js.setPaintLabels(true);//슬라이더의 라벨을 보이게 설정
		js.setPaintTicks(true);//슬라이더의 눈금을 보이게 설정
		js.setPaintTrack(true);//슬라이더의 트랙을 보이게 설정
		
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();
				jl.setFont(new Font("맑은 고딕",Font.PLAIN,temp.getValue()));
			}
		});
		c.add(js,BorderLayout.NORTH);
		c.add(jl,BorderLayout.CENTER);
		jl.setFont(new Font("맑은 고딕",Font.PLAIN,56));
		
		setSize(300,300);
		setVisible(true);
	}
}
public class Chap11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_7();
	}

}
