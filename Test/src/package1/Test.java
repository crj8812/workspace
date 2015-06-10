package package1;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
	private int a;
	
	void setA(int b){
		a=b;
		
		Test_1 test11=new Test_1();
	}
	
	private class Test_1{
		int c;
		
		Test b;	
	}
	
	public static void main(String[]args) throws IOException{
		/*
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(33);
		//Integer i0=list.get(0);
		//Integer i1=list.set(0, 1);
		//System.out.println(list.indexOf(33));
		list.add(0);
		list.add(3);
		list.add(7);
		list.add(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		int i=map.get("two");
		Integer j=new Integer(1);
		System.out.print(j.SIZE);
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=null;
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
		
		
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		DataOutputStream dos=new DataOutputStream(baos);
		
		for(int i=0;i<9;i++){
			try {
				dos.writeDouble(i);
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		DataInputStream dis=new DataInputStream(bais);
		
		for(int i=0;i<9;i++){
			System.out.println(dis.readDouble());
		}
		
		long v=1;
		Byte[]writeBuffer=new Byte[8];
		writeBuffer[0]=(byte)(v >>> 0);
		System.out.println(writeBuffer[0]);
		
		*/
		
		testInterface1 ttt=new testClassFromInterface();
		testInterface1 ttt1=ttt.addtestInterface1();
		
		
	}
}