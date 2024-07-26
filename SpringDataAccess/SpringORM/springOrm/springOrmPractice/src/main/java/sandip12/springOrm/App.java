package sandip12.springOrm;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sandip12.springOrm.dao.empDao;
import sandip12.springOrm.entity.Employe;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("sandip12/springOrm/practice.xml");

		empDao emp1 = (empDao) con.getBean("empDao");

		Employe emp = new Employe();

//    emp.setEmpName("sandiphhjfvjvj");
//    emp1.update(emp);
//   System.out.println(emp);
//  
		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {

			System.out.println("Enter 1 For Add Employe");
			System.out.println("Enter 2 For Delete Employe");
			System.out.println("Enter 3 For Update Employe");
			System.out.println("Enter 4 For Show Employes");
			System.out.println("Enter 5 For Exit");

			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter Id ");
				String id = sc.next();
				System.out.println("Enter Name ");
				String name = sc.next();
				emp.setEmpid(id);
				emp.setEmpName(name);
				System.out.println("Student Enterd " + emp1.insert(emp));
				break;
			case 2:
				System.out.println("Enter Id For Delete ");
				String id2 = sc.next();
				System.out.println(emp1.delete(id2));
				break;
			case 3:
				System.out.println("Enter Id For Update ");
				String id3 = sc.next();
				System.out.println("Enter Name ");
				emp.setEmpid(id3);
				String name1 = sc.nextLine();
				emp.setEmpName(name1);
				emp1.update(emp);
				System.out.println("Student Updated " + emp);
				break;

			case 4:
				System.out.println("\nEmployeId\tEmployeName\n" + emp1.getEmp());
				break;

			case 5:
				exit = true;
				break;
			}
		}
		System.out.println("You Exited Succesfully..");

	}
}
