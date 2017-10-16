import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by anil.banoth on 2017-06-15.
 */
public class LambdaExamples {
    public static void main(String[] args){
        List<Developer> developers = getDevelopers();

       /* Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });*/
        //developers.stream().
       developers.forEach(o1 -> System.out.println(o1.getName() + " " + o1.getAge()));

       developers.forEach(o1 -> {
           int age = 0;
           if("Anil".equalsIgnoreCase(o1.getName())){
               System.out.println(" Age is not correct");
               age = o1.getAge() + 1;
               System.out.println(" Correct age is " + age);
           }
       });

        //developers.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        //developers.removeIf()
        developers.sort(Comparator.comparingInt(Developer::getAge).thenComparing(Developer::getName));
        //developers.sort((o1,o2)->o2.getAge() - o1.getAge());


        //Lamda example
       // developers.forEach(o1-> System.out.println(o1.getAge()));

        //Method reference example
       // developers.forEach(System.out::println);

        //developers.sort(Comparator.comparing(Developer::getName));
        /*for(Developer developer : developers){
            System.out.println(" Name : " + developer.getName());
        }*/
    }

    private static List<Developer> getDevelopers() {
        List<Developer> developerList = new ArrayList<Developer>();
        developerList.add(new Developer("Anil",31));
        developerList.add(new Developer("Ram",30));
        developerList.add(new Developer("Chait",32));
        developerList.add(new Developer("Bharat",32));
        developerList.add(new Developer("Ravi",32));
        developerList.add(new Developer("Vish",33));
        return developerList;
    }
}

