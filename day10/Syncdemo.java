package com.hcl.day10;

class Demo {
	synchronized void dispMsg(String name) {
		System.out.print("hello" +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("how are you");
	}
}

class Sai extends Thread {
	Demo demo;
	Sai(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
	demo.dispMsg("sai");
	}
}
class Teja extends Thread {
	Demo demo;
	Teja(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.dispMsg("teja");
	}
}
class Lokesh extends Thread {
	Demo demo;
	public Lokesh(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.dispMsg("lokesh");
	}
}
public class Syncdemo {
public static void main(String[] args) {
	Demo demo=new Demo();
	Sai sai=new Sai(demo);
	Teja teja=new Teja(demo);
	Lokesh lokesh=new Lokesh(demo);
	
	Thread t1=new Thread(sai);
	Thread t2=new 	Thread(teja);
	Thread t3=new 	Thread(lokesh);
	
	t1.start();
	t2.start();
	t3.start();
}
}
