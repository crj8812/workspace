package com.crj.java.Socket;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;

public class TCPClient{
	public static void main(String[]args)throws Exception{
		Socket s=new Socket("172.17.194.225",30000);//链接到服务器端口 30000
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		
		//拿到输出管道
		OutputStream os=s.getOutputStream();		
		DataOutputStream dos=new DataOutputStream(os);
		
//		dos.writeUTF("0001:cw,gyn111,END");
		dos.writeUTF("0002:tbYhb,3,END");
		
		System.out.println(dis.readUTF());
		
		s.close();
		
	}
}
	