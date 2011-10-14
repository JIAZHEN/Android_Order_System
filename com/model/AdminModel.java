package com.model;

import java.sql.*;

public class AdminModel {
	
	// get the database connection
	private DatabaseConnection dbconn;
	// represent the selected language
	// default language is Chinese
	boolean chinese = true;
	
	public AdminModel() {
		dbconn = new DatabaseConnection();
	}
	
	/**
	 * A method to check the account as well as password are correct or not
	 * @param account the user's account
	 * @param password the corresponding password
	 * @return true if correct, otherwise for not
	 */
	public boolean permitLogin(String account, String password) {
		boolean result = false;
		PreparedStatement pStmt;
		String sql = "select * from stuff where stuff_name = ?";
		try {
			pStmt = dbconn.getConnection().prepareStatement(sql);
			pStmt.setString(1, account);
			String passwordDB = "";
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                passwordDB = rs.getString("stuff_password");
            }
            if(password.equals(passwordDB)) {
            	result = true;
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * Detect what is the selected language at present
	 * @return true for Chinese, false for English
	 */
	public boolean isChinese() {
		return chinese;
	}

	/**
	 * Change the selected language
	 * @param chinese true for Chinese, false for English
	 */
	public void setChinese(boolean chinese) {
		this.chinese = chinese;
	}
	

}
