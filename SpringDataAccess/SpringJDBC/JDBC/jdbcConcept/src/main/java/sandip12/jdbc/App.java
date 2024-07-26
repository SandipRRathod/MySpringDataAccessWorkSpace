package sandip12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;


public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// for only jdbc in advance java
		
//Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sandip12", "root", "sandip");
//		
//		
//		PreparedStatement ps =con.prepareStatement("insert into sandip(id,name) values(1,'sandip')");
//		
//
//		ps.executeUpdate();
//		
//		
//		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sandip");
		
		
		PreparedStatement ps =con.prepareStatement("select * from StudentDetail");
		
 ResultSet rs= ps.executeQuery();
		
		while (rs.next()) {
		
			System.out.println(rs.getString("name"));
			
		}
		
		
		
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/jdbc/student.xml");
//		// System.out.println(context.getBean("StudentInfo"));
//
//		JdbcTemplate temp = (JdbcTemplate) context.getBean("studentInfo");
//		
////		
//		
//		
//		
		
		
		
		
		
		
		// for isertion opration 
		
//		String query1="insert into student() values(?,?,?)";
//		
//			System.out.println("rows affected "+temp.update(query1,3,"pradip Rathod","Pathrud"));
//		
		
		
		
		
		// for deletion opration
		
//		String query2="update student set name=? where name=?";
//		System.out.println(temp.update(query2,"SANDIP RATHOD","hfjj"));
		
		
		//for deletion opration
//		String query3="delete from student where id=?";
//		
//		System.out.println(temp.update(query3,4));
//		
		
		//for select opration 
//		System.out.println("id\tname\t\tcity");
//		String query4="select * from student";
//		//temp.query(query4, new studentRowMapper());
//		System.out.println(temp.query(query4, new studentRowMapper()));
//		
//		
//		
	}

}
