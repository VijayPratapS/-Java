package ParallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,3,5,4,6,76778);
    lst.parallelStream().filter(t->t%2==0).forEach(System.out::println);
    }
}
