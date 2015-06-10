package cn.crj.xml.dom4j;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

//使用dom4j解析xml文件
public class Demo1 {
	public static void main(String[]args)throws Exception{
		SAXReader saxReader=new SAXReader();
		//加载需要解析的xml文件
		Document document=saxReader.read("/home/ivan/workspace/WEBStudy_day03/src/cn/crj/xml/dom4j/car.xml");
		//取得根元素
		Element rootElement=document.getRootElement();
//		System.out.println(rootElement.getName());
		List<Element> elementList=rootElement.elements();
		for(Element e:elementList){
//			System.out.println(e.getName());
			/*System.out.println(e.elementText("车牌"));
			System.out.println(e.elementText("产地"));*/
			System.out.println(e.element("车牌").attributeValue("出产时间"));
			System.out.println(e.element("产地").attributeValue("出产时间"));
			System.out.println("--------------------------------");
		}
	}
}
