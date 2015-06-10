package cn.crj.xml.dom4j;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Demo2 {
	public void Create()throws Exception{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/cn/crj/xml/dom4j/car.xml");
		Element rootElement=document.getRootElement();
		//取得第一辆车
		Element firstCarElement=(Element)rootElement.elements().get(0);
		//添加爱心愿素“单价”
		firstCarElement.addElement("单价").setText("40");
		
		
		//将内存中的xml文件写到硬盘中去
		OutputFormat format=OutputFormat.createCompactFormat();
		OutputStream os=new FileOutputStream("src/cn/crj/xml/dom4j/carNew.xml");
		
		XMLWriter xmlWriter=new XMLWriter(os,format	);
		xmlWriter.write(document);
		xmlWriter.close();
		os.close();
	}
	
	public static void main(String[]args)throws Exception{
		Demo2 demo2=new Demo2();
		demo2.Create();
	}
}
