package Administradora.Util;

import java.sql.*;

import Administradora.Models.Administradora;

public class OracleCon {
	public String user = Constants.user;
	public String pass = Constants.pass;
	public String jdbc = Constants.jdbc;
	
	public OracleCon() {
		super();
	}

	public OracleCon(String user, String pass, String jdbc) {
		super();
		this.user = user;
		this.pass = pass;
		this.jdbc = jdbc;
	}

	public Connection connect() {
		Connection con = null;// DriverManager.getConnection(jdbc, user, pass);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbc, user, pass);
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;

	}

	public ResultSet querySelect() {
		Connection con = connect();
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT ID, CODIGO, NOMBRE, COD_TP_ID, NRO_ID, NATURALEZA, MULTIPLE_ARP, FSP, FUSIONADA, FECHA_FUSION\r\n" + 
					"FROM ADMINISTRADORA.ADMINISTRADORA");
			while (rs.next()){
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return rs;
	}	
	
	public ResultSet queryInsertt(Administradora administradora) {
		Connection con = connect();
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			String query = "INSERT INTO ADMINISTRADORA.ADMINISTRADORA " + 
					"(ID, "
					+ "CODIGO, "
					+ " NOMBRE, "
					+ " COD_TP_ID, "
					+ " NRO_ID, "
					+ " NATURALEZA, "
					+ " MULTIPLE_ARP, "
					+ " FSP, "
					+ " FUSIONADA, "
					+ " FECHA_FUSION)\r\n"  
					+ " VALUES(SEQ_ID_ADMINISTRADORA.NEXTVAL, '"+administradora.getCodigo()+"',"
					+ "'"+administradora.getNombre()+"', "
					+ "'"+administradora.getCodTpId()+"', "
					+ "'"+administradora.getNroId()+"', "
					+ "'"+administradora.getNaturaleza()+"', "
					+ administradora.getMultipleARP()+","
					+ administradora.getFsp()+","
					+ administradora.getFusionada()+","
					+  "'"+administradora.getFechaFusion()+"')";
			System.out.println("query "+query);
			rs = stmt.executeQuery(query);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return rs;
	}
}
