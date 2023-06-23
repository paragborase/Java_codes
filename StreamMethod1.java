import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod1 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(11,12,14,17,21,12,11,10);

        //sort
        List<Integer> order = list.stream().sorted().collect(Collectors.toList()) ;
        System.out.println(order);

        //reverseOrder
        List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()) ;
        System.out.println(reverseOrder);

        //String
        List<String> stringList = Arrays.asList("Mercedeze","Toyota","Mahindra","TATA","Ford");

        List<String> stringSortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(stringSortedList);

        List<String> reversegSortedList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversegSortedList);
    }
}
