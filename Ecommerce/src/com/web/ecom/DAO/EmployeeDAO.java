package com.web.ecom.DAO;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.web.ecom.model.Employee;

public class EmployeeDAO {
private HibernateTemplate template;
private JdbcTemplate jdbcTemplate;

public void setTemplate(HibernateTemplate template){
	this.template = template;
}

public HibernateTemplate getTemplate(){
	return this.template;
}

public JdbcTemplate getJdbcTemplate(){
	return this.jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate template){
	this.jdbcTemplate = template;
}
public int saveEmployee(Employee e){
	int i = jdbcTemplate.update("insert  into employee values("+e.getId()+",'"+e.getName()+"',"+e.getSalary()+")");
	return i;
}

public List<Employee> getEmployeeById(int id){
	List<Employee> list = jdbcTemplate.query("select * from employee where id="+id+"", new BeanPropertyRowMapper(Employee.class));
	return list;
}

}
