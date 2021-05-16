
public class Employee {
private int id;
private String name;
private String technology;

public Employee(int id, String name, String technology) {
	super();
	this.id = id;
	this.name = name;
	this.technology = technology;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
@Override
	public int hashCode() {
		int result = 10;
		result = 2*result+ id;
		result = 2*result+name.hashCode();
		result = 2*result+technology.hashCode();
		return result;
	}

@Override
	public boolean equals(Object obj) {
	if (obj == this) return true;
    if (!(obj instanceof Employee)) {
        return false;
    }

    Employee user = (Employee) obj;

    return user.name.equals(name) &&
            user.id == id &&
            user.technology.equals(technology);
	}
	
}
