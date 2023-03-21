package mycom.mytest.main;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import mycom.mytest.duck.DecoyDuck;
import mycom.mytest.duck.Duck;
import mycom.mytest.duck.DuckManager;
import mycom.mytest.duck.Flyable;
import mycom.mytest.duck.MallardDuck;
import mycom.mytest.duck.Quackable;
import mycom.mytest.duck.RedDuck;
import mycom.mytest.duck.RubberDuck;

public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManager mgr = new DuckManager();
	
	public MyFrame() {
		super();	//Frame f=new Frame();
		//윈도우 창닫기 처리기 등록
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) //WindowAdapter class
			{
				System.exit(0); //프로그램 종료 하기
			}
		}); 
		this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT); //f.setSize();
		this.setVisible(true); // 독점권요청 -->OS-->독점권뺏고 다시 부여-->paint(g)
	}
	
	
	@Override
	public void paint(Graphics g) {
		if(mgr!=null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackAllDucks(g);
			mgr.flyAllDucks(g);
		}
		
	}
		
};
