package sandip12.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;





public class studentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student newstd = new Student();
		
		newstd.setId(rs.getInt("id"));
		newstd.setName(rs.getString("name"));
		newstd.setCity(rs.getString("city"));
		
		return newstd;
	}

}
