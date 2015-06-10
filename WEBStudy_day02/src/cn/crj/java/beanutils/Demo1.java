package cn.crj.java.beanutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class Demo1 {
	public static void main(String[]args)throws Exception{
		Student s=new Student();
		
		//向BeanUtils框架注册自定义的转换器（String->java.util.Date)
		//当本地传入   “yyyy-mm-dd"给Date的时候，先看框架是否支持，如果不支持，看是否定义了convert
		/*ConvertUtils.register(new Converter() {
			
			@Override
			public Object convert(Class clazz, Object type) {
				//参数一：目标类型   java.util.Date.class
				//参数二：是传入的参数类型，即java.lang.String
				
				// TODO Auto-generated method stub
				String strBirthday=(String)type;
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
				try {
					return sdf.parse(strBirthday);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}
		}, java.util.Date.class);*/
		
		ConvertUtils.register(new DateLocaleConverter(), java.util.Date.class);
		
		//s.setName("张三")
		BeanUtils.setProperty(s, "name", "张三");
		BeanUtils.setProperty(s, "birthday", "2011-10-09");
		
		//s.getName()
		String returnValue=BeanUtils.getProperty(s, "name");
		String birthday=BeanUtils.getProperty(s, "birthday");
		System.out.println(returnValue);
		System.out.println(new Date(birthday).toLocaleString());
	}
}
