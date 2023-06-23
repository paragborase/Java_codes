import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,20,30,22,11,33);

        List<Integer> listNew = new ArrayList<Integer>();

        listNew = list.stream().map(a->a*3).collect(Collectors.toList());

        System.out.println(listNew);
    }
}
