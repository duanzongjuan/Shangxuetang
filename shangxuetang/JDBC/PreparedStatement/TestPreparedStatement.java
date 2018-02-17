import java.sql.*;

public class TestPreparedStatement {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Parameter Error!Please Input Again!");
			System.exit(-1);
		}
		
		int deptno = 0;
		try {
			
		} catch(NumberFormatException e) {
			System.out.println("Parameter Error!Deptno should be Number Format!");
			System.exit(-1);
		}
		String dname = args[1];
		String loc = args[2];
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			pstmt = (PreparedStatement)conn.prepareStatement("insert into dept values(?,?,?)");
			
			pstmt.setInt(1,deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);
			
			pstmt.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
					pstmt = null;
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
