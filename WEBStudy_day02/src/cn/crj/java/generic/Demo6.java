package cn.crj.java.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>stringList=new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		System.out.println("倒序：");
		for(String s:stringList){
			System.out.println(s);
		}
		System.out.println("倒序后：");
		reverse(stringList);
		for(String s:stringList){
			System.out.println(s);
		}
	}

//Collections   Arrays的使用
	public static void reverse(List<String>stringList) {
		// TODO Auto-generated method stub
		if(stringList!=null && stringList.size()>=2){
			Collections.reverse(stringList);
		}
	}
}
