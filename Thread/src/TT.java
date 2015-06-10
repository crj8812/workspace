public class TT implements Runnable{
	public Integer b=100;
	
	public synchronized void m1() throws Exception{
		System.out.println("1");
		b=1000;
		Thread.sleep(5000);
		System.out.println("b="+b);
	}

	public synchronized void m2()throws Exception{
		System.out.println("1");
		Thread.sleep(2500);
		b=2000;
		System.out.println(b);
	}
	
	public void run(){
		try{
			m1();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args)throws Exception{
		TT tt=new TT();
		Thread t1=new Thread(tt);
		t1.start();
		
		/*
		Thread.sleep(1000);
		tt.m2();
		*/
		TT tt1=new TT();
		Thread t2=new Thread(tt1);
		t2.start();
		
		
		TT tt2=new TT();
		Thread t3=new Thread(tt2);
		t3.start();
	}
}