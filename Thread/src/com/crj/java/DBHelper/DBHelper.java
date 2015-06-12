package com.crj.java.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBHelper {
	private final String url= "jdbc:mysql://localhost:3306/mysql";
	private final String name="com.mysql.jdbc.Driver";
	private final String user="root";
	private final String password="q";

	private Connection conn=null;
	
	/**
	 * 连接数据库
	 */
	public DBHelper(){
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * 执行查询
	 * @param sql
	 * @return
	 */
	public ResultSet ExeQuery(String sql) {
		ResultSet resultSet=null;
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
			resultSet=conn.createStatement().executeQuery(sql);				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public void close(){		
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
