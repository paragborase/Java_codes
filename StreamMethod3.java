import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("One","Two","Three","Four","Five");

        //findAny
        //If Empty Collection then NoSuchElementException
        Optional<String> findAny = stringList.stream().findAny();
        System.out.println(findAny.get());

        //findFirst
        Optional<String> findFirst = stringList.stream().findFirst();
        System.out.println(findFirst.get());
    }
}
