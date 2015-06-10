package cn.crj.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo4 {
	public static void main(String[] args)throws Exception{
		Class c=Class.forName("cn.cui.java.reflect.Person");
		Constructor con=c.getConstructor(null); 
		Person p=(Person)con.newInstance(null);
		
		Method m=c.getMethod("show", String[].class,double.class);
		m.invoke(p,new String[]{"1","2","3","4"},23333);//new Persion().show()
		
		Method m1=c.getDeclaredMethod("haha", null);
		m1.setAccessible(true);
		m1.invoke(p,null);//new Persion().show()
		
		
		Method m2=c.getDeclaredMethod("godbye", null);
		m2.setAccessible(true);
		String returnValue=(String)m2.invoke(p,null);//new Persion().show()
		System.out.println(returnValue);
	}
}
