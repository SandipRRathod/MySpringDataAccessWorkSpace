package sandip12.springOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sandip12.springOrm.dao.studentDao;
import sandip12.springOrm.entity.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con= new ClassPathXmlApplicationContext("sandip12/springOrm/config.xml");
        
        studentDao stdao =(studentDao) con.getBean("studentDao");
        
        Student std = new Student();
        std.setId(9);
        std.setName("sandip");
        std.setPhone(76668836);
        
       int r = stdao.insert(std);
        
       System.out.println("done "+ r);
    }
}
