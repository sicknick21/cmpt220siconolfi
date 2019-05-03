public class Manager extends Employee {

   String type, departmentName;

   public Manager(String name, double salary, String type,
           String departmentName) {
       super(name, salary, hourRate);
       this.type = type;
       this.departmentName = departmentName; }

public Manager(String string, int i, int j) {
	// TODO Auto-generated constructor stub
}

public String getType() {
       return type;
   }

   /**
   * @param type
   * the type to set
   */
   public void setType(String type) {
       this.type = type;
   }

 
   public String getDepartmentName() {
       return departmentName;
   }

   
   public void setDepartmentName(String departmentName) {
       this.departmentName = departmentName;
   }

  

@Override
public double salary(double hours) {

	return 0;
}

}