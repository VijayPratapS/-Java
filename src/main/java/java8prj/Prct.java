package java8prj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prct {

	public static void main(String[] args) {
		List<String> val=new ArrayList();
		for(int i=0;i<10;i++)
		{
			val.add(Integer.toString(i) );
		}
		val.forEach( (i)->System.out.println(i));
		}
	}
