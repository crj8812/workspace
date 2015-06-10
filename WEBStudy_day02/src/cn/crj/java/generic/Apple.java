package cn.crj.java.generic;

public class Apple<T> {
	/*public void buy(Integer num){
		System.out.println("苹果"+num+"个");
	}
	
	public void buy(Double price){
		System.out.println("苹果"+price+"钱");
	}*/
	
	public void buy(T t){
		System.out.println("苹果"+t+"信息");
	}
	
	private T ti;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
