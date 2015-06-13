package com.crj.java.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.crj.java.DBHelper.*;

public class TCPServer extends Thread{
	private Socket socket;

	public TCPServer(Socket socket) {
		this.socket = socket;
	}

	/**
	 * 0001-----------------------登录
	 * 正向指令: 0001：cw，gyn1221,END 
	 * index：1
	 * contents:cw gyn111 END
	 * 返回指令: 0001：成功，END
	 * 
	 * 0002-----------------------规则查询 
	 * 0003-----------------------巡检状态查询
	 * 0004-----------------------列车巡检数据查询 
	 * 0005-----------------------轴温状态查询
	 * 0006-----------------------列车轴温数据查询
	 * @param 1
	 * @param cw gyn111 END
	 * @return
	 */
	protected ArrayList<String> dbSearch(Integer index,String[]contents) throws SQLException{
		ArrayList<String>result=new ArrayList<String>();
		result=new ArrayList<String>();
			
		String sqlText="";
		DBHelper dbHelper = new DBHelper();
		ResultSet resultSet=null;		
			
		try{
			if(index==1){
				if(contents.length==3){
					String useName=contents[0];
					String usePassword=contents[1];
						
					sqlText="SELECT f_yhid FROM tbYhb WHERE f_yhm=\'"+useName+"\' and f_mm=\'"+usePassword+"\'";
					resultSet=dbHelper.ExeQuery(sqlText);
					
	
					if(resultSet.next()){						
						result.add("0001:success,END");
					}
				}
				else{
					result.add("0001:failed,END");
				}
			}
			else if(index==2){
				if(contents.length==3){
					String tableName=contents[0];
					String columnCount=contents[1];
					
					sqlText="SELECT * FROM "+tableName+" limit "+columnCount;
					resultSet=dbHelper.ExeQuery(sqlText);
					
					String resultStr=resultSetToJson(resultSet);
					result.add(resultStr);					
				}
			}
			else if(index==3){
							
			}
			else if(index==4){
				
			}
			else if(index==5){
				
			}
			else if(index==6){
				
			}
				
			//关闭连接和结果集
			dbHelper.close();
			resultSet.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
			
		return result;
	}
	
	/**
	 * 将ResultSet 转换成json
	 * @param rs
	 * @return
	 * @throws SQLException
	 * @throws JSONException
	 */
    protected String resultSetToJson(ResultSet resultSet) throws SQLException,JSONException{
    	//json数组
    	JSONArray array = new JSONArray();
    	System.out.println(resultSet.getRow());
    	
    	//获取列数
    	ResultSetMetaData metaData = resultSet.getMetaData();
    	int columnCount = metaData.getColumnCount();
    	
    	//遍历ResultSet中的每条数据
    	while (resultSet.next()){
    		JSONObject jsonObj = new JSONObject();
           
            //遍历每一列
            for (int i = 1; i <= columnCount; i++) {
                String columnName =metaData.getColumnLabel(i);
                String value = resultSet.getString(columnName);
                jsonObj.put(columnName, value);
            } 
            
            array.put(jsonObj); 
        }
    	System.out.println(array);
    	return array.toString();
    }
		
	/**
	 * 线程run函数，主要是解析指令，送到dbSearch函数中进行数据库访问
	 * 然后连接成String传回client
	 */
	@Override
	public void run() {
		DataInputStream dis=null; 
		DataOutputStream dos=null;
		String message=null;
		String resultMessage="";
		ArrayList<String>result=null;
		
		try {
			dis = new DataInputStream(
					this.socket.getInputStream());
			dos = new DataOutputStream(
					this.socket.getOutputStream());
			message=dis.readUTF();
			//判断输入的满不满足基本判断，指令正确，
			Integer index = Integer.parseInt(message.substring(0, 4));
			String[] contents= message.substring(5).split(",");
			
			//如果message满足基本判断，下一步将指令传到dbSearch中进一步根据指令种类进行判断
			//查询数据库将要求返回的结果输出
			if (resultMessage.equals("")) {					
				result=dbSearch(index, contents);	
				//將this.result的結果返回給client端
				for(String rowStr:result){
					dos.writeUTF(rowStr+"\n");
				}
			}
				
			dis.close();
			dos.close();
		} catch (IOException e) {
			resultMessage.concat("net error\n");
		} catch (NumberFormatException ex) {
			resultMessage.concat("index error\n");
		} catch (Exception ex) {
			resultMessage.concat("content of Order error\n");
		}
	}
	

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(30000);

		while (true) {
			Socket socket = serverSocket.accept();			
			TCPServer tcpServer=new TCPServer(socket);			
			tcpServer.start();

			System.out.println("A client connect");
		}
	}
}