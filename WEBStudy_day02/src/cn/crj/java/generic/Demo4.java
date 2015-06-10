package cn.crj.java.generic;

public class Demo4 {
	public static void main(String[]args){
		/*Apple a=new Apple();
		a.buy(2);
		a.buy(22);*/
		
		Apple<Integer> a1=new Apple<Integer>();
		a1.buy(10);
		
		Apple<Double> a2=new Apple<Double>();
		a1.buy(10);
	}
}
