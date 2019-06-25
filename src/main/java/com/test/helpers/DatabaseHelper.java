package com.test.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.Pojo.CourseInfoDto;

public class DatabaseHelper {
	Connection conn;
	Statement statement;
	ResultSet rs;

	public ResultSet getResultSet(String strQuery) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Ant3m3an!");
			statement = conn.createStatement();
			rs = statement.executeQuery(strQuery);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (!conn.isClosed()) {
				conn.close();
				
			}
		}
		return rs;
	}

	public List<CourseInfoDto> getCourseInfo(String strQuery) throws ClassNotFoundException, SQLException {
		List<CourseInfoDto> courseInfoList;
		CourseInfoDto ressvc;
		int index = 0;
		rs = getResultSet(strQuery);
		courseInfoList = new ArrayList<CourseInfoDto>();
		while (rs.next()) {
			ressvc = new CourseInfoDto();
			ressvc.setCourseName(rs.getString("CourseName"));
			ressvc.setPurchasedDate(rs.getString("PurchasedDate"));
			ressvc.setAmount(rs.getInt("Amount"));
			ressvc.setLocation(rs.getString("Location"));
			courseInfoList.add(index, ressvc);
			index++;
		}
		if (!conn.isClosed()) {
			conn.close();
		}
		return courseInfoList;
		
	}
}
