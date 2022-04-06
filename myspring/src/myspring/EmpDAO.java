package myspring;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpDAO {

	@Autowired
	SqlSession session;

	public List<EmpVO> getEmpListByDeptId(int deptId) throws Exception  {
		return session.selectList("getEmpListByDeptId", deptId);

//	      ArrayList<EmpVO> result = new ArrayList<EmpVO>();
//
//	      Class.forName("com.mysql.cj.jdbc.Driver");
//	      Connection con = DriverManager.getConnection(
//	            "jdbc:mysql://localhost/hr","root","0000");
//	      String sql = "select * from employees";
//	      Statement stmt = con.createStatement();
//	      ResultSet rs = stmt.executeQuery(sql);
//	      while(rs.next()) {
//	         //EmpVO객체를 만들고 객체변수에 데이터베이스의 데이터로 설정하고
//	         EmpVO vo = new EmpVO();
//	         vo.employeeId = rs.getInt("employee_id");
//	         vo.lastName = rs.getString("last_name");
//	         result.add(vo);
//
//	      }
//
//	      return result;
	 }

}