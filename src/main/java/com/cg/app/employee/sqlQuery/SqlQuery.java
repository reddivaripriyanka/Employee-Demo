package com.cg.app.employee.sqlQuery;

import java.util.ResourceBundle;

public final class SqlQuery {

	private static SqlQuery sqlQuery = new SqlQuery();

	public SqlQuery() {
	}

	public static SqlQuery getInstance() {
		return sqlQuery;
	}

	public String insertEmployee() {
		ResourceBundle bundle = ResourceBundle.getBundle("query");
		return bundle.getString("Employee-details");

	}
}
