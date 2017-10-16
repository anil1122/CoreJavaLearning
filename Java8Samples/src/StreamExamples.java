import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anil.banoth on 2017-06-15.
 */
public class StreamExamples {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Anil","Vish","Ram","Rag");
        names.stream().filter(name -> !name.equals("Anil")).collect(Collectors.toList());
        names.forEach(name -> printName(name));
    }

    private static void printName(String name) {
        System.out.println(" "+ name);
    }

    private String printNames(){
        List<String> names = Arrays.asList("Anil","Kumar","banoth");
        names.forEach(System.out::println);
        return null;
    }
}
