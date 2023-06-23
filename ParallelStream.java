import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    Integer score;

    public Student(String name,Integer score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public Integer getScore(){
        return this.score;
    }
}

public class ParallelStream {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Michael Moix", 92),
            new Student("Matt Devidson", 93),
            new Student("Ram Kadam", 35),
            new Student("Eknath Shinde", 23),
            new Student("Bob Rakshe", 85),
            new Student("Greg Patil", 75));


            //Using stream Sequential Operation 
        list.stream().filter(x->x.getScore()>=70)
                     .limit(3)
                     .forEach(student->System.out.println(student.getName()+" "+student.getScore()));

            //Using ParallelStream
        list.parallelStream().filter(x->x.getScore()>=70)
                     .limit(3)
                     .forEach(student->System.out.println(student.getName()+" "+student.getScore()));

            //convert stream() -> parallelStream()
            //parallel()
        list.stream().parallel().filter(x->x.getScore()>=70)
                     .limit(3)
                     .forEach(student->System.out.println(student.getName()+" "+student.getScore()));

    }
}
