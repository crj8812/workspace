package cn.crj.java.reflect;

public class Demo1 {
	public static void main(String[]args)throws Exception{
		//三种方式取得类的字节码
		Class c1=String.class;
		
		Class c2=new String().getClass();
		
		Class c3=Class.forName("java.lang.String");
		
		System.out.println(c1.getName());
		
		System.out.println(c1==c2);
		
		System.out.println(c1==c3);
	}
}
