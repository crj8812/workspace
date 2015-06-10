package cn.crj.xml.xpath;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


//使用xpath取得xml文件中任意级别的内容
public class Demo1 {
	public static void main(String[]args)throws Exception{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read(new File("src/cn/crj/xml/xpath/car.xml"));
		String xpath="//单价";
		List<Element> elementList=document.selectNodes(xpath);
		System.out.println(elementList.size());
		for(Element e:elementList){
			System.out.println(e.getText());
		}
	}
}
