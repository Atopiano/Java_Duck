package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {

	public RubberDuck() {
		//super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y);
		
	}
	@Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
		g.setColor(Color.RED);

	}
	
	public void quack(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("삑삑", x+Duck.DUCK_SIZE-10, y);
	}
}
