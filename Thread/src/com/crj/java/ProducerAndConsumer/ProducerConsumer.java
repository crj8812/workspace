package com.crj.java.ProducerAndConsumer;

public class ProducerConsumer{
	public static void main(String[]args){
		SyncStack ss=new SyncStack();
		Producer p=new Producer(ss);
		Consumer c=new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}
	
	
}