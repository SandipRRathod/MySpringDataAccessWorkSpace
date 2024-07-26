package sandip12.jdbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con= new  AnnotationConfigApplicationContext(xmlforEmp.class);
 
JdbcTemplate temp = (JdbcTemplate) con.getBean("jdbcTemplate");

// for inserting opration 
// String q1="insert into emp() values(?,?,?)";
//System.out.println(temp.update(q1,1,"SandipRathod",35000.0));


//for selecting opration in sql 

String q2 ="select * from emp";
System.out.println(temp.query(q2,new forSelection()));


	}

}
