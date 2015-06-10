package ProducerAndConsumer;

public class Consumer implements Runnable{
	//篮子的引用
		private SyncStack ss=null;
		
		Consumer(SyncStack ss){
			this.ss=ss;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<20;i++){
									
				try {
					System.out.println("consumer pop ");
					Wotou wt=ss.pop();
					System.out.println("pop"+wt);
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
}