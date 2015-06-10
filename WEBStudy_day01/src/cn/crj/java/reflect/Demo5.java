package cn.crj.java.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo5 {
	public static void main(String[]args)throws Exception{
		/*Class c=Class.forName("cn.cui.java.reflect.Person");
		Constructor con=c.getConstructor(null);
		Person p=(Person)con.newInstance(null);
		
		//获取main方法
		Method m=c.getMethod("main1", String[].class);
		//这边必须要用Object转换，不然
		m.invoke(p, new Object[]{new String[]{"A","b","C"}});*/
		
		Properties pro=new Properties();
		InputStream fis=new FileInputStream("src/class.properties");
		pro.load(fis);
		
		String className=((String)pro.get("className")).trim();
//		String methodName=((String)pro.get("methodName")).trim();
		String methodName="haha";
		System.out.println(methodName);
		System.out.println(className);
		
		Class c=Class.forName(className);
		Constructor con=c.getConstructor(null);
		
		Method m=c.getDeclaredMethod(methodName, null);
		m.setAccessible(true);
		//m.invoke(con.newInstance(null), null);
				
		System.out.println(c.getName());
	}
	
	
}
