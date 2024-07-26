package sandip12.jdbc.practice.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("sandip12/jdbc/practice/application/student.xml");

JdbcTemplate temp = (JdbcTemplate) con.getBean("HomeDetils");


String q1="insert into Home() values(?,?,?)";
//temp.update(q1,"Raju Rathod","Janabai Rathod","Pradip Rathod");

String q2="select * from Home";
System.out.println(temp.query(q2, new mapper()));

String q3="delate from Home where id=?";
//System.out.println(temp.update(q3,"null"));

	}

}
