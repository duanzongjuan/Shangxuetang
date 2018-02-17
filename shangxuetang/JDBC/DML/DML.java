import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			stmt = (Statement)conn.createStatement();
			String sql = "insert into dept values(99,'Z','z')";
			stmt.executeUpdate(sql);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
