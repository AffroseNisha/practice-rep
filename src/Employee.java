import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
int id;
int salary;
String name,address;
public int getId() {
	return id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void setId(int id) {
	this.id = id;
}
}