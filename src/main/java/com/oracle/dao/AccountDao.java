package com.oracle.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.oracle.entity.Login;
import com.oracle.untl.DBHelper;

public class AccountDao extends DBHelper {

	public List<Login> queryAll() throws SQLException  {
		String sql = "SELECT * FROM login";
		QueryRunner qr = new QueryRunner();
		
		return qr.query(this.getconn(), sql, new BeanListHandler<Login>(Login.class));
				
	}
}
