package collectors;

import java.util.ArrayList;
import java.util.List;
//sample Dao
public class EmpDetails
{
	static public List<Employee> empDetails()
	{
	List<Employee> emp=new ArrayList();
	emp.add(new Employee("Vijay",500000));
	emp.add(new Employee("Rahul",600000));
    emp.add(new Employee("Rakesh",400000));
    return emp;
}
}

