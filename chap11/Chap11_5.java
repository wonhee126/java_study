package chap11;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Chapter11_5 extends JFrame{
	public Chapter11_5() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider js = new JSlider(100,200);
		JLabel jl = new JLabel("120");
		js.setMajorTickSpacing(20);//눈금 간격 20
		js.setPaintLabels(true);//슬라이더의 label을 보이게 설정
		js.setPaintTicks(true);//슬라이더의 눈금 보이게 설정
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();//e가 가리키는 값을 가져와서 temp에 저장
				jl.setText(Integer.toString(temp.getValue()));//temp 값을 가져와서 문자열로 반환 한 후 출력
			}
		});
		c.add(js);
		c.add(jl);
		jl.setBackground(Color.GREEN);
		jl.setOpaque(true);//색상 보이게 설정
		setSize(300,300);
		setVisible(true);
		
		
	}
	
}
public class Chap11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_5();
	}

}
