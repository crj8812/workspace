package com.crj.java.ProducerAndConsumer;

public class Producer implements Runnable{
	//篮子的引用
	private SyncStack ss=null;
	
	Producer(SyncStack ss){
		this.ss=ss;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			Wotou wt=new Wotou(i);
			try {
				System.out.println("producer push ");
				ss.push(wt);
				System.out.println("push"+wt);
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	
}