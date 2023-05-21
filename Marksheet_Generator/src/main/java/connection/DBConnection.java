package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con = null;

	private DBConnection() {
	}

	static {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##chetan2111", "chetan");

		} catch (Exception e) {
			e.printStackTrace();
		} // End of Catch

	}// End of Block

	public static Connection getCon() {
		return con;
	}

}
