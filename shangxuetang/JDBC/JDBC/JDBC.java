import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//实例化时自动向DriverManager注册,不需要显示调用DriverManager.registerDriver()方法
			Class.forName("com.mysql.jdbc.Driver");  
			// new com.mysql.jdbc.Driver();
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			stmt = (Statement)conn.createStatement();
			rs = (ResultSet)stmt.executeQuery("select * from dept"); //rs类似游标
			while(rs.next()) {
				System.out.println(rs.getString("deptno"));
				System.out.println(rs.getInt("deptno"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
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
