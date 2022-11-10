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
	JLabel money[]=new JLabel[8];//배열 생성
	String moneytag[]= {"오만원","만원","천원","500원","100원","50원","10원","1원"};//문자열 배열 생성
	
	int moneys[]= {50000,10000,1000,500,100,50,10,1};//정수형 배열 생성
	JTextField result[]=new JTextField[8];//몇 개로 반환되는지 출력되는 배열 생성
	
	public Chapter11_3() {
		setTitle("Money Changer");//창 이름 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창 종료 시 프로세스까지 닫기
		
		Container m=getContentPane();//container c에 넣기
		m.setLayout(new BorderLayout());//컨테이너의 레이아웃 설정, 영역 사이에 간격이 없는 BorderLayout
		m.setBackground(Color.pink);//배경색은 pink
		
		JPanel n=new JPanel();//JPanel 생성
		
		n.setLayout(new FlowLayout());//패널의 레이아웃 설정, 왼쪽에서 오른쪽으로 배치하는 FlowLayout
		n.add(new JLabel("금액"));//"금액" 라벨을 추가
		JTextField input=new JTextField(10);//입력창의 크기가 10개 문자 크기인 텍스트 필드의 값을 input에 저장
		JButton cal=new JButton("계산");//"계산" 버튼 생성
		
	    cal.addActionListener(new ActionListener() { //버튼 클릭했을 때
			public void actionPerformed(ActionEvent e) {
				int sum=Integer.parseInt(input.getText());//input에 입력된 값을 정수로 반환 후 total에 저장
				for(int i=0;i<moneys.length;i++) {//moneys 배열 사이즈만큼 반복
					result[i].setText(Integer.toString(sum/moneys[i]));//Integer.toString() 문자열로 반환해주는 함수, textField 입력창에 문자열로 출력해야 해서
					sum%=moneys[i];//sum/moneys[i]한 나머지를 sum에 다시 저장
				}
			}
		});
		n.add(input);//JPanel에 input 붙이기
		n.add(cal);//JPanel에 cal 붙이기
		n.setBackground(Color.pink);//배경색 pink
		m.add(n,BorderLayout.NORTH);//n-> 레이아웃 설정, north영역에 추가
		
		
		JPanel c=new JPanel();//JPanel 생성
		c.setLayout(new GridLayout(8,2));//그리드 2헹8열 생성
		c.setBackground(Color.pink);//배경색 pink
		for(int i=0;i<moneys.length;i++) {//moneys 배열 사이즈만큼 반복
			//?
			money[i]=new JLabel(moneytag[i]);//매개변수로 moneytag배열 값을 money배열에 전달 
			result[i]=new JTextField();//텍스트 필드에 입력된 값을 result배열에 저장
			c.add(money[i]);//money배열 붙이기
			c.add(result[i]);//result배열 붙이기
		}
		m.add(c,BorderLayout.CENTER);//c-> 레이아웃 설정, center영역에 추가
		
		
		JPanel w=new JPanel();//JPanel 생성
		w.setBackground(Color.pink);//배경색 pink
		m.add(w,BorderLayout.WEST);//w-> 레이아웃 설정, west영역에 추가
		
		JPanel e=new JPanel();//JPanel 생성
		e.setBackground(Color.pink);//배경색 pink
		m.add(e,BorderLayout.EAST);//e-> 레이아웃 설정, east영역에 추가
		
		JPanel s=new JPanel();//JPanel 생성
		s.setBackground(Color.pink);//배경색 pink
		m.add(s,BorderLayout.SOUTH);//s-> 레이아웃 설정, south영역에 추가
		
		setSize(300,300);//창 크기 설정
		setVisible(true);//보이기 설정
	}
}
 
public class Chap11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter11_3();
	}
}
