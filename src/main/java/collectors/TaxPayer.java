package collectors;

import java.util.List;
import java.util.stream.Collectors;

public class TaxPayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxPayersDetails();
	}
	public static void taxPayersDetails()
	{
		List<Employee> empdet=EmpDetails.empDetails();
        List<Employee> Taxpayers=empdet.stream().filter( emp->emp.getEmpSal()>500000).collect(Collectors.toList());
		System.out.println(Taxpayers);
	}

}
