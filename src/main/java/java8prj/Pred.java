package java8prj;

import java.util.function.Predicate;

public class Pred {

	public static void main(String[] args) {
		Pred.ageChck( 8);
	}
	static void ageChck (int n)
	{
		Predicate<Integer> pr= t -> t>=18;
		System.out.println(pr.test( n));
	}
}
