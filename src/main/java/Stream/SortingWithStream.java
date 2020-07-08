package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingWithStream {
	public static void main(String...args)
	{
		List<String> srt=new ArrayList();
		srt.add( "vijay");
		srt.add( "java");
		srt.add( "mysql");
		srt.stream().sorted(Comparator.naturalOrder()).forEach(t->System.out.println(t));
	}

}
