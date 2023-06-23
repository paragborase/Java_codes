import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        //Map   
        List<Integer> list = Arrays.asList(12,11,10,14,71,32);
        List<Integer> collect = list.stream().map(x->x+10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);


        //FlatMap
        List<Integer> list1 = Arrays.asList(11,12);
        List<Integer> list2 = Arrays.asList(13,14);
        List<Integer> list3 = Arrays.asList(15,16);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);

        List<Integer> collect2 = finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
