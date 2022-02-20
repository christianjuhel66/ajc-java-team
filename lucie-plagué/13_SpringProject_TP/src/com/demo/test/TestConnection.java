package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/bdd_hibernate_myProject?serverTimezone=UTC";
		String user = "padawan";
		String password = "padawan";

		try {
			System.out.println("Connection to database " + jdbcUrl);

			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

			System.out.println("Connection successful !");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
