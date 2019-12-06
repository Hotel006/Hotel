package com.oracle.untl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 * @author Administrator
 *
 */
public class DBHelper {
	private static final String DRIVERCLASS;
	private static final String URL;
	private static final String DBNAME;
	private static final String DBPASS;

	static {
		URL = PropertiesUtil.getValue(PropertiesUtil.DBPROPERTIES, "URL");
		DRIVERCLASS = PropertiesUtil.getValue(PropertiesUtil.DBPROPERTIES, "DRIVERCLASS");
		DBNAME = PropertiesUtil.getValue(PropertiesUtil.DBPROPERTIES, "DBNAME");
		DBPASS = PropertiesUtil.getValue(PropertiesUtil.DBPROPERTIES, "DBPASS");
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getconn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, DBNAME, DBPASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
