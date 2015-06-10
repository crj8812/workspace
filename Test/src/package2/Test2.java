
package package2;

import package1.Test;

class Test2{
	int B;
	void setB(int b){
		B=b;
	}
	
	public static void main(String[]args){
		Test test=new Test();
		
		String s="123";
		String ss=String.valueOf('1');
		
		System.out.println("dd");
		
		double[][]d;
		String str="1,2;3,4,5";
		String[]Str=str.split(";");
		d=new double[Str.length][];
		for(int i=0;i<Str.length;i++){
			String[]Str_=Str[i].split(",");
		}
		String str1=str;
		System.out.println(str1.hashCode());
		System.out.println(str.hashCode());
		if(str.equals(str1)){
			System.out.println("right");
		}
	}
	
	
	
}