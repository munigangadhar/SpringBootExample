import java.util.HashMap;

public class HashMapDuplicates {
public static void main(String[] args) {
	HashMap<Employee,Integer> hmap = new HashMap<Employee,Integer>();
	Employee emp = new Employee(1,"Muni","Java");
	Employee emp1 = new Employee(1,"Muni","Java");
	Employee emp2 = new Employee(2,"Muni","Java");
	System.out.println(emp.equals(emp1));
	System.out.println(emp1.equals(emp2));
	hmap.put(emp,1);
	hmap.put(emp1,2);
	hmap.put(emp2,3);
	System.out.println(hmap.size());
}
}
