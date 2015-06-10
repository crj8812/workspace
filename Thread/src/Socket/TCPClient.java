package Socket;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;

public class TCPClient{
	public static void main(String[]args)throws Exception{
		Socket s=new Socket("127.0.0.1",6666);//链接到服务器端口 6666
		
		//拿到输出管道
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		dos.writeUTF("hello server!");
		dos.flush();
		dos.close();
		
		
	}
}
	