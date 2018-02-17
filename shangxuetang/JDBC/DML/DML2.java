import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DML2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.println("Parameter Error!Please Input Again");
			System.exit(-1);
		}
		int deptno = 0;
		try {
			deptno = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.out.println("Parameter Error!Deptno should be Number Format!");
			System.exit(-1);
		}
		
		String dname = args[1];
		String loc = args[2];
		
		Statement stmt = null;
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			stmt = (Statement)conn.createStatement();
			
			String sql = "insert into dept values (" + deptno + ",'" + dname + "','" + loc +"')";
			System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}
