package jdbc.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestConnection {
	
	static Connection connection = null;
	static Statement statement = null;
	
	public static void main(String[] arg) throws SQLException {
		makeJDBCConnection(); 
		
		// execute query
		statement = connection.createStatement();
		
		String sql = "CREATE TABLE insurances (\n" + 
				"    id INT AUTO_INCREMENT,\n" + 
				"    title VARCHAR(100) NOT NULL,\n" + 
				"    effectiveDate DATE NOT NULL,\n" + 
				"    duration INT NOT NULL,\n" + 
				"    amount DEC(10 , 2 ) NOT NULL,\n" + 
				"    PRIMARY KEY(id)\n" + 
				")";

		String createFurnitureTable = "CREATE TABLE furniture(\n" + 
				"furniture_id INT NOT NULL AUTO_INCREMENT,\n" + 
				"furniture_name VARCHAR(100) NOT NULL,\n" + 
				"price FLOAT,\n" + 
				"category_id INT,\n" + 
				"furniture_description  VARCHAR(300),\n" + 
				"in_stock BOOLEAN,\n" + 
				"PRIMARY KEY (furniture_id)\n" + 
				")";
		
		String dropInsurancesTable = "DROP TABLE insurances";
				
		statement.executeUpdate(dropInsurancesTable);
		log("Created a table");
		
		
		
	}
	
	private static void makeJDBCConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			log("MySQL JDBC Driver Registered");
		} catch (ClassNotFoundException e) {
			log("Sorry, coudn't find JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
			e.printStackTrace();
			return;
		}
 
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture?serverTimezone=UTC", "root", "Newlife2019");
			if (connection != null) {
				log("Connection Successful");
			} else {
				log("Failed to make connection!");
			}
		} catch (SQLException e) {
			log("MySQL Connection Failed!");
			e.printStackTrace();
			return;
		}

	}
	
	
	
	
	
	private static void log(String string) {
		System.out.println(string);
 
	}

}
