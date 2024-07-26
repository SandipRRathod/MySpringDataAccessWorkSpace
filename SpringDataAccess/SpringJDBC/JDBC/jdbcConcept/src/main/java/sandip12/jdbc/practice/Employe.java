package sandip12.jdbc.practice;


import org.springframework.stereotype.Component;

@Component
public class Employe {
	
private int empId;
	
private String fname;
	
private float salary;


public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employe [empId=" + empId + ", fname=" + fname + ", salary=" + salary + "]";
}

}
