package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test03 {
	public static void main(String[] args) {
		
		String driver ="oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="SCOTT"; //madang  hr
		String pw ="TIGER";   //madang  hr
		
		//String sql = "select * from dept ";
		String sql = "select * from emp  where deptno = 10 ";
		System.out.println("******** JDBC TEST **********");
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;  //select 결과값
		int result = 0;       //dml의 결과 값
		
		try {
			//1. JDBC Driver 설치  : ojdbc6.jar classpath 
			//2. 드라이버 로딩
			Class.forName(driver);
			//3. DB로 연결  Connection 생성
			con =  DriverManager.getConnection(url, user, pw);
			//4. SQL 구문을 관리해 주는 관리 객체(Statement) 생성
			st = con.createStatement();
			//5. Sql 실행
            rs = st.executeQuery(sql);			
			//System.out.println(rs.getMetaData().getColumnCount());
			
			//6. 결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getString("sal")+"\t");
				System.out.print(rs.getString("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC DRiver 확인 필요");
		}catch (Exception e) {
            System.out.println(e.getMessage());
		}finally {
			//7. 자원 반납 
            try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("********* END **********");
	}
}




