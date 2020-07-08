package java8prj;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Supplier;

public class Suplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello to java world";
				Suplier.suplrTst(str);
	}
	static void suplrTst(String s)
	{
		//Supplier<String> suplr=()->s;
		List<String> lst=Arrays.asList("a","b");
		String s1=lst.stream().findAny().orElseGet(()->s);
		System.out.println(s1);
	}
}
