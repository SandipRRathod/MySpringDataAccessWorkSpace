package sandip12.springOrm.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.orm.hibernate5.HibernateTemplate;

import sandip12.springOrm.entity.Employe;

public class empDao {

	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public String insert(Employe emp){
	 
	String i = (String) this.hibernateTemplate.save(emp);
		return i;
		
	}
	
	@Transactional
	public String delete(String empId ) {
	 Employe emp1= this.hibernateTemplate.get(Employe.class, empId);
	this.hibernateTemplate.delete(emp1);
	return "deleted";
	}
	
	
	public List<Employe>  getEmp(){
		List<Employe> Emps= (List<Employe>) this.hibernateTemplate.loadAll(Employe.class);
		return Emps;
	}
	
	@Transactional
	public void update(Employe emp) {
	 this.hibernateTemplate.update(emp);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public empDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
