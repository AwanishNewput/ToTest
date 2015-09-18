package com.webservice.WebConnectionApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.webservice.WebConnectionApp.Bean.EmployeeBean;
import com.webservice.WebConnectionApp.Connection.DbConnection;

public class EmployeeDao {

	public EmployeeBean setNewValue(EmployeeBean bean) {

		int createdId = 0;
		DbConnection con = new DbConnection();
		Connection conn = null;
		PreparedStatement ps = null, ps1 = null;
		ResultSet rs = null;

		try {
			conn = con.getConnection();
			String sql = "Insert into employee (EmployeeName,Address,Email) values (?,?,?)";

			ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getEmployeeName());
			ps.setString(2, bean.getAddress());
			ps.setString(3, bean.getEmail());

			boolean exe = ps.execute();
			System.out.println("Insert execute ::" + exe);
//			if (exe) {
				String query = "select last_insert_id() as id from employee";
				ps1 = conn.prepareStatement(query);
				rs = ps1.executeQuery();
				if (rs.next()) {
					createdId = rs.getInt("id");
					bean.setId(createdId);
					System.out.println("createdId::" + createdId);
//				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps1 != null) {
					ps1.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

		return bean;
	}
}
