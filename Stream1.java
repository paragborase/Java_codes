import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("car","cycle","bike","Motor","Car","car","Train","Air-Plane");

        //distinct
        List<String> uniqueList = list1.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueList);

        //forEach
        list1.stream().distinct().forEach(x->System.out.print(x+" "));
        System.out.println();

        //distinct
        long count = list1.stream().distinct().count();
        System.out.println(count);

        //limit
        List<String> collect = list1.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
}}
