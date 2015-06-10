package cn.crj.java.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


//文件复制
public class Demo1{
	public static void main(String[]args)throws Exception{
		InputStream is=new FileInputStream("chutian.jpg");
		
		OutputStream os=new FileOutputStream("chutian1.jpg");
		
		byte[]buf=new byte[1024];
		int len=0;
		while((len=is.read(buf))>0){
			os.write(buf,0,len);
		}
		is.close();
		os.close();
		
		
	}
}