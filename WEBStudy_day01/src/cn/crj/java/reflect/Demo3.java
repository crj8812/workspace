package cn.crj.java.reflect;

import java.lang.reflect.Field;

public class Demo3 {
	public static void main(String[]args)throws Exception{
		Person p=new Person();
		Class c=Class.forName("cn.cui.java.reflect.Person");		
		Field f=c.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p,"杰克");//p.setName("杰克")
		System.out.println("用户名："+p.getName());
		
	}
}
