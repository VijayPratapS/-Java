package collectors;

import lombok.Data;

public @Data class Employee {
private String EmpName;
private int EmpSal;
public String toString()
{
	return "Name[ Empname "+EmpName+ " EmpSal "+ EmpSal+" ]";
}
public Employee(String Name,int sal)
{
	this.EmpName=Name;
	this.EmpSal=sal;
}
}