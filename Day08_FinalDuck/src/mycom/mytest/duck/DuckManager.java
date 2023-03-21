package mycom.mytest.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.mytest.Flyable;
import mycom.mytest.Quackable;

public class DuckManager {
	
	private Duck[] arr = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}//초기화

	private void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		for(int i=0;i<arr.length;i++) {
			type = rnd.nextInt(4); //0,1,2,3
			switch(type) {
				case 0:
					arr[i] = new MallardDuck();
					break;
				case 1:
					arr[i] = new RedDuck();
					break;
				case 2:
					arr[i] = new RubberDuck();
					break;
				case 3:
					arr[i] = new DecoyDuck();
					break;
				default:
					arr[i] = new MallardDuck(); //upcasting
			}
		}//for
	}//makeDucks
	
	public void displayAllDucks(Graphics g) {
		for(Duck d:arr) {
			if(d!=null) d.display(g);
		}
	}
	public void swimAllDucks(Graphics g) {
		for(Duck d:arr) {
			if(d!=null) d.swim(g);
		}
	}
	public void quackAllDucks(Graphics g) {
		for(Duck d:arr) {
			if(d!=null) {
				if(d instanceof Quackable) {
					((Quackable)d).quack(g);
				}
			}//if
		}//for
	}
	public void flyAllDucks(Graphics g) {
		for(Duck d:arr) {
			if(d!=null) {
				if(d instanceof Flyable) {
					((Flyable)d).fly(g);
				}
			}//if
		}//for
	}
};

