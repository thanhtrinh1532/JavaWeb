package trinh.dev;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		final String DB_URL = "jdbc:mysql://localhost:3306/shop";
		final String USER = "root";
		final String PASS = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.print("Connect thanh cong!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
