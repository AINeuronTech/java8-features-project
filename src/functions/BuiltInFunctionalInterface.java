package functions;

import java.util.List;
import java.util.Map;

public class BuiltInFunctionalInterface {

    public static void displayMessage(String msg){
        System.out.println(msg);
    }
    public static void displayNumber(int num){
        System.out.println(num);
    }

    public static void showProfiles(Map<String,Integer> map, String profile){
        System.out.println(profile + " profiles");
        map.forEach((key,val)-> System.out.println(key + " " + val));
    }

    public static Integer addList(List<Integer> list){
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

}
