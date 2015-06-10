package cn.crj.java.generic;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int numA=100;
		int numB=200;
		System.out.println("A="+numA);
		System.out.println("B="+numB);
		swap(numA,numB);
		System.out.println("A="+numA);
		System.out.println("B="+numB);*/
		
		String numA="100";
		String numB="200";
		System.out.println("A="+numA);
		System.out.println("B="+numB);
		swap(numA,numB);
		System.out.println("A="+numA);
		System.out.println("B="+numB);
	}
	
	//泛型方法
	public static<T> void swap(T numA,T numB){
		T temp=numA;
		numA=numB;
		numB=temp;
		System.out.println("A="+numA);
		System.out.println("B="+numB);
	}

}
