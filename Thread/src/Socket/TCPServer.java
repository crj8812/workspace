package Socket;
import java.io.DataInputStream;
import java.net.*;

public class TCPServer{
	public static void main(String[]args)throws Exception{
		ServerSocket ss=new ServerSocket(6666);
		
		while(true){
			Socket s=ss.accept();
			
			//读取input管道里的内容
			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			
			System.out.println("A client connect");
		}
		
	}
}