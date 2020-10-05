package org.techouts.app.problem1;

import java.util.List;

public class Company {

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employeeID=" + employeeID + ", employeeName=" + employeeName
				+ ", list=" + list + "]";
	}
	String companyName;
	int employeeID ;
	String employeeName;
	List list ;

	public Company(String companyName, int employeeID, String employeeName, List list) {
		super();
		this.companyName = companyName;
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.list = list;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
