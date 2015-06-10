public class Lock implements Runnable{
	public static Integer i1=new Integer(1);
	public static Integer i2=new Integer(1);
	public int flag;
	
	public void run(){
		if(flag==0){
			synchronized(i1){
				System.out.println("i1---");
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(i2){
					System.out.println("i2---");
				}
				System.out.println("OK---");
			}
		}
		else {
			synchronized(i2){
				System.out.println("i2===");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(i1){
					System.out.println("i1===");
				}
				System.out.println("OK===");
			}
		}
	}
	
	public static void main(String[]args){
		Lock lock1=new Lock();
		lock1.flag=0;
		Thread t1=new Thread(lock1);
		
		Thread t2=new Thread(lock1);
		t1.start();
		t2.start();
		
		/*
		Lock lock2=new Lock();
		lock2.flag=1;
		Thread t2=new Thread(lock2);
		
		t1.start();
		t2.start();
		*/
	}
}