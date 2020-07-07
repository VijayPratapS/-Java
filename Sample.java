package java8prj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
  public static void main(String...args)
  {
	List<Integer> lst=Arrays.asList(1,5,64,6,4);
	lst.forEach( t-> System.out.println(t));
	Map<Integer,String> map=new HashMap();
	map.put(1,"vijay");
	map.put(4,"hello");
	map.put(3,"whats up");
	map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(t->System.out.println(t));
	
  }
}
