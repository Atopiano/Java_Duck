package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Flyable, Quackable {

	public MallardDuck() {
		//super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
		
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}
	
	public void fly(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("날다", x-15, y+Duck.DUCK_SIZE+5);
	}
	
	public void quack(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("꽥꽥", x+Duck.DUCK_SIZE-10, y);
	}
}
