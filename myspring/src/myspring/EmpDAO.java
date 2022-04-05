package myspring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	   public List<EmpVO> getEmpListByDeptId(int deptId) throws Exception  {
	      ArrayList<EmpVO> result = new ArrayList<EmpVO>();

	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/hr","root","0000");
	      String sql = "select * from employees";
	      Statement stmt = con.createStatement();
	      ResultSet rs = stmt.executeQuery(sql);
	      while(rs.next()) {
	         //EmpVO객체를 만들고 객체변수에 데이터베이스의 데이터로 설정하고
	         EmpVO vo = new EmpVO();
	         vo.employeeId = rs.getInt("employee_id");
	         vo.lastName = rs.getString("last_name");
	         result.add(vo);

	      }

	      return result;
	   }

	}