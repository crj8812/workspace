package cn.crj.java.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	public static void main(String[]args){
		/*int stringNum=0,integerNum=0,booleanNum=0;
		List list=new ArrayList();
		list.add("jack");
		list.add(200);
		list.add(100);
		list.add(true);
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(obj instanceof String){
				stringNum++;
			}
			else if(obj instanceof Integer){
				integerNum++;
			}
			else if(obj instanceof Boolean){
				booleanNum++;
			}
		}
		System.out.println("stringNum="+stringNum);
		System.out.println("integerNum="+integerNum);
		System.out.println("boolNum="+booleanNum);*/
		
		List<Boolean>list=new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		for(Boolean b:list){
			System.out.println(b);
		}
		
		
	}
}
