package cn.crj.java.reflect;

import java.lang.reflect.Constructor;

public class Demo2 {
	public static void main(String[]args)throws Exception{
		//取得Person类对应的字节码对象
		Class c1=Person.class;
		
		//取得该类的构造函数
		Constructor c=c1.getConstructor(null);
		
		//创建实例
		Person p=(Person) c.newInstance();
		
		p.show();
	}
}
