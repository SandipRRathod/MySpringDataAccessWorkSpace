package sandip12.springOrm.entity;

import javax.persistence.Column;
import javax.persistence.Id;



@javax.persistence.Entity
@javax.persistence.Table(name="studentInfo")
public class Student {
	
	@Id
	@Column(name="student_id")
	private int id;
	@Column(name="student_name")
    private String name;
	@Column(name="student_phone")
	private int phone;
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int i) {
		this.phone =  i;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	public void setPhone(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
