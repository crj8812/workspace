package cn.crj.java.autobox;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;





public class Demo1 {
	public void test1(){
		List list=new ArrayList();
		list.add("jack");
		String name=(String)list.get(0);
		System.out.println("name="+name);
		
	}
	
	@Test
	public void test2(){
		int i=100;
		
		List list=new ArrayList();
		list.add(i);
		Integer num=(Integer)list.get(0);
		System.out.println("num="+num);
		
	}
}
