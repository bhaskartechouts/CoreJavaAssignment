package org.techouts.app.problem15;

public class Employee {

	String id ;
	String name;
	String mailId;
	public Employee(String id, String name, String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mailId=" + mailId + "]";
	}
	
}
