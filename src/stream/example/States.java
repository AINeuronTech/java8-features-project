package stream.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class States {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("NY","CA","PA","FL","NH","NY");
        System.out.println("iterate using Iterator");
        Iterator it = cities.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("iterate using for each loop");
        for(String state:cities){
            System.out.println(state);
        }

        System.out.println("iterate using stream api");
        cities.stream()
                .filter(name -> name.startsWith("N"))
                .forEach(city -> System.out.println(city));

        System.out.println("filtered state, then make new list using collector");
        List<String> filteredState = cities.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(filteredState);

        System.out.println("filtered state,then make unique set using collector");
        Set<String> uniqueState = cities.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toSet());
        System.out.println(uniqueState);


    }
}
