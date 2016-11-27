package edu.cn.qdc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {

	private String name;
	private String[] empName;
	private List<Employee> employeelist;
	private Set<Employee> employeeset;
	private Map<String,Employee> employeemap;
	private Properties pp;//properties 的使用，也算一种集合
	
 	public Properties getPp() {
		return pp;
	}

	public void setPp(Properties pp) {
		this.pp = pp;
	}

	public String[] getEmpName() {
		return empName;
	}

	public void setEmpName(String[] empName) {
		this.empName = empName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Set<Employee> getEmployeeset() {
		return employeeset;
	}

	public void setEmployeeset(Set<Employee> employeeset) {
		this.employeeset = employeeset;
	}

	public List<Employee> getEmployeelist() {
		return employeelist;
	}

	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}

	public Map<String,Employee> getEmployeemap() {
		return employeemap;
	}

	public void setEmployeemap(Map<String,Employee> employeemap) {
		this.employeemap = employeemap;
	}

}
