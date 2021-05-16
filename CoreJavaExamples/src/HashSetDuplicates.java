import java.util.HashSet;

public class HashSetDuplicates {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee emp = new Employee(1,"Muni","Java");
		hs.add(new Employee(1,"Muni","Java"));
		hs.add(new Employee(1,"Muni","Java"));
		hs.add(emp);
		hs.add(emp);
		System.err.println(hs.size());
		
	}

}
