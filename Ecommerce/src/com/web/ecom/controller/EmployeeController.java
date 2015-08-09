package com.web.ecom.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.ecom.DAO.EmployeeDAO;
import com.web.ecom.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping("hello")
	public ModelAndView saveEmployee(HttpServletRequest req){
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int salary =Integer.parseInt(req.getParameter("salary"));
		
		Employee employee = new Employee(id,name,salary);
		int i =employeeDAO.saveEmployee(employee);
		ModelAndView model = new ModelAndView("result");
		model.addObject("empBean", employee);
		model.addObject("getUpdateInt", i);
		return model;
	}
	
	@RequestMapping("getid")
	
	public ModelAndView getEmployeeById(HttpServletRequest req){
		int id = Integer.parseInt(req.getParameter("id"));
		List<Employee> list = employeeDAO.getEmployeeById(id);
		ModelAndView model = new ModelAndView("result");
		model.addObject("listEmp", list);
		return model;
	}
}
