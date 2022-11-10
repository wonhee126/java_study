package chap11;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
class Chapter11_3 extends JFrame{
	JLabel money[]=new JLabel[8];//�迭 ����
	String moneytag[]= {"������","����","õ��","500��","100��","50��","10��","1��"};//���ڿ� �迭 ����
	
	int moneys[]= {50000,10000,1000,500,100,50,10,1};//������ �迭 ����
	JTextField result[]=new JTextField[8];//�� ���� ��ȯ�Ǵ��� ��µǴ� �迭 ����
	
	public Chapter11_3() {
		setTitle("Money Changer");//â �̸� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ â ���� �� ���μ������� �ݱ�
		
		Container m=getContentPane();//container c�� �ֱ�
		m.setLayout(new BorderLayout());//�����̳��� ���̾ƿ� ����, ���� ���̿� ������ ���� BorderLayout
		m.setBackground(Color.pink);//������ pink
		
		JPanel n=new JPanel();//JPanel ����
		
		n.setLayout(new FlowLayout());//�г��� ���̾ƿ� ����, ���ʿ��� ���������� ��ġ�ϴ� FlowLayout
		n.add(new JLabel("�ݾ�"));//"�ݾ�" ���� �߰�
		JTextField input=new JTextField(10);//�Է�â�� ũ�Ⱑ 10�� ���� ũ���� �ؽ�Ʈ �ʵ��� ���� input�� ����
		JButton cal=new JButton("���");//"���" ��ư ����
		
	    cal.addActionListener(new ActionListener() { //��ư Ŭ������ ��
			public void actionPerformed(ActionEvent e) {
				int sum=Integer.parseInt(input.getText());//input�� �Էµ� ���� ������ ��ȯ �� total�� ����
				for(int i=0;i<moneys.length;i++) {//moneys �迭 �����ŭ �ݺ�
					result[i].setText(Integer.toString(sum/moneys[i]));//Integer.toString() ���ڿ��� ��ȯ���ִ� �Լ�, textField �Է�â�� ���ڿ��� ����ؾ� �ؼ�
					sum%=moneys[i];//sum/moneys[i]�� �������� sum�� �ٽ� ����
				}
			}
		});
		n.add(input);//JPanel�� input ���̱�
		n.add(cal);//JPanel�� cal ���̱�
		n.setBackground(Color.pink);//���� pink
		m.add(n,BorderLayout.NORTH);//n-> ���̾ƿ� ����, north������ �߰�
		
		
		JPanel c=new JPanel();//JPanel ����
		c.setLayout(new GridLayout(8,2));//�׸��� 2��8�� ����
		c.setBackground(Color.pink);//���� pink
		for(int i=0;i<moneys.length;i++) {//moneys �迭 �����ŭ �ݺ�
			//?
			money[i]=new JLabel(moneytag[i]);//�Ű������� moneytag�迭 ���� money�迭�� ���� 
			result[i]=new JTextField();//�ؽ�Ʈ �ʵ忡 �Էµ� ���� result�迭�� ����
			c.add(money[i]);//money�迭 ���̱�
			c.add(result[i]);//result�迭 ���̱�
		}
		m.add(c,BorderLayout.CENTER);//c-> ���̾ƿ� ����, center������ �߰�
		
		
		JPanel w=new JPanel();//JPanel ����
		w.setBackground(Color.pink);//���� pink
		m.add(w,BorderLayout.WEST);//w-> ���̾ƿ� ����, west������ �߰�
		
		JPanel e=new JPanel();//JPanel ����
		e.setBackground(Color.pink);//���� pink
		m.add(e,BorderLayout.EAST);//e-> ���̾ƿ� ����, east������ �߰�
		
		JPanel s=new JPanel();//JPanel ����
		s.setBackground(Color.pink);//���� pink
		m.add(s,BorderLayout.SOUTH);//s-> ���̾ƿ� ����, south������ �߰�
		
		setSize(300,300);//â ũ�� ����
		setVisible(true);//���̱� ����
	}
}
 
public class Chap11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_3();
	}
}
