package oops;

public class Employee {
	private int empId;
	private String empName;
	private float bs,gs,allow,itax,ns;
	
	public void setEmployeeDetails() {
		empId=10;
		empName="sai";
		bs=50000.0f;
		allow=5000.0f;
		gs=bs+allow;
		itax=gs*0.10f;
		ns=gs-itax;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee ID and Name is" + empId+ " " + empName);
		System.out.println("net salary of the employee is" + ns);
	}

}
