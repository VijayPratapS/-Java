package Optional;

import java.util.Optional;

public class Optionalex {
    public static void main(String[] args) {
        //  List<Integer> lst= Arrays.asList(1,3,5,4,6,76778);
        Optional<String> optional=Optional.empty();
        String str=null;
        optional=optional.ofNullable(str);
        System.out.println(optional.orElse("java9").toUpperCase());
    }
}
