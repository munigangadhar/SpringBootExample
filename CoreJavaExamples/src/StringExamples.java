import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExamples {
public static void main(String[] args) {
	String str = "abcaaabbccddde";
	String str1 = "apple";
	String str2 = "ape";
	List<Character> list1= str1.chars().mapToObj(x->(char)x).collect(Collectors.toList());
	List<Character> list2= str2.chars().mapToObj(x->(char)x).collect(Collectors.toList());
	list1.retainAll(list2);
	list1.forEach(System.out::print);
	list2.forEach(System.out::print);
	str.chars().mapToObj(x->(char)x).collect(Collectors.toList()).stream().
	collect(Collectors.toMap(Function.identity(), v->1,Integer::sum));
}
}
