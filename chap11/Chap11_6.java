package chap11;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Chapter11_6 extends JFrame{
	JSlider js = new JSlider(0,100,0);//0부터 100까지, 초기값 0
	JTextArea jta = new JTextArea();
	public Chapter11_6() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,1));
		js.setMajorTickSpacing(20);//눈금 간격 20
		js.setMinorTickSpacing(5);//작은 눈금 간격 5
		js.setPaintLabels(true);//label 보이게
		js.setPaintTicks(true);//눈금 보이게
		
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();
				System.out.print("temp값 : " + temp);
				String text = jta.getText();
				if(text.length()<=js.getValue()) js.setValue(text.length());
				else jta.setText(text.substring(0,temp.getValue()));
			}
		});
		
		jta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				JTextArea t=(JTextArea)e.getSource();
				String text=t.getText();
				if(text.length()<=100) js.setValue(text.length());//글자 수 만큼 js값을 이동
				else {
					text=text.substring(0,99);//100자 까지 출력
					jta.setText(text);
				}
			}
		});
		
		c.add(jta);
		c.add(js);
		setSize(300,300);
		setVisible(true);
		
	}
}
public class Chap11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_6(); 
	}
}

