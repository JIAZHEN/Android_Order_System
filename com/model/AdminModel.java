package com.model;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.*;

import org.jdom.Document;
import org.jdom.Element;

public class AdminModel {

	// get the database connection
	private DatabaseConnection dbconn;
	// represent the selected language
	// default language is Chinese
	boolean chinese = true;
	// remember my account
	private String account;

	// Create Secure Sockets Layer socket
	private Socket socket;
	// use data input stream because we need to send message with UTF-8 code
	private DataInputStream fromServer;
	// to read the message with UTF-8 code
	private DataOutputStream toServer;
	// to receive the xml object
	private ObjectInputStream objectFromServer;
	// to pass the xml object
	private ObjectOutputStream objectToServer;

	public AdminModel() {
		dbconn = new DatabaseConnection();
		connectToServer();
	}

	/**
	 * A method to check the account as well as password are correct or not
	 * 
	 * @param account
	 *            the user's account
	 * @param password
	 *            the corresponding password
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
				passwordDB = rs.getString("password");
			}
			if (password.equals(passwordDB)) {
				result = true;
				// to record this admin in the server
				Element adminLoginRoot = new Element("message");
				Element adminLoginCommand = new Element("command");
				adminLoginCommand.setAttribute("type", "AdminLogin");
				adminLoginCommand.addContent(new Element("account")
						.setText(account));
				adminLoginRoot.addContent(adminLoginCommand);
				Document adminLoginDoc = new Document(adminLoginRoot);
				try {
					this.objectToServer.writeObject(adminLoginDoc);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Detect what is the selected language at present
	 * 
	 * @return true for Chinese, false for English
	 */
	public boolean isChinese() {
		return chinese;
	}

	/**
	 * Change the selected language
	 * 
	 * @param chinese
	 *            true for Chinese, false for English
	 */
	public void setChinese(boolean chinese) {
		this.chinese = chinese;
	}

	/**
	 * Method to let administrator connect to server
	 */
	private void connectToServer() {
		try {
			socket = new Socket("localhost", 3333);

			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());

			objectToServer = new ObjectOutputStream(socket.getOutputStream());
			objectFromServer = new ObjectInputStream(socket.getInputStream());

			System.out.println("connection estiblished");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Server doesn't start");
			e.printStackTrace();
		}
	}

	/**
	 * Send request to server to check whether a given account is online
	 * 
	 * @param account
	 *            a given account
	 * @return true if not online, otherwise is false
	 */
	public boolean isOnline(String account) {
		boolean result = false;
		// to tell every client new client leaves
		Element checkOnlineRoot = new Element("message");
		Element checkOnlineCommand = new Element("command");
		checkOnlineCommand.setAttribute("type", "CheckAdminIsOnline");
		checkOnlineCommand.addContent(new Element("account").setText(account));
		checkOnlineRoot.addContent(checkOnlineCommand);
		Document checkOlineDoc = new Document(checkOnlineRoot);
		try {
			this.objectToServer.writeObject(checkOlineDoc);
			result = this.fromServer.readBoolean();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public void logout() {
		Element root = new Element("message");
		// level one content
		Element command = new Element("command");
		command.setAttribute("type", "AdminLogout");
		command.addContent(new Element("account").setText(account));
		root.addContent(command);
		// this field will store the whole message in XML format
		Document doc = new Document(root);
		try {
			objectToServer.writeObject(doc);
			// close connection
			this.fromServer.close();
			this.toServer.close();
			this.objectFromServer.close();
			this.objectToServer.close();
			this.socket.close();
		} catch (IOException ex) {

		}
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
