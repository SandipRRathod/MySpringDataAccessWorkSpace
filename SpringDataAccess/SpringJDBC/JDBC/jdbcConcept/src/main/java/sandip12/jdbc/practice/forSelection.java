package sandip12.jdbc.practice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class forSelection implements RowMapper<Employe> {

	@Override
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employe newEmp= new Employe();
		newEmp.setEmpId(rs.getInt("empId"));
		newEmp.setFname(rs.getString("fname"));
		newEmp.setSalary(rs.getFloat("salary"));
		return newEmp;
	}

}
