import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,12,10,9,30,20,21,22);

        List<Integer> collect = list.stream().filter(x->x%2==0).collect(Collectors.toList());

        int size = list.stream().filter(x->x%2==0).collect(Collectors.toList()).size();
        System.out.println(size);
        System.out.println(collect);

        //find min object in stream
        Optional<Integer> minimum = list.stream().min((val1,val2)->{return val1.compareTo(val2);});
        System.out.println("Minimum Value is: "+minimum.get());
        
        //find max object in stream
        Optional<Integer> maximum = list.stream().max((val1,val2)->{return val1.compareTo(val2);});
        System.out.println("maximum Value is: "+maximum.get());

        //withour return statement 
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println("Minimum Value is : "+min.get());

        
    }
}
