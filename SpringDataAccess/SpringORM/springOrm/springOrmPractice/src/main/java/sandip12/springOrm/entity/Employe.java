package sandip12.springOrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myinfo")

public class Employe  {
	@Id
	@Column(name="empid")
private String empid;
	@Column(name="empname")
private String empName;
	
	
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}


public Employe() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return  " "+empid + "\t\t"+ empName +"\n" ;
}

	
}
