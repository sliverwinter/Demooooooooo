package com.zkz.demo.jdbcMysql.add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AddMysql {

	public static void main(String[] args) {
		AddMysql addMysql = new AddMysql();
		addMysql.insert();
		
	}

	public static void insert() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.1.192:3306/pantaishan";
		String user = "root";
		String password = "Passw0rd";
		Connection conn;
		Long begin = new Date().getTime();
		String prefix = "INSERT INTO order_zj (number, date, order_status,type,remark,project_id) VALUES ";
		try {
			conn = DriverManager.getConnection(url, user, password);
			// 保存sql后缀
			StringBuffer suffix = new StringBuffer();
			// 设置事务为非自动提交
			conn.setAutoCommit(false);
			PreparedStatement pst = conn.prepareStatement("");
			// 外层循环，总提交事务次数 700w
			for (int i = 1; i <= 100; i++) {
				// 第次提交步长
				for (int j = 1; j <= 77777; j++) {
					// 构建sql后缀
					suffix.append("(" + "'ZKZ" + j * i + "'" 
									  + ", SYSDATE() " 
									  + ",3" 
									  + ",1," 
									  + i * j * Math.random() 
									  + ",18" 
									  + "),");
					System.out.println(j*i);
				}
				// 构建完整sql
				String sql = prefix + suffix.substring(0, suffix.length() - 1);
				// 添加执行sql
				pst.addBatch(sql);
				// 执行操作
				pst.executeBatch();
				// 提交事务
				conn.commit();
				// 清空上一次添加的数据
				suffix = new StringBuffer();
			}
			// 头等连接
			pst.close();
			conn.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 结束时间
		Long end = new Date().getTime();
		// 耗时
		System.out.println("cast : " + (end - begin) / 1000 + " s");
	}

}
