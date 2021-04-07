package stream.example;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango","Banana","Barries","Lichi");
        System.out.println("iterate using for loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("iterate using for each loop");
        for(String fruit:list){
            if(fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }

        System.out.println("iterate using Stream for each loop");
        list.stream()
            .filter(fruit->fruit.startsWith("B"))
             .forEach(fruit->System.out.println(fruit));

    }
}
