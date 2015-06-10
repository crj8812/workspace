package com.crj.java.socket;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;

public class TCPClient{
	public static void main(String[]args)throws Exception{
		Socket s=new Socket("127.0.0.1",30000);//链接到服务器端口 30000
		
		//拿到输出管道
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		dos.writeUTF("0001：陈伟，gyn1221,END");
		dos.flush();
		dos.close();
		
		
	}
}
	