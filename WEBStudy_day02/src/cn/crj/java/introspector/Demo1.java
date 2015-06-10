package cn.crj.java.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

public class Demo1 extends Object{
	@Test
	public void test1()throws Exception{
		Student s=new Student();
		//pd操作Student的name属性
		PropertyDescriptor pd=new PropertyDescriptor("name", Student.class);
		//m=setName()
		Method m=pd.getWriteMethod();
		//s.setName("berry")
		m.invoke(s, "berry");
		//s.getName()
		m=pd.getReadMethod();
		String returnValue=(String)m.invoke(s,null);
		System.out.println(returnValue);
		
		
	}
	
	@Test
	public void test2()throws Exception{
		//Beaninfo表示该Student的所有属性情况
		BeanInfo bi=Introspector.getBeanInfo(Student.class);
		//得到Student对象所有属性集合
		PropertyDescriptor[]pds=bi.getPropertyDescriptors();
		for(PropertyDescriptor pd:pds){
			System.out.println(pd.getName());
		}
	}
}
