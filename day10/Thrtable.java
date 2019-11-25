package com.hcl.day10;

class Mtable {
	
synchronized	void show(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n + " * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Tab1 extends Thread {
	Mtable mtable;
	Tab1(Mtable mtable) {
		this.mtable=mtable;
	}
	@Override
	public void run() {
		mtable.show(12);
	}
}
class Tab2 extends Thread {
	Mtable mtable;
	Tab2(Mtable mtable) {
		this.mtable=mtable;
	}
	@Override
	public void run() {
		mtable.show(5);
	}
}
class Tab3 extends Thread {
	Mtable mtable;
	Tab3(Mtable mtable) {
		this.mtable=mtable;
	}
	@Override
	public void run() {
		mtable.show(19);
	}
}

public class Thrtable {
public static void main(String[] args) {
	Mtable mtable=new Mtable();
	Thread t1=new Thread(new Tab1(mtable));
	Thread t2=new Thread(new Tab2(mtable));
	Thread t3=new Thread(new Tab3(mtable));
	t1.start();
	t2.start();
	t3.start();
}
}
