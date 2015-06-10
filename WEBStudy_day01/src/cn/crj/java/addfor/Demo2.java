package cn.crj.java.addfor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * List<String> list=new ArrayList<String>(); list.add("Jack");
		 * list.add("marry"); list.add("sisi");
		 * 
		 * ListIterator<String>it=list.listIterator(); while(it.hasNext()){
		 * String key=it.next(); //System.out.println(key); it.add("qq"); }
		 * 
		 * it=list.listIterator(); while(it.hasNext()){ String key=it.next();
		 * //System.out.println(key); } while(it.hasPrevious()){ String
		 * key=it.previous(); System.out.println(key);
		 * 
		 * }
		 * 
		 * List<String>list=new ArrayList<String>(); list.add("AAA"); for(String
		 * str:list){ str="BBB"; } System.out.println(list.get(0));
		 * 
		 * 
		 * String a=new String("a"); a=a.intern(); String b="a";
		 * System.out.println(a==b);
		 * 
		 * 
		 * test t1=new test(1); test t2; t2=t1; t2.value=2;
		 * 
		 * System.out.println(t1.hashCode()); System.out.println(t2.hashCode());
		 

		Other other;

		String hello = "Hello", lo = "lo";

		System.out.print((hello == "Hello") + " ");

		System.out.print((Other.hello == hello) + " ");

		System.out.print((hello == ("Hel" + "lo")) + " ");

		System.out.print((hello == ("Hel" + lo)) + " ");

		System.out.println(hello == ("Hel" + lo).intern());

		String a=new String("a");
		String b=a;
		b.concat("b");
		System.out.println(a);*/
		
		String[]arr={"a","b","c"};
		show1("qq",arr);
	}
	
	//可变参数
	public static void show(String...arr){
		for(String a:arr){
			System.out.println(a);
		}
	}
	
	//可变参数只能放在最后面一个参数
	public static void show1(String qq,String...arr){
		System.out.println(qq);
			for(String a:arr){
				System.out.println(a);
			}
		}
		
		

	public static class Other {
		static String hello = "Hello";
	}

	public static class test {
		public int value;

		public test(int value) {
			this.value = value;
		}

	}
}
