package com.cxcollie.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcUrl = "jdbc:mysql://aar02ikswe8nxu.cj5kik5rd5qf.us-east-1.rds.amazonaws.com:3306/ebdb";
		String user = "uidrivedatabase";
		String pwd = "woaishuati";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pwd);
			
			out.println("Connection successful!!");
			
			myConn.close();
		} catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
