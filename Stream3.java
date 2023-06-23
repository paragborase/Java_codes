import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","1","2","3");

        String reduce = list.stream().reduce("", (a,b)->{return b+a;});
        System.out.println(reduce);
        
        //reduce Method
        List<Integer> list1 = Arrays.asList(12,13,10,9,10,20,9);
        Integer reduce1 = list1.stream().reduce(0,(a,b)->(a+b));
        System.out.println(reduce1);
    }
}
