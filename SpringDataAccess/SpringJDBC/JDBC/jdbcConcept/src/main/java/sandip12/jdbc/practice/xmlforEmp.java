package sandip12.jdbc.practice;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="sandip12.jdbc.practice.Employe")
public class xmlforEmp {

	    @Bean
	    public DataSource mysqlDataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/Employe");
	        dataSource.setUsername("root");
	        dataSource.setPassword("sandip");
	        return dataSource;
	}
	    
	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	    	JdbcTemplate temp= new JdbcTemplate();
	    	temp.setDataSource(mysqlDataSource());
			return temp;
	    }
	    

}
