import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","1","2","3");
        Object[] array = list.stream().toArray();
        
        //convert collection to Arrays
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
