package com.crj.java.ProducerAndConsumer;
public class SyncStack{
	int index=0;
	
	Wotou[] arrWT=new Wotou[6];//篮子只能装6个窝头
	
	public synchronized void push(Wotou wt)throws Exception{
		if(index==arrWT.length){
			//如果对象调用了wait方法就会使持有该对象的线程把该对象的控制权交出去，然后处于等待状态。
			//锁定在当前这个对象的线程停止/wait
			System.out.println("push wait");
			this.wait();
		}
		//如果对象调用了notify方法就会通知某个正在等待这个对象的控制权的线程可以继续运行。
		this.notify();
		
		arrWT[index]=wt;
		index++;
	}
	
	public synchronized Wotou pop()throws Exception{
		if(index==0){
			//wait的时候，锁就不属于当前线程
			System.out.println("pop wait");
			this.wait();
		}
		this.notify();
		
		index--;
		return arrWT[index];
	}
	
	
}