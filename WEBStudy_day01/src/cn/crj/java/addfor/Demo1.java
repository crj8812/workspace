package cn.crj.java.addfor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo1 {
	@Test
	public void test1(){
		int[] is={1,2,3,4,5};
		for(int i=0;i<is.length;i++){
			System.out.println(is[i]);
		}
		
	}
	@Test
	public void testSet(){
		Set<Integer>set=new HashSet<Integer>();
		set.add(100);
		set.add(100);
		set.add(200);
		set.add(300);
		
		Iterator<Integer>it=set.iterator();
		while(it.hasNext()){
			Integer key=it.next();
			System.out.println(key+"\t");
		}
	}
	
	@Test
	public void testList(){
		List<String>list=new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("2");
		
		
		for(String value:list){
			
			System.out.println(value+"\t");
		}
	}
	
	@Test
	public void testMap(){
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(100, "1");
		map.put(200,"2");
		map.put(300, "3");
		Set<Integer>set=map.keySet();
		Iterator<Integer>it=set.iterator();
		while(it.hasNext()){
			Integer key=it.next();
			String value=map.get(key);
			System.out.println(value);
		}
	}
	
	/**
	 * Entry类型
	 */
	@Test
	public void testMap1(){
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(100, "1");
		map.put(200,"2");
		map.put(300, "3");
		Set<Entry<Integer,String>>set=map.entrySet();
		Iterator<Entry<Integer,String>>it=set.iterator();
		while(it.hasNext()){
			Entry<Integer,String>entry=it.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"  "+value);
		}
	}
	
	
	@Test
	public void test2(){
		int [] is={1,2,3,4,5};
		for(int value:is){
			System.out.println(value);
		}
	}
}
