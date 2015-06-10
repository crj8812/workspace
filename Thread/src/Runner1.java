class Runner1 implements Runnable{

	@Override
	public void run(){
		synchronized(this){
		// TODO Auto-generated method stub
			for(int i=0;i<100;i++){
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Runner:"+i);
			}
		}
	}
	
	public static void main(String[]args){
		Runner1 r=new Runner1();
		//r.run();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		
	}
	
}