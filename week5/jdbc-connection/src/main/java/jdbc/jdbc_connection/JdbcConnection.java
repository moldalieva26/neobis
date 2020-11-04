package jdbc.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;

	
	public static void main(String[] args) {
		// jdbc - protocol // mysql - driver manager // localhost - server name or IP // 3306 server port // furniture_shop DB name
		String url = "jdbc:mysql://localhost:3306/furniture_shop?serverTimezone=UTC"; 
		String username = "root";
		String password = "Newlife2019";
		
		String customerTable = "CREATE TABLE `customer` (\n" + 
				"  `id` BIGINT,\n" + 
				"  `first_name` VARCHAR(100),\n" + 
				"  `last_name` VARCHAR(100),\n" + 
				"  `email` VARCHAR(150),\n" + 
				"  `phone_number` VARCHAR(100),\n" + 
				"  `address_line1` VARCHAR(100),\n" + 
				"  `address_line2` VARCHAR(100),\n" + 
				"  `city` VARCHAR(100),\n" + 
				"  `province` VARCHAR(100),\n" + 
				"  `country` VARCHAR(100),\n" + 
				"  `postal_code` INT\n" + 
				")";
		
		String customer1 = "INSERT INTO  customer (id, first_name, last_name)\n" + 
						   "values (123456, 'Meerim', 'Moldali');";
		
		String customer2 = "INSERT INTO  customer (id, first_name, last_name)\n" + 
				   "values (123450, 'Max', 'Osmon');";
		
		try {
			// make JDBC con to MySQL DB
			Class.forName("com.mysql.cj.jdbc.Driver");
			log("registered");
			//Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);
			log("Successful connection");

			statement = connection.createStatement(); 
			log("Successful statement");

			
			//statement.executeUpdate(customerTable);
			//statement.executeUpdate("DROP TABLE customers");
			//log("Created customer table");
			
			//statement.executeUpdate(customer2); // executeUpdate - creates and adds tables, data
			
			statement.executeUpdate("UPDATE customer SET first_name = 'Masha' WHERE id = 123453");
			statement.executeUpdate("DELETE FROM customer WHERE id = 123456");

			resultSet = statement.executeQuery("SELECT * FROM customer");
			
			while(resultSet.next()) {
				log(resultSet.getString(1) + " " + resultSet.getString(7) + " " + resultSet.getString(8)); 
		

			}
			

			log("Success");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			log("ClassNotFoundException");
		} catch (SQLException e) {
			log("SQLException");
			e.printStackTrace();
		}	
		
			
	}
	
	public static void log(String str) {
		System.out.println(str);
	}

}
