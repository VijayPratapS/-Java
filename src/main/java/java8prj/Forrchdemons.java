package java8prj;
import java.util.Arrays;
import java.util.List;
public class Forrchdemons {

public static void main(String[] args) {
List<Integer> ls= Arrays.asList(1,2,3,4,5);
ls.forEach( (i)->System.out.println(i));
	}

}
/*class Cnsmr implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
}
}
*/