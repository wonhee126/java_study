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
		js.setMajorTickSpacing(20);//���� ���� 20
		js.setPaintLabels(true);//�����̴��� label�� ���̰� ����
		js.setPaintTicks(true);//�����̴��� ���� ���̰� ����
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();//e�� ����Ű�� ���� �����ͼ� temp�� ����
				jl.setText(Integer.toString(temp.getValue()));//temp ���� �����ͼ� ���ڿ��� ��ȯ �� �� ���
			}
		});
		c.add(js);
		c.add(jl);
		jl.setBackground(Color.GREEN);
		jl.setOpaque(true);//���� ���̰� ����
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
