package chap11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Chapter11_4 extends JFrame{
	JLabel money [] = new JLabel[8];
	String moneytag [] = {"������","����","õ��","500��","100��","50��","10��","1��"};
	int moneys [] = {50000,10000,1000,500,100,50,10,1};
	JTextField result [] = new JTextField[8];
	JCheckBox check [] = new JCheckBox[7];
	
	public Chapter11_4() {
		setTitle("Money Changer with CheckBox");//â �̸� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ â ���� �� ���μ������� �ݱ�
		
		Container m = getContentPane();
		m.setLayout(new BorderLayout());
		m.setBackground(Color.PINK);
		
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout());
		n.add(new JLabel("�ݾ�"));
		JTextField input = new JTextField(10);
		JButton cal = new JButton("���");
		
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = Integer.parseInt(input.getText());
				for(int i=0; i<check.length; i++) {
					if(check[i].isSelected()) {
						result[i].setText(Integer.toString(sum/moneys[i]));
						sum%=moneys[i];
					}
					else result[i].setText("0");//üũ���� �ʾҴٸ� 0 ���
				}
				result[7].setText(Integer.toString(sum));
			}
		});
		n.add(input);
		n.add(cal);
		n.setBackground(Color.PINK);
		m.add(n,BorderLayout.NORTH);
		JPanel c = new JPanel();
		c.setLayout(new GridLayout(8,3));
		c.setBackground(Color.PINK);
		for(int i=0; i<moneys.length; i++) {
			money[i] = new JLabel(moneytag[i]);
			result[i] = new JTextField();
			c.add(money[i]);
			c.add(result[i]);
			if(i==7)break;//i�� 7�̸� �ݺ��� Ż��
			else { 
				check[i] = new JCheckBox();
				check[i].setBackground(Color.PINK);
				c.add(check[i]);
			}
		}
		m.add(c,BorderLayout.CENTER);
		
		JPanel w = new JPanel();
		w.setBackground(Color.PINK);
		m.add(w,BorderLayout.WEST);
		
		JPanel e = new JPanel();
		e.setBackground(Color.PINK);
		m.add(e, BorderLayout.EAST);
		
		JPanel s = new JPanel();
		s.setBackground(Color.pink);
		m.add(s,BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
}

public class Chap11_4{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_4();
	}

}
