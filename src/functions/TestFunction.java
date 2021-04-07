package functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        Consumer<String> consumer1 = BuiltInFunctionalInterface::displayMessage;
        consumer1.accept("too much sugar is bad for human body");

        Consumer<Integer> consumer2 = BuiltInFunctionalInterface::displayNumber;
        consumer2.accept(100);

        Map<String,Integer> map = new HashMap<>();
        map.put("John", 101);
        map.put("Bob", 102);

        BiConsumer<Map<String,Integer>, String> biConsumer3 = BuiltInFunctionalInterface::showProfiles;
        biConsumer3.accept(map,"student");

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(500);

        Function<List<Integer>,Integer> function = BuiltInFunctionalInterface::addList;
        int addResult = function.apply(list);
        System.out.println(addResult);

        BiFunction<Integer,Integer,Integer> multiply = (a,b) -> a*b;
        int multiplyResult = multiply.apply(30,90);
        System.out.println(multiplyResult);
    }
}
