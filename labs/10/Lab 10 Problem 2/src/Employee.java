public abstract class Employee {
 String name;
 double age;
 static double hourRate;
 public Employee(String name2, double age2, double hourRate2) {
	// TODO Auto-generated constructor stub
}
public abstract double salary(double hours);
 public String toString() {
 return "name= " + name + " age=" + age + " hourRate="
 + hourRate;
 }
}
