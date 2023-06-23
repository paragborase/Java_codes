import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamMethod4 {
    public static void main(String[] args) {
        List<String> animalList = Arrays.asList("Tiger","Elephant","Deer","Lion","Dog");
        List<String> birdList = Arrays.asList("Owl","Parrot","Peacock","KingFisher","Peacock");


        //concatinate Mulitple Stream
        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = birdList.stream();

        List<String> list = Stream.concat(stream1,stream2).collect(Collectors.toList());

        System.out.println(list);

        for(String item: list){
            System.out.println(item);
        }

        
    }
}
