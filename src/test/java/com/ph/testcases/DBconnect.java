package com.ph.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.google.common.util.concurrent.Service.State;

public class DBconnect {
	private final String url = "jdbc:postgresql://ppiuat.cqawwlhgqyb6.ap-southeast-1.rds.amazonaws.com:5432/FOM_CORE";
	private final String user = "root";
	private final String password = "ppidev@123";
	public String IMEI;
	/*
	 * public static void main(String[] args) { DBconnect dv=new DBconnect();
	 * dv.connect(); }
	 */
	public Map<String, String> connect(String claimnum) throws Exception {
		Map<String, String> map=new HashMap<String, String>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully. " + claimnum);
			Thread.sleep(400000);
			String orderid = "SELECT id,order_state,arc_id,imei from t_repair_order where claim_number='"+claimnum+"'";
			
			// String claim_number=claimn1;
			PreparedStatement preparedStatement = conn.prepareStatement(orderid);
			//preparedStatement.setString(1, claimnum);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {

				String orderState = rs.getString("order_state");
				String arcid = rs.getString("arc_id");
				String order_id=rs.getString("id");
				       IMEI=rs.getString("imei");
				map.put("orderState", orderState);
				map.put("arcid", arcid);
				map.put("order_id", order_id);
				map.put("IMEI", IMEI);
				System.out.println("order state :" + orderState);
				System.out.println("arcid :" + arcid);
				System.out.println("Order num :"+ order_id);
				System.out.println("IMEI num :"+ order_id);
				Thread.sleep(5000);
				
			}
			String orderno=map.get("order_id");
            String awb="select awb_number,message from t_repair_order_logistics where order_id="+orderno;
            PreparedStatement ps=conn.prepareStatement(awb);
           // ps.setString(2, "awb");
            ResultSet rs1 = ps.executeQuery();
			while (rs1.next()) {

				String awb1 = rs1.getString("awb_number");
				String message = rs1.getString("message");
				System.out.println("awb no.:"+ awb1);
				System.out.println("lsp message:"+ message);
			}

		 }catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return map;
	}

	/*public Connection connect1() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");

			String selectSQL = "SELECT LAST (claim_number) FROM t_repair_order";
			// String claim_number="SERCON159824";
			PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setInt(1, 0);
			// preparedStatement.setString(2, 0);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String userid = rs.getString("id");
				System.out.println(userid);
				// String username = rs.getString("USERNAME");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
	// create new connection to get username,password then pass as parameter to get
	// login in crm
*/}
