package com.crj.java.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;

public class TCPClient{
	public static void main(String[]args)throws Exception{
		Socket s=new Socket("127.0.0.1",30000);//链接到服务器端口 30000  172.17.194.225
		
		//输入管道
		DataInputStream dis=new DataInputStream(s.getInputStream());		
		//拿到输出管道
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		System.out.println("退出请输入END+回车");
		Scanner sc=new Scanner(System.in);
		String message=sc.nextLine();
		while(!message.toLowerCase().equals("end")){
			//dos.writeUTF("0001:cw,gyn111,END");
			//dos.writeUTF("0002:tbYhb,3,END");	
			dos.writeUTF(message);
			System.out.println(dis.readUTF());
			
			sc=new Scanner(System.in);
			message=sc.nextLine();
		}
		
		s.close();
		
	}
}
	