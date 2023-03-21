package mycom.mytest.main;

import java.awt.Frame;
import java.awt.Graphics;
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
