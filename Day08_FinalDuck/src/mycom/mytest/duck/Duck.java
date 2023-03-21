package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.mytest.main.MyFrame;

public abstract class Duck {
	
	protected int x;
	protected int y;
	static final int DUCK_SIZE=50;
	
	public Duck() {
		Random rnd = new Random();
		
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //0~799
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70; //0~799
	
	}
	
	public Duck(int x, int  y) {
		this.x=x;
		this.y=y;	
	}
	
	public void swim(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("수영", x-15, y);
	}
	
	public abstract void display(Graphics g);
};