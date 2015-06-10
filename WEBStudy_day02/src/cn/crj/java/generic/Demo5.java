package cn.crj.java.generic;

import java.util.ArrayList;
import java.util.List;

//泛型通配符 ？ 的使用
public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Boolean>booleanList=new ArrayList<Boolean>();
		booleanList.add(true);
		booleanList.add(false);
		show(booleanList);
	}
	
	public static void show(List<?>list){
		System.out.println("集合长度为："+list.size());
		//一定要用Object类型
		for(Object o:list){
			System.out.println(o);
		}
	}

}
