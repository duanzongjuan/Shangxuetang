import java.sql.*;
public class TestScroll {
	public static void main(String[] args) {
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("select * from dept order by deptno");
			rs.next();
			System.out.println(rs.getInt(1));
			rs.last();
			System.out.println(rs.getString(1));
			System.out.println(rs.isLast());
			System.out.println(rs.isAfterLast());
			System.out.println(rs.getRow());
			rs.previous();
			System.out.println(rs.getString(1));
			rs.absolute(6);
			System.out.println(rs.getString(1));
			rs.close();
			conn.close();
			stmt.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
