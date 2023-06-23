import java.util.HashSet;
import java.util.Set;

public class StreamMethod2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Two Mango");
        set.add("One Apple");
        set.add("Four Banana");
        set.add("Five Graphs");

        //anyMatch at leat one value must be match then true
        boolean anyMatch = set.stream().anyMatch(value->value=="Two Mango");
        System.out.println(anyMatch);

        boolean anyMatch1 = set.stream().anyMatch(value->{return value.startsWith("One");});
        System.out.println(anyMatch1);

        //allMatch  All Must be match then only true
        boolean allMatch = set.stream().allMatch(value->{return value.startsWith("T");});
        System.out.println(allMatch);

        //noneMatch
        boolean noneMatch = set.stream().noneMatch(value->{return value.startsWith("A");});
        System.out.println(noneMatch);
    }
}
