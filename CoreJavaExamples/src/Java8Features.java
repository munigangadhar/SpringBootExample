import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Sayable{  
     public void say();  
     @Override
     public boolean equals(Object obj);
}  
  
public class Java8Features{  
    public static void main(String[] args) {  
    
    List<Integer> numbersList = Arrays.asList(1,1,2,3,4,6,7,3,4,5,8);
    numbersList.stream().filter(i -> Collections.frequency(numbersList, i) >1)
    .collect(Collectors.toSet()).forEach(System.out::println);
    
    System.err.println("Max value is :"+numbersList.stream().mapToInt(v->v).max().getAsInt());
    System.err.println("Count value is :"+numbersList.stream().count());
    System.err.println("Sum value is :"+numbersList.stream().mapToInt(v->v).sum());
    System.err.println("Average Value is"+numbersList.stream().mapToInt(Integer::intValue).average().getAsDouble());
   
    numbersList.stream().collect(Collectors.toMap(Function.identity(), v->1,Integer::sum)).
    entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue()).map(x->x).
    forEach(System.out::println);
	numbersList.stream().collect(Collectors.toMap(Function.identity(), v->1,Integer::sum)).forEach((k,v)-> System.err.println(k+" ->"+v));
    }
   
}