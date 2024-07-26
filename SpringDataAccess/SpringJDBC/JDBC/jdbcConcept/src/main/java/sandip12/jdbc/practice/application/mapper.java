package sandip12.jdbc.practice.application;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class mapper implements RowMapper<home>{

	@Override
	public home mapRow(ResultSet rs, int rowNum) throws SQLException {
		home hmm= new home();
		hmm.setFName(rs.getString("Fname"));
		hmm.setMName(rs.getString("Mname"));
		hmm.setBName(rs.getString("Bname"));
		return hmm;
	}

}
