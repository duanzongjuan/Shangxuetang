import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestTransaction {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			
			//�˻�ת������,����ֻ����һ����.
			conn.setAutoCommit(false); //�Զ��ύ
			stmt = (Statement)conn.createStatement();
			stmt.addBatch("insert into dept values(105,'W','w')");
			stmt.addBatch("insert into dept values(106,'P','p')");
			stmt.addBatch("insert into dept values(107,'Q','q')");
			stmt.executeBatch();    //ִ��
			conn.commit();  
			conn.setAutoCommit(true);
			
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
			try {
				if(conn != null) {
					conn.rollback();  //�ع�
					conn.setAutoCommit(true);  
				}
			} catch(SQLException e1) {
				e1.printStackTrace();
			} 
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
